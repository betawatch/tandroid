package b2;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class s1 {
    public static final s1 b;
    public static final String c;
    public final e9.i0 a;

    static {
        e9.g0 g0Var = e9.i0.b;
        b = new s1(e9.a1.e);
        String str = e2.d0.a;
        c = Integer.toString(0, 36);
    }

    public s1(e9.a1 a1Var) {
        this.a = e9.i0.v(a1Var);
    }

    public final boolean a(int i10) {
        int i11 = 0;
        while (true) {
            e9.i0 i0Var = this.a;
            if (i11 >= i0Var.size()) {
                return false;
            }
            r1 r1Var = (r1) i0Var.get(i11);
            boolean[] zArr = r1Var.e;
            int length = zArr.length;
            int i12 = 0;
            while (true) {
                if (i12 >= length) {
                    break;
                }
                if (!zArr[i12]) {
                    i12++;
                } else if (r1Var.b.c == i10) {
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
        if (obj == null || s1.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((s1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
