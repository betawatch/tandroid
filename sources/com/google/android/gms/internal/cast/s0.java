package com.google.android.gms.internal.cast;

import java.util.Iterator;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class s0 extends j0 {
    public static final Object[] r;
    public static final s0 s;
    public final transient Object[] d;
    public final transient int e;
    public final transient Object[] f;
    public final transient int h;
    public final transient int n;

    static {
        Object[] objArr = new Object[0];
        r = objArr;
        s = new s0(0, 0, 0, objArr, objArr);
    }

    public s0(int i10, int i11, int i12, Object[] objArr, Object[] objArr2) {
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
                int a2 = j7.y5.a(obj.hashCode());
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

    @Override // com.google.android.gms.internal.cast.j0, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.e;
    }

    @Override // com.google.android.gms.internal.cast.d0
    public final int i(Object[] objArr) {
        Object[] objArr2 = this.d;
        int i10 = this.n;
        System.arraycopy(objArr2, 0, objArr, 0, i10);
        return i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        g0 g0Var = this.b;
        if (g0Var == null) {
            g0Var = g0.r(this.n, this.d);
            this.b = g0Var;
        }
        return g0Var.listIterator(0);
    }

    @Override // com.google.android.gms.internal.cast.d0
    public final int n() {
        return this.n;
    }

    @Override // com.google.android.gms.internal.cast.d0
    public final int o() {
        return 0;
    }

    @Override // com.google.android.gms.internal.cast.d0
    public final Object[] p() {
        return this.d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.n;
    }
}
