package o4;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class t0 implements j3.g {
    public static final t0 d = new t0(new s0[0]);
    public static final String e;
    public final int a;
    public final s8.i0 b;
    public int c;

    static {
        int i10 = h5.d0.a;
        e = Integer.toString(0, 36);
    }

    public t0(s0... s0VarArr) {
        s8.i0 u10 = s8.v.u(s0VarArr);
        this.b = u10;
        this.a = s0VarArr.length;
        int i10 = 0;
        while (i10 < u10.d) {
            int i11 = i10 + 1;
            for (int i12 = i11; i12 < u10.d; i12++) {
                if (((s0) u10.get(i10)).equals(u10.get(i12))) {
                    h5.a.p("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i10 = i11;
        }
    }

    public final s0 a(int i10) {
        return (s0) this.b.get(i10);
    }

    public final int b(s0 s0Var) {
        int indexOf = this.b.indexOf(s0Var);
        if (indexOf >= 0) {
            return indexOf;
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || t0.class != obj.getClass()) {
            return false;
        }
        t0 t0Var = (t0) obj;
        return this.a == t0Var.a && this.b.equals(t0Var.b);
    }

    public final int hashCode() {
        if (this.c == 0) {
            this.c = this.b.hashCode();
        }
        return this.c;
    }
}
