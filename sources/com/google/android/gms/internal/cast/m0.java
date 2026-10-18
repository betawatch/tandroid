package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public final class m0 extends h0 {
    public static final m0 e = new m0(0, new Object[0]);
    public final transient Object[] c;
    public final transient int d;

    public m0(int i10, Object[] objArr) {
        this.c = objArr;
        this.d = i10;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        v7.l5.a(i10, this.d);
        Object obj = this.c[i10];
        obj.getClass();
        return obj;
    }

    @Override // com.google.android.gms.internal.cast.h0, com.google.android.gms.internal.cast.e0
    public final int h(Object[] objArr) {
        Object[] objArr2 = this.c;
        int i10 = this.d;
        System.arraycopy(objArr2, 0, objArr, 0, i10);
        return i10;
    }

    @Override // com.google.android.gms.internal.cast.e0
    public final int m() {
        return this.d;
    }

    @Override // com.google.android.gms.internal.cast.e0
    public final int n() {
        return 0;
    }

    @Override // com.google.android.gms.internal.cast.e0
    public final Object[] o() {
        return this.c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
