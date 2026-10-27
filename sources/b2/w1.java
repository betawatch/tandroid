package b2;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class w1 {
    public static final w1 b;
    public static final String c;
    public final f9.i0 a;

    static {
        f9.g0 g0Var = f9.i0.b;
        b = new w1(f9.s1.e);
        String str = e2.n0.a;
        c = Integer.toString(0, 36);
    }

    public w1(f9.s1 s1Var) {
        this.a = f9.i0.u(s1Var);
    }

    public final boolean a(int i10) {
        int i11 = 0;
        while (true) {
            f9.i0 i0Var = this.a;
            if (i11 >= i0Var.size()) {
                return false;
            }
            v1 v1Var = (v1) i0Var.get(i11);
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
