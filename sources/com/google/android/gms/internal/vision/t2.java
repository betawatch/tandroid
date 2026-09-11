package com.google.android.gms.internal.vision;

import j$.util.DesugarCollections;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class t2 extends AbstractList implements t1, RandomAccess {
    public final r1 a;

    public t2(r1 r1Var) {
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
        z2 z2Var = new z2();
        z2Var.a = this.a.iterator();
        return z2Var;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i10) {
        s2 s2Var = new s2();
        s2Var.a = this.a.listIterator(i10);
        return s2Var;
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
