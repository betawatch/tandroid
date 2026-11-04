package g9;

import b8.zb;
import j$.util.Objects;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class s1 extends i0 {
    public static final s1 e = new s1(0, new Object[0]);
    public final transient Object[] c;
    public final transient int d;

    public s1(int i3, Object[] objArr) {
        this.c = objArr;
        this.d = i3;
    }

    @Override // java.util.List
    public final Object get(int i3) {
        zb.j(i3, this.d);
        Object obj = this.c[i3];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // g9.i0, g9.d0
    public final int i(int i3, Object[] objArr) {
        Object[] objArr2 = this.c;
        int i10 = this.d;
        System.arraycopy(objArr2, 0, objArr, i3, i10);
        return i3 + i10;
    }

    @Override // g9.d0
    public final Object[] j() {
        return this.c;
    }

    @Override // g9.d0
    public final int k() {
        return this.d;
    }

    @Override // g9.d0
    public final int l() {
        return 0;
    }

    @Override // g9.d0
    public final boolean m() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
