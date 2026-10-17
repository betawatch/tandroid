package e9;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes.dex */
public final class k2 extends y0 {
    public final transient Object d;

    public k2(Object obj) {
        obj.getClass();
        this.d = obj;
    }

    @Override // e9.i0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.d.equals(obj);
    }

    @Override // e9.y0, e9.i0
    public final n0 h() {
        return n0.y(this.d);
    }

    @Override // e9.y0, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.d.hashCode();
    }

    @Override // e9.i0
    public final int m(int i10, Object[] objArr) {
        objArr[i10] = this.d;
        return i10 + 1;
    }

    @Override // e9.i0
    public final boolean q() {
        return false;
    }

    @Override // e9.i0
    /* renamed from: r */
    public final m2 iterator() {
        return new e1(this.d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return "[" + this.d.toString() + ']';
    }
}
