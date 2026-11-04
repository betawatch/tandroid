package c9;

import b8.q9;
import j$.util.Objects;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class k extends i {
    public static final k d = new k(new Object[0]);
    public final transient Object[] c;

    public k(Object[] objArr) {
        this.c = objArr;
    }

    @Override // java.util.List
    public final Object get(int i3) {
        q9.a(i3, 0);
        Object obj = this.c[i3];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // c9.i, c9.f
    public final int h(Object[] objArr) {
        System.arraycopy(this.c, 0, objArr, 0, 0);
        return 0;
    }

    @Override // c9.f
    public final int i() {
        return 0;
    }

    @Override // c9.f
    public final int j() {
        return 0;
    }

    @Override // c9.f
    public final Object[] k() {
        return this.c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return 0;
    }
}
