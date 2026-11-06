package h9;

import a8.ia;
import j$.util.Objects;
import java.util.AbstractMap;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class u1 extends i0 {
    public final /* synthetic */ v1 c;

    public u1(v1 v1Var) {
        this.c = v1Var;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        v1 v1Var = this.c;
        ia.j(i7, v1Var.h);
        Object[] objArr = v1Var.e;
        int i10 = i7 * 2;
        int i11 = v1Var.f;
        Object obj = objArr[i10 + i11];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i10 + (i11 ^ 1)];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // h9.d0
    public final boolean m() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c.h;
    }
}
