package l4;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class k1 implements j3.g {
    public static final k1 d = new k1(new j1[0]);
    public static final String e;
    public final int a;
    public final q8.l0 b;
    public int c;

    static {
        int i10 = f5.d0.a;
        e = Integer.toString(0, 36);
    }

    public k1(j1... j1VarArr) {
        q8.l0 v = q8.z.v(j1VarArr);
        this.b = v;
        this.a = j1VarArr.length;
        int i10 = 0;
        while (i10 < v.d) {
            int i11 = i10 + 1;
            for (int i12 = i11; i12 < v.d; i12++) {
                if (((j1) v.get(i10)).equals(v.get(i12))) {
                    f5.a.p("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i10 = i11;
        }
    }

    public final j1 a(int i10) {
        return (j1) this.b.get(i10);
    }

    public final int b(j1 j1Var) {
        int indexOf = this.b.indexOf(j1Var);
        if (indexOf >= 0) {
            return indexOf;
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k1.class != obj.getClass()) {
            return false;
        }
        k1 k1Var = (k1) obj;
        return this.a == k1Var.a && this.b.equals(k1Var.b);
    }

    public final int hashCode() {
        if (this.c == 0) {
            this.c = this.b.hashCode();
        }
        return this.c;
    }
}
