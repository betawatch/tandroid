package com.google.android.gms.internal.cast;

import a8.ea;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class j0 extends f0 {
    public static final j0 e = new j0(0, new Object[0]);
    public final transient Object[] c;
    public final transient int d;

    public j0(int i10, Object[] objArr) {
        this.c = objArr;
        this.d = i10;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        ea.a(i10, this.d);
        Object obj = this.c[i10];
        obj.getClass();
        return obj;
    }

    @Override // com.google.android.gms.internal.cast.f0, com.google.android.gms.internal.cast.c0
    public final int h(Object[] objArr) {
        Object[] objArr2 = this.c;
        int i10 = this.d;
        System.arraycopy(objArr2, 0, objArr, 0, i10);
        return i10;
    }

    @Override // com.google.android.gms.internal.cast.c0
    public final int m() {
        return this.d;
    }

    @Override // com.google.android.gms.internal.cast.c0
    public final int n() {
        return 0;
    }

    @Override // com.google.android.gms.internal.cast.c0
    public final Object[] o() {
        return this.c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
