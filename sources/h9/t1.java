package h9;

import a8.ia;
import j$.util.Objects;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class t1 extends i0 {
    public static final t1 e = new t1(0, new Object[0]);
    public final transient Object[] c;
    public final transient int d;

    public t1(int i7, Object[] objArr) {
        this.c = objArr;
        this.d = i7;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        ia.j(i7, this.d);
        Object obj = this.c[i7];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // h9.i0, h9.d0
    public final int i(int i7, Object[] objArr) {
        Object[] objArr2 = this.c;
        int i10 = this.d;
        System.arraycopy(objArr2, 0, objArr, i7, i10);
        return i7 + i10;
    }

    @Override // h9.d0
    public final Object[] j() {
        return this.c;
    }

    @Override // h9.d0
    public final int k() {
        return this.d;
    }

    @Override // h9.d0
    public final int l() {
        return 0;
    }

    @Override // h9.d0
    public final boolean m() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
