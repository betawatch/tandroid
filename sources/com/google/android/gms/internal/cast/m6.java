package com.google.android.gms.internal.cast;

import j$.util.DesugarCollections;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class m6 extends AbstractList implements RandomAccess, n5 {
    public final m5 a;

    public m6(m5 m5Var) {
        this.a = m5Var;
    }

    @Override // com.google.android.gms.internal.cast.n5
    public final Object a(int i10) {
        return this.a.b.get(i10);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i10) {
        return this.a.get(i10);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new l6(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i10) {
        return new k6(this, i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.b.size();
    }

    @Override // com.google.android.gms.internal.cast.n5
    public final List zzh() {
        return DesugarCollections.unmodifiableList(this.a.b);
    }

    @Override // com.google.android.gms.internal.cast.n5
    public final n5 zzd() {
        return this;
    }
}
