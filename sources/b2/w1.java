package b2;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class w1 {
    public static final w1 b;
    public static final String c;
    public final e9.n0 a;

    static {
        e9.l0 l0Var = e9.n0.b;
        b = new w1(e9.x1.e);
        String str = e2.l0.a;
        c = Integer.toString(0, 36);
    }

    public w1(e9.x1 x1Var) {
        this.a = e9.n0.u(x1Var);
    }

    public final boolean a(int i10) {
        int i11 = 0;
        while (true) {
            e9.n0 n0Var = this.a;
            if (i11 >= n0Var.size()) {
                return false;
            }
            v1 v1Var = (v1) n0Var.get(i11);
            boolean[] zArr = v1Var.e;
            int length = zArr.length;
            int i12 = 0;
            while (true) {
                if (i12 >= length) {
                    break;
                }
                if (!zArr[i12]) {
                    i12++;
                } else if (v1Var.b.c == i10) {
                    return true;
                }
            }
            i11++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || w1.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((w1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
