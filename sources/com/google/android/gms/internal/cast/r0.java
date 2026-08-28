package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class r0 extends h0 {
    public final transient Object[] c;
    public final transient int d;
    public final transient int e;

    public r0(int i9, int i10, Object[] objArr) {
        this.c = objArr;
        this.d = i9;
        this.e = i10;
    }

    @Override // java.util.List
    public final Object get(int i9) {
        f7.l5.a(i9, this.e);
        Object obj = this.c[i9 + i9 + this.d];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.e;
    }
}
