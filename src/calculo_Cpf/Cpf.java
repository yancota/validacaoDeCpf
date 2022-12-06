package calculo_Cpf;

import javax.swing.JOptionPane;

public class Cpf {
	public static void main(String[] args) {

		String x;
		int y = 0;
		int z = 1;
		int w = 1;
		int a = 0;
		int b, c, d;
		String vetA[] = new String[12];
		int vetB[] = new int[12];

		x = JOptionPane.showInputDialog("Insira O CPF: ");
		x = "9" + x;

		for (int i = 0; i <= 11; i++) {
			vetA[i] = x.substring(i, i + 1);
			vetB[i] = Integer.parseInt(vetA[i]);
		}

		for (int i = 10; i >= 2; i--) {
			b = (vetB[z] * i);
			y += b;
			z += 1;
		}
		c = 11 - (y % 11);
		if (c == 10 || c == 11) {
			c = 0;
		}

		for (int i = 11; i >= 2; i--) {
			b = (vetB[w] * i);
			a += b;
			w += 1;
		}
		d = 11 - (a % 11);
		if (d == 10 || d == 11) {
			d = 0;
		}

		if (c == vetB[10] && d == vetB[11] && x.length() == 12) {
			JOptionPane.showMessageDialog(null, "CPF VÁLIDO");
		} else {
			JOptionPane.showMessageDialog(null, "CPF INVÁLIDO");
		}
	}
}
