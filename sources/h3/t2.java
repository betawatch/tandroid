package h3;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class t2 implements g {
    public static final t2 b;
    public final o8.z a;

    static {
        o8.x xVar = o8.z.b;
        b = new t2(o8.l0.e);
        int i9 = d5.f0.a;
        Integer.toString(0, 36);
    }

    public t2(o8.z zVar) {
        this.a = o8.z.u(zVar);
    }

    public final boolean a(int i9) {
        int i10 = 0;
        while (true) {
            o8.z zVar = this.a;
            if (i10 >= zVar.size()) {
                return false;
            }
            s2 s2Var = (s2) zVar.get(i10);
            boolean[] zArr = s2Var.e;
            int length = zArr.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    break;
                }
                if (!zArr[i11]) {
                    i11++;
                } else if (s2Var.b.c == i9) {
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
        if (obj == null || t2.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((t2) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
