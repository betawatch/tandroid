package g9;

import b8.zb;
import j$.util.Objects;
import java.util.AbstractMap;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class t1 extends i0 {
    public final /* synthetic */ u1 c;

    public t1(u1 u1Var) {
        this.c = u1Var;
    }

    @Override // java.util.List
    public final Object get(int i3) {
        u1 u1Var = this.c;
        zb.j(i3, u1Var.h);
        Object[] objArr = u1Var.e;
        int i10 = i3 * 2;
        int i11 = u1Var.f;
        Object obj = objArr[i10 + i11];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i10 + (i11 ^ 1)];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // g9.d0
    public final boolean m() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c.h;
    }
}
