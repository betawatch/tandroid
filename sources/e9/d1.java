package e9;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes.dex */
public final class d1 extends m0 {
    public final transient k0 d;
    public final transient e1 e;

    public d1(k0 k0Var, e1 e1Var) {
        this.d = k0Var;
        this.e = e1Var;
    }

    @Override // e9.d0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.d.get(obj) != null;
    }

    @Override // e9.m0, e9.d0
    public final i0 i() {
        return this.e;
    }

    @Override // e9.d0
    public final int n(int i10, Object[] objArr) {
        return this.e.n(i10, objArr);
    }

    @Override // e9.d0
    public final boolean r() {
        return true;
    }

    @Override // e9.d0
    /* renamed from: s */
    public final o1 iterator() {
        return this.e.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.d.size();
    }
}
