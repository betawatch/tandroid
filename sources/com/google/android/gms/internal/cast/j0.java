package com.google.android.gms.internal.cast;

import a8.n8;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
        n8.a(i7, this.d);
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
