package h9;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class s1 extends a0 {
    public static final s1 r = new s1();
    public final transient Object d;
    public final transient Object[] e;
    public final transient int f;
    public final transient int h;
    public final transient s1 n;

    public s1() {
        this.d = null;
        this.e = new Object[0];
        this.f = 0;
        this.h = 0;
        this.n = this;
    }

    @Override // h9.l0
    public final v1 c() {
        return new v1(this, this.e, this.f, this.h);
    }

    @Override // h9.l0
    public final w1 d() {
        return new w1(this, new x1(this.f, this.h, this.e));
    }

    @Override // h9.l0, java.util.Map
    public final Object get(Object obj) {
        Object i7 = y1.i(this.d, this.e, this.h, this.f, obj);
        if (i7 == null) {
            return null;
        }
        return i7;
    }

    @Override // java.util.Map
    public final int size() {
        return this.h;
    }

    public s1(int i7, Object[] objArr) {
        this.e = objArr;
        this.h = i7;
        this.f = 0;
        int o4 = i7 >= 2 ? t0.o(i7) : 0;
        Object h = y1.h(objArr, i7, o4, 0);
        if (!(h instanceof Object[])) {
            this.d = h;
            Object h7 = y1.h(objArr, i7, o4, 1);
            if (!(h7 instanceof Object[])) {
                this.n = new s1(h7, objArr, i7, this);
                return;
            }
            throw ((k0) ((Object[]) h7)[2]).a();
        }
        throw ((k0) ((Object[]) h)[2]).a();
    }

    public s1(Object obj, Object[] objArr, int i7, s1 s1Var) {
        this.d = obj;
        this.e = objArr;
        this.f = 1;
        this.h = i7;
        this.n = s1Var;
    }
}
