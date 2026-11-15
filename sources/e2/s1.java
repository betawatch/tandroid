package e2;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final class s1 {
    public static final s1 b;
    public static final String c;
    public final h9.i0 a;

    static {
        h9.g0 g0Var = h9.i0.b;
        b = new s1(h9.s1.e);
        String str = h2.l0.a;
        c = Integer.toString(0, 36);
    }

    public s1(h9.s1 s1Var) {
        this.a = h9.i0.q(s1Var);
    }

    public final boolean a(int i7) {
        int i10 = 0;
        while (true) {
            h9.i0 i0Var = this.a;
            if (i10 >= i0Var.size()) {
                return false;
            }
            r1 r1Var = (r1) i0Var.get(i10);
            boolean[] zArr = r1Var.e;
            int length = zArr.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    break;
                }
                if (!zArr[i11]) {
                    i11++;
                } else if (r1Var.b.c == i7) {
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
        if (obj == null || s1.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((s1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
