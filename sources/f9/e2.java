package f9;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class e2 extends t0 {
    public final transient Object d;

    public e2(Object obj) {
        obj.getClass();
        this.d = obj;
    }

    @Override // f9.d0, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.d.equals(obj);
    }

    @Override // f9.t0, f9.d0
    public final i0 h() {
        return i0.y(this.d);
    }

    @Override // f9.t0, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.d.hashCode();
    }

    @Override // f9.d0
    public final int m(int i10, Object[] objArr) {
        objArr[i10] = this.d;
        return i10 + 1;
    }

    @Override // f9.d0
    public final boolean q() {
        return false;
    }

    @Override // f9.d0
    /* renamed from: r */
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
