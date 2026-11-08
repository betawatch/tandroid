package aa;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class c0 {
    public String a;

    public static c0 a(h2.x xVar) {
        String str;
        xVar.O(2);
        int A = xVar.A();
        int i7 = A >> 1;
        int A2 = ((xVar.A() >> 3) & 31) | ((A & 1) << 5);
        if (i7 == 4 || i7 == 5 || i7 == 7 || i7 == 8) {
            str = "dvhe";
        } else if (i7 == 9) {
            str = "dvav";
        } else {
            if (i7 != 10) {
                return null;
            }
            str = "dav1";
        }
        StringBuilder m10 = com.google.android.recaptcha.internal.a.m(str);
        m10.append(i7 < 10 ? ".0" : ".");
        m10.append(i7);
        m10.append(A2 < 10 ? ".0" : ".");
        m10.append(A2);
        String sb2 = m10.toString();
        c0 c0Var = new c0();
        c0Var.a = sb2;
        return c0Var;
    }
}
