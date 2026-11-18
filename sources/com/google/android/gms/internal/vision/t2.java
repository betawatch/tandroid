package com.google.android.gms.internal.vision;

import j$.util.DesugarCollections;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class t2 extends AbstractList implements t1, RandomAccess {
    public final r1 a;

    public t2(r1 r1Var) {
        this.a = r1Var;
    }

    @Override // com.google.android.gms.internal.vision.t1
    public final Object a(int i7) {
        return this.a.b.get(i7);
    }

    @Override // com.google.android.gms.internal.vision.t1
    public final void e(q0 q0Var) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i7) {
        return (String) this.a.get(i7);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        z2 z2Var = new z2();
        z2Var.a = this.a.iterator();
        return z2Var;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i7) {
        s2 s2Var = new s2();
        s2Var.a = this.a.listIterator(i7);
        return s2Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.size();
    }

    @Override // com.google.android.gms.internal.vision.t1
    public final List zzd() {
        return DesugarCollections.unmodifiableList(this.a.b);
    }

    @Override // com.google.android.gms.internal.vision.t1
    public final t1 zze() {
        return this;
    }
}
