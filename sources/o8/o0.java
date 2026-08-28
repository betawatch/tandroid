package o8;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class o0 extends c0 {
    public final transient b0 d;
    public final transient p0 e;

    public o0(b0 b0Var, p0 p0Var) {
        this.d = b0Var;
        this.e = p0Var;
    }

    @Override // o8.u, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.d.get(obj) != null;
    }

    @Override // o8.c0, o8.u
    public final z i() {
        return this.e;
    }

    @Override // o8.u
    public final int n(int i9, Object[] objArr) {
        return this.e.n(i9, objArr);
    }

    @Override // o8.u
    public final boolean r() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return ((q0) this.d).f;
    }

    @Override // o8.c0
    /* renamed from: w */
    public final x0 iterator() {
        return this.e.listIterator(0);
    }
}
