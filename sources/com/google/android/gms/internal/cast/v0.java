package com.google.android.gms.internal.cast;

import java.util.Iterator;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class v0 extends m0 {
    public static final Object[] r;
    public static final v0 s;
    public final transient Object[] d;
    public final transient int e;
    public final transient Object[] f;
    public final transient int h;
    public final transient int n;

    static {
        Object[] objArr = new Object[0];
        r = objArr;
        s = new v0(0, 0, 0, objArr, objArr);
    }

    public v0(int i10, int i11, int i12, Object[] objArr, Object[] objArr2) {
        this.d = objArr;
        this.e = i10;
        this.f = objArr2;
        this.h = i11;
        this.n = i12;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f;
            if (objArr.length != 0) {
                int a2 = v7.m5.a(obj.hashCode());
                while (true) {
                    int i10 = a2 & this.h;
                    Object obj2 = objArr[i10];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    a2 = i10 + 1;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.cast.m0, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.e;
    }

    @Override // com.google.android.gms.internal.cast.g0
    public final int i(Object[] objArr) {
        Object[] objArr2 = this.d;
        int i10 = this.n;
        System.arraycopy(objArr2, 0, objArr, 0, i10);
        return i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        j0 j0Var = this.b;
        if (j0Var == null) {
            j0Var = j0.r(this.n, this.d);
            this.b = j0Var;
        }
        return j0Var.listIterator(0);
    }

    @Override // com.google.android.gms.internal.cast.g0
    public final int n() {
        return this.n;
    }

    @Override // com.google.android.gms.internal.cast.g0
    public final int o() {
        return 0;
    }

    @Override // com.google.android.gms.internal.cast.g0
    public final Object[] p() {
        return this.d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.n;
    }
}
