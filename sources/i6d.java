// default package

import j$.util.Objects;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class i6d extends g6d {
    public static final i6d w = new i6d(0, new Object[0]);
    public final transient Object[] r;
    public final transient boolean s;

    /* JADX WARN: Multi-variable type inference failed */
    public i6d(int i, Object[] objArr) {
        super((byte) 1);
        this.r = objArr;
        this.s = i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        a1f.a(i, this.s ? 1 : 0);
        Object obj = this.r[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // g6d, l1d
    public final int l(Object[] objArr) {
        Object[] objArr2 = this.r;
        boolean z = this.s;
        System.arraycopy(objArr2, 0, objArr, 0, z ? 1 : 0);
        return z ? 1 : 0;
    }

    @Override // l1d
    public final int m() {
        return this.s ? 1 : 0;
    }

    @Override // l1d
    public final Object[] o() {
        return this.r;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.s ? 1 : 0;
    }
}
