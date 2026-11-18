package h9;

import a8.la;
import j$.util.Objects;
import java.util.AbstractMap;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final class u1 extends i0 {
    public final /* synthetic */ v1 c;

    public u1(v1 v1Var) {
        this.c = v1Var;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        v1 v1Var = this.c;
        la.j(i7, v1Var.h);
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
