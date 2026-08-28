package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class m0 extends h0 {
    public static final m0 e = new m0(0, new Object[0]);
    public final transient Object[] c;
    public final transient int d;

    public m0(int i9, Object[] objArr) {
        this.c = objArr;
        this.d = i9;
    }

    @Override // java.util.List
    public final Object get(int i9) {
        f7.l5.a(i9, this.d);
        Object obj = this.c[i9];
        obj.getClass();
        return obj;
    }

    @Override // com.google.android.gms.internal.cast.h0, com.google.android.gms.internal.cast.e0
    public final int i(Object[] objArr) {
        Object[] objArr2 = this.c;
        int i9 = this.d;
        System.arraycopy(objArr2, 0, objArr, 0, i9);
        return i9;
    }

    @Override // com.google.android.gms.internal.cast.e0
    public final int n() {
        return this.d;
    }

    @Override // com.google.android.gms.internal.cast.e0
    public final int o() {
        return 0;
    }

    @Override // com.google.android.gms.internal.cast.e0
    public final Object[] p() {
        return this.c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
