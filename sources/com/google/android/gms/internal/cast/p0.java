package com.google.android.gms.internal.cast;

import java.util.Iterator;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class p0 extends j0 {
    public final transient r0 d;
    public final transient q0 e;

    public p0(r0 r0Var, q0 q0Var) {
        this.d = r0Var;
        this.e = q0Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.d.get(obj) != null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.e.listIterator(0);
    }

    @Override // com.google.android.gms.internal.cast.d0
    public final int l(Object[] objArr) {
        return this.e.l(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.d.h;
    }
}
