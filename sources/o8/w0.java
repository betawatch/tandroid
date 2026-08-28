package o8;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class w0 extends c0 {
    public final transient Object d;

    public w0(Object obj) {
        obj.getClass();
        this.d = obj;
    }

    @Override // o8.u, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.d.equals(obj);
    }

    @Override // o8.c0, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.d.hashCode();
    }

    @Override // o8.c0, o8.u
    public final z i() {
        return z.y(this.d);
    }

    @Override // o8.u
    public final int n(int i9, Object[] objArr) {
        objArr[i9] = this.d;
        return i9 + 1;
    }

    @Override // o8.u
    public final boolean r() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        String obj = this.d.toString();
        StringBuilder sb2 = new StringBuilder(String.valueOf(obj).length() + 2);
        sb2.append('[');
        sb2.append(obj);
        sb2.append(']');
        return sb2.toString();
    }

    @Override // o8.c0
    /* renamed from: w */
    public final x0 iterator() {
        return new e0(this.d);
    }
}
