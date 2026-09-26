package com.google.android.gms.internal.play_billing;

import java.util.Iterator;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes.dex */
public final class y extends t {
    public final transient a0 c;
    public final transient z d;

    public y(a0 a0Var, z zVar) {
        this.c = a0Var;
        this.d = zVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.c.get(obj) != null;
    }

    @Override // com.google.android.gms.internal.play_billing.o
    public final int i(Object[] objArr) {
        return this.d.i(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.d.listIterator(0);
    }

    @Override // com.google.android.gms.internal.play_billing.t, com.google.android.gms.internal.play_billing.o
    public final r p() {
        return this.d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.c.h;
    }
}
