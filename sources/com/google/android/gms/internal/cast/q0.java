package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class q0 extends g0 {
    public final transient Object[] c;
    public final transient int d;
    public final transient int e;

    public q0(int i10, int i11, Object[] objArr) {
        this.c = objArr;
        this.d = i10;
        this.e = i11;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        v7.m5.a(i10, this.e);
        Object obj = this.c[i10 + i10 + this.d];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.e;
    }
}
