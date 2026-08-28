package o8;

import j$.util.Objects;
import java.util.AbstractMap;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class m0 extends z {
    public final /* synthetic */ n0 c;

    public m0(n0 n0Var) {
        this.c = n0Var;
    }

    @Override // java.util.List
    public final Object get(int i9) {
        n0 n0Var = this.c;
        g7.d0.b(i9, n0Var.f);
        Object[] objArr = n0Var.e;
        int i10 = i9 * 2;
        Object obj = objArr[i10];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i10 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // o8.u
    public final boolean r() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c.f;
    }
}
