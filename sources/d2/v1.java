package d2;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class v1 {
    public static final v1 b;
    public static final String c;
    public final g9.i0 a;

    static {
        g9.g0 g0Var = g9.i0.b;
        b = new v1(g9.s1.e);
        String str = g2.n0.a;
        c = Integer.toString(0, 36);
    }

    public v1(g9.s1 s1Var) {
        this.a = g9.i0.q(s1Var);
    }

    public final boolean a(int i3) {
        int i10 = 0;
        while (true) {
            g9.i0 i0Var = this.a;
            if (i10 >= i0Var.size()) {
                return false;
            }
            u1 u1Var = (u1) i0Var.get(i10);
            boolean[] zArr = u1Var.e;
            int length = zArr.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    break;
                }
                if (!zArr[i11]) {
                    i11++;
                } else if (u1Var.b.c == i3) {
                    return true;
                }
            }
            i10++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v1.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((v1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
