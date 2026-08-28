package j4;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class j1 implements h3.g {
    public static final j1 d = new j1(new i1[0]);
    public static final String e;
    public final int a;
    public final o8.l0 b;
    public int c;

    static {
        int i9 = d5.f0.a;
        e = Integer.toString(0, 36);
    }

    public j1(i1... i1VarArr) {
        o8.l0 v = o8.z.v(i1VarArr);
        this.b = v;
        this.a = i1VarArr.length;
        int i9 = 0;
        while (i9 < v.d) {
            int i10 = i9 + 1;
            for (int i11 = i10; i11 < v.d; i11++) {
                if (((i1) v.get(i9)).equals(v.get(i11))) {
                    d5.a.p("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i9 = i10;
        }
    }

    public final i1 a(int i9) {
        return (i1) this.b.get(i9);
    }

    public final int b(i1 i1Var) {
        int indexOf = this.b.indexOf(i1Var);
        if (indexOf >= 0) {
            return indexOf;
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j1.class != obj.getClass()) {
            return false;
        }
        j1 j1Var = (j1) obj;
        return this.a == j1Var.a && this.b.equals(j1Var.b);
    }

    public final int hashCode() {
        if (this.c == 0) {
            this.c = this.b.hashCode();
        }
        return this.c;
    }
}
