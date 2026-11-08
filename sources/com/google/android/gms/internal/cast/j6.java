package com.google.android.gms.internal.cast;

import j$.util.DesugarCollections;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class j6 extends AbstractList implements RandomAccess, k5 {
    public final j5 a;

    public j6(j5 j5Var) {
        this.a = j5Var;
    }

    @Override // com.google.android.gms.internal.cast.k5
    public final Object g(int i7) {
        return this.a.b.get(i7);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i7) {
        return this.a.get(i7);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new i6(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i7) {
        return new h6(this, i7);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.b.size();
    }

    @Override // com.google.android.gms.internal.cast.k5
    public final List zzh() {
        return DesugarCollections.unmodifiableList(this.a.b);
    }

    @Override // com.google.android.gms.internal.cast.k5
    public final k5 zzd() {
        return this;
    }
}
