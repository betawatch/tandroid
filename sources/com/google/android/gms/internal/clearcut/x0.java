package com.google.android.gms.internal.clearcut;

import java.util.AbstractList;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class x0 extends k {
    public static final x0 c;
    public final ArrayList b;

    static {
        x0 x0Var = new x0(new ArrayList(10));
        c = x0Var;
        x0Var.a = false;
    }

    public x0(ArrayList arrayList) {
        this.b = arrayList;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i9, Object obj) {
        i();
        this.b.add(i9, obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.clearcut.c0
    public final c0 d(int i9) {
        ArrayList arrayList = this.b;
        if (i9 < arrayList.size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList2 = new ArrayList(i9);
        arrayList2.addAll(arrayList);
        return new x0(arrayList2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i9) {
        return this.b.get(i9);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i9) {
        i();
        Object remove = this.b.remove(i9);
        ((AbstractList) this).modCount++;
        return remove;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i9, Object obj) {
        i();
        Object obj2 = this.b.set(i9, obj);
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.b.size();
    }
}
