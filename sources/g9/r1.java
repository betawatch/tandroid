package g9;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class r1 extends a0 {
    public static final r1 r = new r1();
    public final transient Object d;
    public final transient Object[] e;
    public final transient int f;
    public final transient int h;
    public final transient r1 n;

    public r1() {
        this.d = null;
        this.e = new Object[0];
        this.f = 0;
        this.h = 0;
        this.n = this;
    }

    @Override // g9.l0
    public final u1 c() {
        return new u1(this, this.e, this.f, this.h);
    }

    @Override // g9.l0
    public final v1 d() {
        return new v1(this, new w1(this.f, this.h, this.e));
    }

    @Override // g9.l0, java.util.Map
    public final Object get(Object obj) {
        Object i3 = x1.i(this.d, this.e, this.h, this.f, obj);
        if (i3 == null) {
            return null;
        }
        return i3;
    }

    @Override // java.util.Map
    public final int size() {
        return this.h;
    }

    public r1(int i3, Object[] objArr) {
        this.e = objArr;
        this.h = i3;
        this.f = 0;
        int o10 = i3 >= 2 ? t0.o(i3) : 0;
        Object h = x1.h(objArr, i3, o10, 0);
        if (!(h instanceof Object[])) {
            this.d = h;
            Object h7 = x1.h(objArr, i3, o10, 1);
            if (!(h7 instanceof Object[])) {
                this.n = new r1(h7, objArr, i3, this);
                return;
            }
            throw ((k0) ((Object[]) h7)[2]).a();
        }
        throw ((k0) ((Object[]) h)[2]).a();
    }

    public r1(Object obj, Object[] objArr, int i3, r1 r1Var) {
        this.d = obj;
        this.e = objArr;
        this.f = 1;
        this.h = i3;
        this.n = r1Var;
    }
}
