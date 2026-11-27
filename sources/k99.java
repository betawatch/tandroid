// default package

import j$.util.Objects;
import java.util.AbstractMap;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class k99 extends po5 {
    public final /* synthetic */ l99 c;

    public k99(l99 l99Var) {
        this.c = l99Var;
    }

    @Override // java.util.List
    public final Object get(int i) {
        l99 l99Var = this.c;
        yve.j(i, l99Var.h);
        Object[] objArr = l99Var.e;
        int i2 = i << 1;
        boolean z = l99Var.f;
        Object obj = objArr[i2 + (z ? 1 : 0)];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i2 + (!z ? 1 : 0)];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // jo5
    public final boolean m() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c.h;
    }
}
