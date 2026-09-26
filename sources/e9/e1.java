package e9;

import j$.util.Objects;
import v7.u6;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes.dex */
public final class e1 extends i0 {
    public final transient Object[] c;
    public final transient int d;
    public final transient int e;

    public e1(int i10, int i11, Object[] objArr) {
        this.c = objArr;
        this.d = i10;
        this.e = i11;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        u6.c(i10, this.e);
        Object obj = this.c[(i10 * 2) + this.d];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // e9.d0
    public final boolean r() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.e;
    }
}
