package o8;

import j$.util.Objects;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class k extends i {
    public static final k d = new k(new Object[0]);
    public final transient Object[] c;

    public k(Object[] objArr) {
        this.c = objArr;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        k7.i0.a(i10, 0);
        Object obj = this.c[i10];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // o8.i, o8.f
    public final int i(Object[] objArr) {
        System.arraycopy(this.c, 0, objArr, 0, 0);
        return 0;
    }

    @Override // o8.f
    public final int n() {
        return 0;
    }

    @Override // o8.f
    public final int o() {
        return 0;
    }

    @Override // o8.f
    public final Object[] p() {
        return this.c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return 0;
    }
}
