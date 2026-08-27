package h3;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class u2 implements g {
    public static final u2 b;
    public final p8.z a;

    static {
        p8.x xVar = p8.z.b;
        b = new u2(p8.l0.e);
        int i10 = d5.g0.a;
        Integer.toString(0, 36);
    }

    public u2(p8.z zVar) {
        this.a = p8.z.u(zVar);
    }

    public final boolean a(int i10) {
        int i11 = 0;
        while (true) {
            p8.z zVar = this.a;
            if (i11 >= zVar.size()) {
                return false;
            }
            t2 t2Var = (t2) zVar.get(i11);
            boolean[] zArr = t2Var.e;
            int length = zArr.length;
            int i12 = 0;
            while (true) {
                if (i12 >= length) {
                    break;
                }
                if (!zArr[i12]) {
                    i12++;
                } else if (t2Var.b.c == i10) {
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
        if (obj == null || u2.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((u2) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
