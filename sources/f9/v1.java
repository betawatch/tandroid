package f9;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class v1 extends t0 {
    public final transient l0 d;
    public final transient w1 e;

    public v1(l0 l0Var, w1 w1Var) {
        this.d = l0Var;
        this.e = w1Var;
    }

    @Override // f9.d0, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.d.get(obj) != null;
    }

    @Override // f9.t0, f9.d0
    public final i0 h() {
        return this.e;
    }

    @Override // f9.d0
    public final int m(int i10, Object[] objArr) {
        return this.e.m(i10, objArr);
    }

    @Override // f9.d0
    public final boolean q() {
        return true;
    }

    @Override // f9.d0
    /* renamed from: r */
    public final g2 iterator() {
        return this.e.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.d.size();
    }
}
