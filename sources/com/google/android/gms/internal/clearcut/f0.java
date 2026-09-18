package com.google.android.gms.internal.clearcut;

import j$.util.DesugarCollections;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class f0 extends k implements g0, RandomAccess {
    public final ArrayList b;

    static {
        new f0(10).a = false;
    }

    public f0(int i10) {
        this(new ArrayList(i10));
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        i();
        this.b.add(i10, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.clearcut.k, java.util.AbstractList, java.util.List
    public final boolean addAll(int i10, Collection collection) {
        i();
        if (collection instanceof g0) {
            collection = ((g0) collection).e();
        }
        boolean addAll = this.b.addAll(i10, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // com.google.android.gms.internal.clearcut.k, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        i();
        this.b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.clearcut.g0
    public final List e() {
        return DesugarCollections.unmodifiableList(this.b);
    }

    @Override // com.google.android.gms.internal.clearcut.c0
    public final c0 f(int i10) {
        ArrayList arrayList = this.b;
        if (i10 < arrayList.size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList2 = new ArrayList(i10);
        arrayList2.addAll(arrayList);
        return new f0(arrayList2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        ArrayList arrayList = this.b;
        Object obj = arrayList.get(i10);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (!(obj instanceof o)) {
            byte[] bArr = (byte[]) obj;
            String str = new String(bArr, a0.a);
            if (m1.a.t(bArr, 0, bArr.length)) {
                arrayList.set(i10, str);
            }
            return str;
        }
        o oVar = (o) obj;
        String str2 = oVar.size() == 0 ? "" : new String(oVar.b, oVar.i(), oVar.size(), a0.a);
        int i11 = oVar.i();
        if (m1.a.t(oVar.b, i11, oVar.size() + i11)) {
            arrayList.set(i10, str2);
        }
        return str2;
    }

    @Override // com.google.android.gms.internal.clearcut.g0
    public final g0 k() {
        return this.a ? new e1(this) : this;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        i();
        Object remove = this.b.remove(i10);
        ((AbstractList) this).modCount++;
        if (remove instanceof String) {
            return (String) remove;
        }
        if (!(remove instanceof o)) {
            return new String((byte[]) remove, a0.a);
        }
        o oVar = (o) remove;
        return oVar.size() == 0 ? "" : new String(oVar.b, oVar.i(), oVar.size(), a0.a);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        i();
        Object obj2 = this.b.set(i10, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (!(obj2 instanceof o)) {
            return new String((byte[]) obj2, a0.a);
        }
        o oVar = (o) obj2;
        return oVar.size() == 0 ? "" : new String(oVar.b, oVar.i(), oVar.size(), a0.a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.b.size();
    }

    public f0(ArrayList arrayList) {
        this.b = arrayList;
    }

    @Override // com.google.android.gms.internal.clearcut.k, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.b.size(), collection);
    }
}
