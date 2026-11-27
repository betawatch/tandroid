// default package

import java.util.Arrays;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public class ak1 extends fk1 {
    public final /* synthetic */ byte a = 1;
    public final Object b;

    public ak1(String str) {
        char[] charArray = str.toString().toCharArray();
        this.b = charArray;
        Arrays.sort(charArray);
    }

    @Override // fk1
    public final boolean b(char c) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return Arrays.binarySearch((char[]) obj, c) >= 0;
            default:
                return !((fk1) obj).b(c);
        }
    }

    @Override // fk1
    public final fk1 c() {
        switch (this.a) {
            case 1:
                return (fk1) this.b;
            default:
                return super.c();
        }
    }

    public final String toString() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                StringBuilder sb = new StringBuilder("CharMatcher.anyOf(\"");
                for (char c : (char[]) obj) {
                    sb.append(fk1.d(c));
                }
                sb.append("\")");
                return sb.toString();
            default:
                return ((fk1) obj) + ".negate()";
        }
    }

    public ak1(fk1 fk1Var) {
        this.b = fk1Var;
    }
}
