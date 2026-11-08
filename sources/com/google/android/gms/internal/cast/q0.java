package com.google.android.gms.internal.cast;

import a8.q8;
import java.util.Iterator;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class q0 extends h0 {
    public static final Object[] r;
    public static final q0 s;
    public final transient Object[] d;
    public final transient int e;
    public final transient Object[] f;
    public final transient int h;
    public final transient int n;

    static {
        Object[] objArr = new Object[0];
        r = objArr;
        s = new q0(0, 0, 0, objArr, objArr);
    }

    public q0(int i7, int i10, int i11, Object[] objArr, Object[] objArr2) {
        this.d = objArr;
        this.e = i7;
        this.f = objArr2;
        this.h = i10;
        this.n = i11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f;
            if (objArr.length != 0) {
                int a10 = q8.a(obj.hashCode());
                while (true) {
                    int i7 = a10 & this.h;
                    Object obj2 = objArr[i7];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    a10 = i7 + 1;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.cast.c0
    public final int f(Object[] objArr) {
        Object[] objArr2 = this.d;
        int i7 = this.n;
        System.arraycopy(objArr2, 0, objArr, 0, i7);
        return i7;
    }

    @Override // com.google.android.gms.internal.cast.h0, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.e;
    }

    @Override // com.google.android.gms.internal.cast.c0
    public final int i() {
        return this.n;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        f0 f0Var = this.b;
        if (f0Var == null) {
            f0Var = f0.m(this.n, this.d);
            this.b = f0Var;
        }
        return f0Var.listIterator(0);
    }

    @Override // com.google.android.gms.internal.cast.c0
    public final int j() {
        return 0;
    }

    @Override // com.google.android.gms.internal.cast.c0
    public final Object[] k() {
        return this.d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.n;
    }
}
