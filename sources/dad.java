// default package

import j$.util.Objects;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class dad extends t8d {
    public static final dad w = new dad(0, new Object[0]);
    public final transient Object[] r;
    public final transient int s;

    public dad(int i, Object[] objArr) {
        super((byte) 2);
        this.r = objArr;
        this.s = i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        m6f.a(i, this.s);
        Object obj = this.r[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // t8d, l1d
    public final int p(Object[] objArr) {
        Object[] objArr2 = this.r;
        int i = this.s;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // l1d
    public final int q() {
        return this.s;
    }

    @Override // l1d
    public final int s() {
        return 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.s;
    }

    @Override // l1d
    public final Object[] v() {
        return this.r;
    }
}
