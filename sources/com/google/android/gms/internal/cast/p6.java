package com.google.android.gms.internal.cast;

import j$.util.DesugarCollections;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class p6 extends AbstractList implements RandomAccess, q5 {
    public final p5 a;

    public p6(p5 p5Var) {
        this.a = p5Var;
    }

    @Override // com.google.android.gms.internal.cast.q5
    public final Object c(int i10) {
        return this.a.b.get(i10);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i10) {
        return this.a.get(i10);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new o6(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i10) {
        return new n6(this, i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.b.size();
    }

    @Override // com.google.android.gms.internal.cast.q5
    public final List zzh() {
        return DesugarCollections.unmodifiableList(this.a.b);
    }

    @Override // com.google.android.gms.internal.cast.q5
    public final q5 zzd() {
        return this;
    }
}
