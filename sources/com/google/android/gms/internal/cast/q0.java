package com.google.android.gms.internal.cast;

import a8.ha;
import java.util.Iterator;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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

    public q0(int i10, int i11, int i12, Object[] objArr, Object[] objArr2) {
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
                int a2 = ha.a(obj.hashCode());
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

    @Override // com.google.android.gms.internal.cast.c0
    public final int h(Object[] objArr) {
        Object[] objArr2 = this.d;
        int i10 = this.n;
        System.arraycopy(objArr2, 0, objArr, 0, i10);
        return i10;
    }

    @Override // com.google.android.gms.internal.cast.h0, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        f0 f0Var = this.b;
        if (f0Var == null) {
            f0Var = f0.q(this.n, this.d);
            this.b = f0Var;
        }
        return f0Var.listIterator(0);
    }

    @Override // com.google.android.gms.internal.cast.c0
    public final int m() {
        return this.n;
    }

    @Override // com.google.android.gms.internal.cast.c0
    public final int n() {
        return 0;
    }

    @Override // com.google.android.gms.internal.cast.c0
    public final Object[] o() {
        return this.d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.n;
    }
}
