package com.google.android.gms.internal.cast;

import java.util.Iterator;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
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
