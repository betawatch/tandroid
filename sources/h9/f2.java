package h9;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class f2 extends t0 {
    public final transient Object d;

    public f2(Object obj) {
        obj.getClass();
        this.d = obj;
    }

    @Override // h9.d0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.d.equals(obj);
    }

    @Override // h9.t0, h9.d0
    public final i0 f() {
        return i0.u(this.d);
    }

    @Override // h9.t0, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.d.hashCode();
    }

    @Override // h9.d0
    public final int i(int i7, Object[] objArr) {
        objArr[i7] = this.d;
        return i7 + 1;
    }

    @Override // h9.d0
    public final boolean m() {
        return false;
    }

    @Override // h9.d0
    /* renamed from: n */
    public final h2 iterator() {
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
