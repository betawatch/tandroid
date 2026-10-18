package e9;

import j$.util.Objects;
import v7.u6;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public final class x1 extends n0 {
    public static final x1 e = new x1(0, new Object[0]);
    public final transient Object[] c;
    public final transient int d;

    public x1(int i10, Object[] objArr) {
        this.c = objArr;
        this.d = i10;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        u6.j(i10, this.d);
        Object obj = this.c[i10];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // e9.n0, e9.i0
    public final int m(int i10, Object[] objArr) {
        Object[] objArr2 = this.c;
        int i11 = this.d;
        System.arraycopy(objArr2, 0, objArr, i10, i11);
        return i10 + i11;
    }

    @Override // e9.i0
    public final Object[] n() {
        return this.c;
    }

    @Override // e9.i0
    public final int o() {
        return this.d;
    }

    @Override // e9.i0
    public final int p() {
        return 0;
    }

    @Override // e9.i0
    public final boolean q() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
