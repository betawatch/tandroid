package f9;

import a8.yb;
import j$.util.Objects;
import java.util.AbstractMap;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class t1 extends i0 {
    public final /* synthetic */ u1 c;

    public t1(u1 u1Var) {
        this.c = u1Var;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        u1 u1Var = this.c;
        yb.j(i10, u1Var.h);
        Object[] objArr = u1Var.e;
        int i11 = i10 * 2;
        int i12 = u1Var.f;
        Object obj = objArr[i11 + i12];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i11 + (i12 ^ 1)];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // f9.d0
    public final boolean q() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c.h;
    }
}
