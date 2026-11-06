package h9;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class w1 extends t0 {
    public final transient l0 d;
    public final transient x1 e;

    public w1(l0 l0Var, x1 x1Var) {
        this.d = l0Var;
        this.e = x1Var;
    }

    @Override // h9.d0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.d.get(obj) != null;
    }

    @Override // h9.t0, h9.d0
    public final i0 f() {
        return this.e;
    }

    @Override // h9.d0
    public final int i(int i7, Object[] objArr) {
        return this.e.i(i7, objArr);
    }

    @Override // h9.d0
    public final boolean m() {
        return true;
    }

    @Override // h9.d0
    /* renamed from: n */
    public final h2 iterator() {
        return this.e.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.d.size();
    }
}
