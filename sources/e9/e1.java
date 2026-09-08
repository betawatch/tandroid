package e9;

import j$.util.Objects;
import v7.t6;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class e1 extends i0 {
    public final transient Object[] c;
    public final transient int d;
    public final transient int e;

    public e1(int i10, int i11, Object[] objArr) {
        this.c = objArr;
        this.d = i10;
        this.e = i11;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        t6.c(i10, this.e);
        Object obj = this.c[(i10 * 2) + this.d];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // e9.d0
    public final boolean r() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.e;
    }
}
