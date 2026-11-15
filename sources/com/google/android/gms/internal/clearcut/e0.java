package com.google.android.gms.internal.clearcut;

import j$.util.DesugarCollections;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class e0 extends j implements f0, RandomAccess {
    public final ArrayList b;

    static {
        new e0(10).a = false;
    }

    public e0(int i7) {
        this(new ArrayList(i7));
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i7, Object obj) {
        f();
        this.b.add(i7, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.clearcut.j, java.util.AbstractList, java.util.List
    public final boolean addAll(int i7, Collection collection) {
        f();
        if (collection instanceof f0) {
            collection = ((f0) collection).c();
        }
        boolean addAll = this.b.addAll(i7, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // com.google.android.gms.internal.clearcut.f0
    public final List c() {
        return DesugarCollections.unmodifiableList(this.b);
    }

    @Override // com.google.android.gms.internal.clearcut.j, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        f();
        this.b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.clearcut.f0
    public final f0 d() {
        return this.a ? new d1(this) : this;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i7) {
        ArrayList arrayList = this.b;
        Object obj = arrayList.get(i7);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (!(obj instanceof n)) {
            byte[] bArr = (byte[]) obj;
            String str = new String(bArr, z.a);
            if (k1.a.t(bArr, 0, bArr.length)) {
                arrayList.set(i7, str);
            }
            return str;
        }
        n nVar = (n) obj;
        String str2 = nVar.size() == 0 ? "" : new String(nVar.b, nVar.f(), nVar.size(), z.a);
        int f10 = nVar.f();
        if (k1.a.t(nVar.b, f10, nVar.size() + f10)) {
            arrayList.set(i7, str2);
        }
        return str2;
    }

    @Override // com.google.android.gms.internal.clearcut.b0
    public final b0 h(int i7) {
        ArrayList arrayList = this.b;
        if (i7 < arrayList.size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList2 = new ArrayList(i7);
        arrayList2.addAll(arrayList);
        return new e0(arrayList2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i7) {
        f();
        Object remove = this.b.remove(i7);
        ((AbstractList) this).modCount++;
        if (remove instanceof String) {
            return (String) remove;
        }
        if (!(remove instanceof n)) {
            return new String((byte[]) remove, z.a);
        }
        n nVar = (n) remove;
        return nVar.size() == 0 ? "" : new String(nVar.b, nVar.f(), nVar.size(), z.a);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i7, Object obj) {
        f();
        Object obj2 = this.b.set(i7, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (!(obj2 instanceof n)) {
            return new String((byte[]) obj2, z.a);
        }
        n nVar = (n) obj2;
        return nVar.size() == 0 ? "" : new String(nVar.b, nVar.f(), nVar.size(), z.a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.b.size();
    }

    public e0(ArrayList arrayList) {
        this.b = arrayList;
    }

    @Override // com.google.android.gms.internal.clearcut.j, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.b.size(), collection);
    }
}
