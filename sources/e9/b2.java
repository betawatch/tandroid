package e9;

import j$.util.Objects;
import v7.t6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class b2 extends n0 {
    public final transient Object[] c;
    public final transient int d;
    public final transient int e;

    public b2(int i10, int i11, Object[] objArr) {
        this.c = objArr;
        this.d = i10;
        this.e = i11;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        t6.j(i10, this.e);
        Object obj = this.c[(i10 * 2) + this.d];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // e9.i0
    public final boolean q() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.e;
    }
}
