package b2;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class v1 {
    public static final v1 b;
    public static final String c;
    public final e9.n0 a;

    static {
        e9.l0 l0Var = e9.n0.b;
        b = new v1(e9.x1.e);
        String str = e2.m0.a;
        c = Integer.toString(0, 36);
    }

    public v1(e9.x1 x1Var) {
        this.a = e9.n0.u(x1Var);
    }

    public final boolean a(int i10) {
        int i11 = 0;
        while (true) {
            e9.n0 n0Var = this.a;
            if (i11 >= n0Var.size()) {
                return false;
            }
            u1 u1Var = (u1) n0Var.get(i11);
            boolean[] zArr = u1Var.e;
            int length = zArr.length;
            int i12 = 0;
            while (true) {
                if (i12 >= length) {
                    break;
                }
                if (!zArr[i12]) {
                    i12++;
                } else if (u1Var.b.c == i10) {
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
        if (obj == null || v1.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((v1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
