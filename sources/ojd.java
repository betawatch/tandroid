// default package

import j$.util.Objects;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ojd extends fhd {
    public static final ojd e = new ojd(0, new Object[0]);
    public final transient Object[] c;
    public final transient int d;

    public ojd(int i, Object[] objArr) {
        this.c = objArr;
        this.d = i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        u1f.a(i, this.d);
        Object obj = this.c[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // fhd, ogd
    public final int h(Object[] objArr) {
        Object[] objArr2 = this.c;
        int i = this.d;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // ogd
    public final int i() {
        return this.d;
    }

    @Override // ogd
    public final int j() {
        return 0;
    }

    @Override // ogd
    public final boolean l() {
        return false;
    }

    @Override // ogd
    public final Object[] m() {
        return this.c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
