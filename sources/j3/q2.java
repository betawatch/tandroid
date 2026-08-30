package j3;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class q2 implements g {
    public static final q2 b;
    public final s8.v a;

    static {
        s8.t tVar = s8.v.b;
        b = new q2(s8.i0.e);
        int i10 = h5.d0.a;
        Integer.toString(0, 36);
    }

    public q2(s8.v vVar) {
        this.a = s8.v.t(vVar);
    }

    public final boolean a(int i10) {
        int i11 = 0;
        while (true) {
            s8.v vVar = this.a;
            if (i11 >= vVar.size()) {
                return false;
            }
            p2 p2Var = (p2) vVar.get(i11);
            boolean[] zArr = p2Var.e;
            int length = zArr.length;
            int i12 = 0;
            while (true) {
                if (i12 >= length) {
                    break;
                }
                if (!zArr[i12]) {
                    i12++;
                } else if (p2Var.b.c == i10) {
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
        if (obj == null || q2.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((q2) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
