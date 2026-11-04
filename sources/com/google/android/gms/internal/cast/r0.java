package com.google.android.gms.internal.cast;

import b8.ea;
import java.util.Iterator;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class r0 extends i0 {
    public static final Object[] r;
    public static final r0 s;
    public final transient Object[] d;
    public final transient int e;
    public final transient Object[] f;
    public final transient int h;
    public final transient int n;

    static {
        Object[] objArr = new Object[0];
        r = objArr;
        s = new r0(0, 0, 0, objArr, objArr);
    }

    public r0(int i3, int i10, int i11, Object[] objArr, Object[] objArr2) {
        this.d = objArr;
        this.e = i3;
        this.f = objArr2;
        this.h = i10;
        this.n = i11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f;
            if (objArr.length != 0) {
                int a10 = ea.a(obj.hashCode());
                while (true) {
                    int i3 = a10 & this.h;
                    Object obj2 = objArr[i3];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    a10 = i3 + 1;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.cast.d0
    public final int h(Object[] objArr) {
        Object[] objArr2 = this.d;
        int i3 = this.n;
        System.arraycopy(objArr2, 0, objArr, 0, i3);
        return i3;
    }

    @Override // com.google.android.gms.internal.cast.i0, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.e;
    }

    @Override // com.google.android.gms.internal.cast.d0
    public final int i() {
        return this.n;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        g0 g0Var = this.b;
        if (g0Var == null) {
            g0Var = g0.m(this.n, this.d);
            this.b = g0Var;
        }
        return g0Var.listIterator(0);
    }

    @Override // com.google.android.gms.internal.cast.d0
    public final int j() {
        return 0;
    }

    @Override // com.google.android.gms.internal.cast.d0
    public final Object[] k() {
        return this.d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.n;
    }
}
