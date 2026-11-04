package com.google.android.gms.internal.cast;

import b8.ba;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class k0 extends g0 {
    public static final k0 e = new k0(0, new Object[0]);
    public final transient Object[] c;
    public final transient int d;

    public k0(int i3, Object[] objArr) {
        this.c = objArr;
        this.d = i3;
    }

    @Override // java.util.List
    public final Object get(int i3) {
        ba.a(i3, this.d);
        Object obj = this.c[i3];
        obj.getClass();
        return obj;
    }

    @Override // com.google.android.gms.internal.cast.g0, com.google.android.gms.internal.cast.d0
    public final int h(Object[] objArr) {
        Object[] objArr2 = this.c;
        int i3 = this.d;
        System.arraycopy(objArr2, 0, objArr, 0, i3);
        return i3;
    }

    @Override // com.google.android.gms.internal.cast.d0
    public final int i() {
        return this.d;
    }

    @Override // com.google.android.gms.internal.cast.d0
    public final int j() {
        return 0;
    }

    @Override // com.google.android.gms.internal.cast.d0
    public final Object[] k() {
        return this.c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
