package e9;

import j$.util.Objects;
import java.util.AbstractMap;
import v7.t6;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes.dex */
public final class b1 extends i0 {
    public final /* synthetic */ c1 c;

    public b1(c1 c1Var) {
        this.c = c1Var;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        c1 c1Var = this.c;
        t6.c(i10, c1Var.h);
        Object[] objArr = c1Var.e;
        int i11 = i10 * 2;
        int i12 = c1Var.f;
        Object obj = objArr[i11 + i12];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i11 + (i12 ^ 1)];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // e9.d0
    public final boolean r() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c.h;
    }
}
