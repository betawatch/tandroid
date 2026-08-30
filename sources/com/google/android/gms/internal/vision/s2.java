package com.google.android.gms.internal.vision;

import j$.util.DesugarCollections;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class s2 extends AbstractList implements t1, RandomAccess {
    public final r1 a;

    public s2(r1 r1Var) {
        this.a = r1Var;
    }

    @Override // com.google.android.gms.internal.vision.t1
    public final Object a(int i10) {
        return this.a.b.get(i10);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        return (String) this.a.get(i10);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        y2 y2Var = new y2();
        y2Var.a = this.a.iterator();
        return y2Var;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i10) {
        r2 r2Var = new r2();
        r2Var.a = this.a.listIterator(i10);
        return r2Var;
    }

    @Override // com.google.android.gms.internal.vision.t1
    public final void m(q0 q0Var) {
        throw new UnsupportedOperationException();
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
