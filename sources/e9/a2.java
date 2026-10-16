package e9;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final class a2 extends y0 {
    public final transient q0 d;
    public final transient b2 e;

    public a2(q0 q0Var, b2 b2Var) {
        this.d = q0Var;
        this.e = b2Var;
    }

    @Override // e9.i0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.d.get(obj) != null;
    }

    @Override // e9.y0, e9.i0
    public final n0 h() {
        return this.e;
    }

    @Override // e9.i0
    public final int m(int i10, Object[] objArr) {
        return this.e.m(i10, objArr);
    }

    @Override // e9.i0
    public final boolean q() {
        return true;
    }

    @Override // e9.i0
    /* renamed from: r */
    public final m2 iterator() {
        return this.e.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.d.size();
    }
}
