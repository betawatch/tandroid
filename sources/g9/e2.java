package g9;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class e2 extends t0 {
    public final transient Object d;

    public e2(Object obj) {
        obj.getClass();
        this.d = obj;
    }

    @Override // g9.d0, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.d.equals(obj);
    }

    @Override // g9.t0, g9.d0
    public final i0 h() {
        return i0.u(this.d);
    }

    @Override // g9.t0, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.d.hashCode();
    }

    @Override // g9.d0
    public final int i(int i3, Object[] objArr) {
        objArr[i3] = this.d;
        return i3 + 1;
    }

    @Override // g9.d0
    public final boolean m() {
        return false;
    }

    @Override // g9.d0
    /* renamed from: n */
    public final g2 iterator() {
        return new z0(this.d);
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
