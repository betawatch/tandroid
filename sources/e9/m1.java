package e9;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class m1 extends m0 {
    public final transient Object d;

    public m1(Object obj) {
        obj.getClass();
        this.d = obj;
    }

    @Override // e9.d0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.d.equals(obj);
    }

    @Override // e9.m0, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.d.hashCode();
    }

    @Override // e9.m0, e9.d0
    public final i0 i() {
        return i0.z(this.d);
    }

    @Override // e9.d0
    public final int n(int i10, Object[] objArr) {
        objArr[i10] = this.d;
        return i10 + 1;
    }

    @Override // e9.d0
    public final boolean r() {
        return false;
    }

    @Override // e9.d0
    /* renamed from: s */
    public final o1 iterator() {
        return new p0(this.d);
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
