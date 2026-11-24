// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class du2 {
    public final /* synthetic */ byte a;
    public String b;

    public /* synthetic */ du2(String str, byte b) {
        this.a = b;
        this.b = str;
    }

    public static du2 a(yw7 yw7Var) {
        String str;
        yw7Var.O(2);
        int A = yw7Var.A();
        int i = A >> 1;
        byte b = 1;
        int A2 = ((A & 1) << 5) | ((yw7Var.A() >> 3) & 31);
        if (i == 4 || i == 5 || i == 7 || i == 8) {
            str = "dvhe";
        } else if (i == 9) {
            str = "dvav";
        } else {
            if (i != 10) {
                return null;
            }
            str = "dav1";
        }
        StringBuilder sb = new StringBuilder(str);
        sb.append(i < 10 ? ".0" : ".");
        sb.append(i);
        sb.append(A2 < 10 ? ".0" : ".");
        sb.append(A2);
        return new du2(sb.toString(), b);
    }

    public final String toString() {
        switch (this.a) {
            case 2:
                return "<" + this.b + '>';
            default:
                return super.toString();
        }
    }
}
