package proje2;
import java.util.Scanner;

public class proje2_2 {

public static void main(String[] args) {	


	Scanner input =new Scanner(System.in);
	
    
    double mat,fizik,kimya,tarih,müzik,türkçe;

    System.out.println("matematik notunuz:");
    mat =input.nextDouble();

    System.out.println("fizik notunuz:");
    fizik =input.nextDouble();

    System.out.println("kimya notunuz:");
    kimya =input.nextDouble();

    System.out.println("tarih notunuz:");
    tarih =input.nextDouble();

    System.out.println("müzik notunuz:");
    müzik =input.nextDouble();
    
    System.out.println("türkçe notunuz:");
    türkçe =input.nextDouble();


    double ortalama =((mat+fizik+kimya+tarih+müzik+türkçe)/6);

    System.out.println("ortalama:"+ortalama);
    System.out.println(ortalama<=50? "kaldınız":"geçtiniz");

   }


	
}

