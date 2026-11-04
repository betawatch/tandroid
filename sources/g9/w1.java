package g9;

import b8.zb;
import j$.util.Objects;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class w1 extends i0 {
    public final transient Object[] c;
    public final transient int d;
    public final transient int e;

    public w1(int i3, int i10, Object[] objArr) {
        this.c = objArr;
        this.d = i3;
        this.e = i10;
    }

    @Override // java.util.List
    public final Object get(int i3) {
        zb.j(i3, this.e);
        Object obj = this.c[(i3 * 2) + this.d];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // g9.d0
    public final boolean m() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.e;
    }
}
