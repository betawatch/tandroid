package k8;

import j$.util.Objects;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class k extends i {
    public static final k d = new k(new Object[0]);
    public final transient Object[] c;

    public k(Object[] objArr) {
        this.c = objArr;
    }

    @Override // java.util.List
    public final Object get(int i9) {
        g7.h.a(i9, 0);
        Object obj = this.c[i9];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // k8.i, k8.f
    public final int i(Object[] objArr) {
        System.arraycopy(this.c, 0, objArr, 0, 0);
        return 0;
    }

    @Override // k8.f
    public final int n() {
        return 0;
    }

    @Override // k8.f
    public final int o() {
        return 0;
    }

    @Override // k8.f
    public final Object[] p() {
        return this.c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return 0;
    }
}
