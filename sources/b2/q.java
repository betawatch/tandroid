package b2;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class q {
    public static final q c = new q(new x1());
    public static final String d;
    public static final String e;
    public final int a = 0;
    public final int b = 0;

    static {
        String str = e2.l0.a;
        Integer.toString(0, 36);
        d = Integer.toString(1, 36);
        e = Integer.toString(2, 36);
        Integer.toString(3, 36);
    }

    public q(x1 x1Var) {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.a == qVar.a && this.b == qVar.b;
    }

    public final int hashCode() {
        return (((16337 + this.a) * 31) + this.b) * 31;
    }
}
