package e9;

import j$.util.Objects;
import java.util.AbstractMap;
import v7.u6;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes.dex */
public final class y1 extends n0 {
    public final /* synthetic */ z1 c;

    public y1(z1 z1Var) {
        this.c = z1Var;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        z1 z1Var = this.c;
        u6.j(i10, z1Var.h);
        Object[] objArr = z1Var.e;
        int i11 = i10 * 2;
        int i12 = z1Var.f;
        Object obj = objArr[i11 + i12];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i11 + (i12 ^ 1)];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // e9.i0
    public final boolean q() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c.h;
    }
}
