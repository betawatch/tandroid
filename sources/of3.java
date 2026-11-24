// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class of3 {
    public static final of3 c = new of3(new kg7(18));
    public static final String d;
    public static final String e;
    public final int a = 0;
    public final int b = 0;

    static {
        String str = hac.a;
        d = "1";
        e = "2";
    }

    public of3(kg7 kg7Var) {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof of3)) {
            return false;
        }
        of3 of3Var = (of3) obj;
        return this.a == of3Var.a && this.b == of3Var.b;
    }

    public final int hashCode() {
        return (((16337 + this.a) * 31) + this.b) * 31;
    }
}
