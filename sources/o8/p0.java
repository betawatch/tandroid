package o8;

import j$.util.Objects;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class p0 extends z {
    public final transient Object[] c;
    public final transient int d;
    public final transient int e;

    public p0(int i9, int i10, Object[] objArr) {
        this.c = objArr;
        this.d = i9;
        this.e = i10;
    }

    @Override // java.util.List
    public final Object get(int i9) {
        g7.d0.b(i9, this.e);
        Object obj = this.c[(i9 * 2) + this.d];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // o8.u
    public final boolean r() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.e;
    }
}
