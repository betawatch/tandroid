package e9;

import j$.util.Objects;
import v7.t6;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class a1 extends i0 {
    public static final a1 e = new a1(0, new Object[0]);
    public final transient Object[] c;
    public final transient int d;

    public a1(int i10, Object[] objArr) {
        this.c = objArr;
        this.d = i10;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        t6.c(i10, this.d);
        Object obj = this.c[i10];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // e9.i0, e9.d0
    public final int n(int i10, Object[] objArr) {
        Object[] objArr2 = this.c;
        int i11 = this.d;
        System.arraycopy(objArr2, 0, objArr, i10, i11);
        return i10 + i11;
    }

    @Override // e9.d0
    public final Object[] o() {
        return this.c;
    }

    @Override // e9.d0
    public final int p() {
        return this.d;
    }

    @Override // e9.d0
    public final int q() {
        return 0;
    }

    @Override // e9.d0
    public final boolean r() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
