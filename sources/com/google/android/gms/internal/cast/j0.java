package com.google.android.gms.internal.cast;

import a8.o8;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final class j0 extends f0 {
    public static final j0 e = new j0(0, new Object[0]);
    public final transient Object[] c;
    public final transient int d;

    public j0(int i7, Object[] objArr) {
        this.c = objArr;
        this.d = i7;
    }

    @Override // com.google.android.gms.internal.cast.f0, com.google.android.gms.internal.cast.c0
    public final int f(Object[] objArr) {
        Object[] objArr2 = this.c;
        int i7 = this.d;
        System.arraycopy(objArr2, 0, objArr, 0, i7);
        return i7;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        o8.a(i7, this.d);
        Object obj = this.c[i7];
        obj.getClass();
        return obj;
    }

    @Override // com.google.android.gms.internal.cast.c0
    public final int i() {
        return this.d;
    }

    @Override // com.google.android.gms.internal.cast.c0
    public final int j() {
        return 0;
    }

    @Override // com.google.android.gms.internal.cast.c0
    public final Object[] k() {
        return this.c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
