package com.google.android.gms.internal.cast;

import j$.util.DesugarCollections;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class n6 extends AbstractList implements RandomAccess, o5 {
    public final n5 a;

    public n6(n5 n5Var) {
        this.a = n5Var;
    }

    @Override // com.google.android.gms.internal.cast.o5
    public final Object c(int i9) {
        return this.a.b.get(i9);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i9) {
        return this.a.get(i9);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new m6(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i9) {
        return new l6(this, i9);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.b.size();
    }

    @Override // com.google.android.gms.internal.cast.o5
    public final List zzh() {
        return DesugarCollections.unmodifiableList(this.a.b);
    }

    @Override // com.google.android.gms.internal.cast.o5
    public final o5 zzd() {
        return this;
    }
}
