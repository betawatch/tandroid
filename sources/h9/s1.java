package h9;

import a8.ja;
import j$.util.Objects;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final class s1 extends i0 {
    public static final s1 e = new s1(0, new Object[0]);
    public final transient Object[] c;
    public final transient int d;

    public s1(int i7, Object[] objArr) {
        this.c = objArr;
        this.d = i7;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        ja.j(i7, this.d);
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
