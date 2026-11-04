package g9;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class v1 extends t0 {
    public final transient l0 d;
    public final transient w1 e;

    public v1(l0 l0Var, w1 w1Var) {
        this.d = l0Var;
        this.e = w1Var;
    }

    @Override // g9.d0, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.d.get(obj) != null;
    }

    @Override // g9.t0, g9.d0
    public final i0 h() {
        return this.e;
    }

    @Override // g9.d0
    public final int i(int i3, Object[] objArr) {
        return this.e.i(i3, objArr);
    }

    @Override // g9.d0
    public final boolean m() {
        return true;
    }

    @Override // g9.d0
    /* renamed from: n */
    public final g2 iterator() {
        return this.e.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.d.size();
    }
}
