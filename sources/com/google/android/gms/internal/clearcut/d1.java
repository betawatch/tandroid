package com.google.android.gms.internal.clearcut;

import j$.util.DesugarCollections;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class d1 extends AbstractList implements f0, RandomAccess {
    public final e0 a;

    public d1(e0 e0Var) {
        this.a = e0Var;
    }

    @Override // com.google.android.gms.internal.clearcut.f0
    public final List e() {
        return DesugarCollections.unmodifiableList(this.a.b);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        return (String) this.a.get(i10);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        f1 f1Var = new f1();
        f1Var.b = this.a.iterator();
        return f1Var;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i10) {
        e1 e1Var = new e1();
        e1Var.a = this.a.listIterator(i10);
        return e1Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.size();
    }

    @Override // com.google.android.gms.internal.clearcut.f0
    public final f0 k() {
        return this;
    }
}
