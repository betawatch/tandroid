package com.google.android.gms.internal.cast;

import java.util.Iterator;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class n0 extends h0 {
    public final transient p0 d;
    public final transient o0 e;

    public n0(p0 p0Var, o0 o0Var) {
        this.d = p0Var;
        this.e = o0Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.d.get(obj) != null;
    }

    @Override // com.google.android.gms.internal.cast.c0
    public final int f(Object[] objArr) {
        return this.e.f(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.e.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.d.h;
    }
}
