package o8;

import j$.util.Objects;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class l0 extends z {
    public static final l0 e = new l0(0, new Object[0]);
    public final transient Object[] c;
    public final transient int d;

    public l0(int i9, Object[] objArr) {
        this.c = objArr;
        this.d = i9;
    }

    @Override // java.util.List
    public final Object get(int i9) {
        g7.d0.b(i9, this.d);
        Object obj = this.c[i9];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // o8.z, o8.u
    public final int n(int i9, Object[] objArr) {
        Object[] objArr2 = this.c;
        int i10 = this.d;
        System.arraycopy(objArr2, 0, objArr, i9, i10);
        return i9 + i10;
    }

    @Override // o8.u
    public final Object[] o() {
        return this.c;
    }

    @Override // o8.u
    public final int p() {
        return this.d;
    }

    @Override // o8.u
    public final int q() {
        return 0;
    }

    @Override // o8.u
    public final boolean r() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
