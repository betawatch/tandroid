package j4;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class j1 implements h3.g {
    public static final j1 d = new j1(new i1[0]);
    public static final String e;
    public final int a;
    public final p8.l0 b;
    public int c;

    static {
        int i10 = d5.g0.a;
        e = Integer.toString(0, 36);
    }

    public j1(i1... i1VarArr) {
        p8.l0 v = p8.z.v(i1VarArr);
        this.b = v;
        this.a = i1VarArr.length;
        int i10 = 0;
        while (i10 < v.d) {
            int i11 = i10 + 1;
            for (int i12 = i11; i12 < v.d; i12++) {
                if (((i1) v.get(i10)).equals(v.get(i12))) {
                    d5.a.p("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i10 = i11;
        }
    }

    public final i1 a(int i10) {
        return (i1) this.b.get(i10);
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
