package com.google.android.gms.internal.clearcut;

import j$.util.DesugarCollections;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class d1 extends AbstractList implements g0, RandomAccess {
    public final f0 a;

    public d1(f0 f0Var) {
        this.a = f0Var;
    }

    @Override // com.google.android.gms.internal.clearcut.g0
    public final List c() {
        return DesugarCollections.unmodifiableList(this.a.b);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i3) {
        return (String) this.a.get(i3);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        b8.o oVar = new b8.o();
        oVar.b = this.a.iterator();
        return oVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i3) {
        e1 e1Var = new e1();
        e1Var.a = this.a.listIterator(i3);
        return e1Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.size();
    }

    @Override // com.google.android.gms.internal.clearcut.g0
    public final g0 e() {
        return this;
    }
}
