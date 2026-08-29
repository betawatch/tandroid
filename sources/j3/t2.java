package j3;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class t2 implements g {
    public static final t2 b;
    public final q8.z a;

    static {
        q8.x xVar = q8.z.b;
        b = new t2(q8.l0.e);
        int i10 = f5.d0.a;
        Integer.toString(0, 36);
    }

    public t2(q8.z zVar) {
        this.a = q8.z.u(zVar);
    }

    public final boolean a(int i10) {
        int i11 = 0;
        while (true) {
            q8.z zVar = this.a;
            if (i11 >= zVar.size()) {
                return false;
            }
            s2 s2Var = (s2) zVar.get(i11);
            boolean[] zArr = s2Var.e;
            int length = zArr.length;
            int i12 = 0;
            while (true) {
                if (i12 >= length) {
                    break;
                }
                if (!zArr[i12]) {
                    i12++;
                } else if (s2Var.b.c == i10) {
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
        if (obj == null || t2.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((t2) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
