package h9;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class e2 extends t0 {
    public final transient Object d;

    public e2(Object obj) {
        obj.getClass();
        this.d = obj;
    }

    @Override // h9.d0, java.util.AbstractCollection, java.util.Collection
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
