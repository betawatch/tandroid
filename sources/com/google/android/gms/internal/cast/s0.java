package com.google.android.gms.internal.cast;

import java.util.Iterator;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final class s0 extends m0 {
    public final transient u0 d;
    public final transient t0 e;

    public s0(u0 u0Var, t0 t0Var) {
        this.d = u0Var;
        this.e = t0Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.d.get(obj) != null;
    }

    @Override // com.google.android.gms.internal.cast.g0
    public final int i(Object[] objArr) {
        return this.e.i(objArr);
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
