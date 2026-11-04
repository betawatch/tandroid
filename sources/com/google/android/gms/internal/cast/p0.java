package com.google.android.gms.internal.cast;

import b8.ba;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class p0 extends g0 {
    public final transient Object[] c;
    public final transient int d;
    public final transient int e;

    public p0(int i3, int i10, Object[] objArr) {
        this.c = objArr;
        this.d = i3;
        this.e = i10;
    }

    @Override // java.util.List
    public final Object get(int i3) {
        ba.a(i3, this.e);
        Object obj = this.c[i3 + i3 + this.d];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.e;
    }
}
