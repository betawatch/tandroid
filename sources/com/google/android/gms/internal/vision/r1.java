package com.google.android.gms.internal.vision;

import j$.util.DesugarCollections;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class r1 extends n0 implements t1, RandomAccess {
    public final ArrayList b;

    static {
        new r1(10).a = false;
    }

    public r1(int i10) {
        this(new ArrayList(i10));
    }

    @Override // com.google.android.gms.internal.vision.t1
    public final Object a(int i10) {
        return this.b.get(i10);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        i();
        this.b.add(i10, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.vision.n0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.b.size(), collection);
    }

    @Override // com.google.android.gms.internal.vision.n0, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        i();
        this.b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        ArrayList arrayList = this.b;
        Object obj = arrayList.get(i10);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (!(obj instanceof q0)) {
            byte[] bArr = (byte[]) obj;
            String str = new String(bArr, j1.a);
            if (a3.a.s(0, bArr.length, bArr)) {
                arrayList.set(i10, str);
            }
            return str;
        }
        q0 q0Var = (q0) obj;
        String str2 = q0Var.n() == 0 ? "" : new String(q0Var.b, q0Var.r(), q0Var.n(), j1.a);
        int r10 = q0Var.r();
        if (a3.a.s(r10, q0Var.n() + r10, q0Var.b)) {
            arrayList.set(i10, str2);
        }
        return str2;
    }

    @Override // com.google.android.gms.internal.vision.t1
    public final void m(q0 q0Var) {
        i();
        this.b.add(q0Var);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.vision.n0, java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        i();
        Object remove = this.b.remove(i10);
        ((AbstractList) this).modCount++;
        if (remove instanceof String) {
            return (String) remove;
        }
        if (!(remove instanceof q0)) {
            return new String((byte[]) remove, j1.a);
        }
        q0 q0Var = (q0) remove;
        return q0Var.n() == 0 ? "" : new String(q0Var.b, q0Var.r(), q0Var.n(), j1.a);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        i();
        Object obj2 = this.b.set(i10, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (!(obj2 instanceof q0)) {
            return new String((byte[]) obj2, j1.a);
        }
        q0 q0Var = (q0) obj2;
        return q0Var.n() == 0 ? "" : new String(q0Var.b, q0Var.r(), q0Var.n(), j1.a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.b.size();
    }

    @Override // com.google.android.gms.internal.vision.o1
    public final o1 zza(int i10) {
        ArrayList arrayList = this.b;
        if (i10 < arrayList.size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList2 = new ArrayList(i10);
        arrayList2.addAll(arrayList);
        return new r1(arrayList2);
    }

    @Override // com.google.android.gms.internal.vision.t1
    public final List zzd() {
        return DesugarCollections.unmodifiableList(this.b);
    }

    @Override // com.google.android.gms.internal.vision.t1
    public final t1 zze() {
        return this.a ? new s2(this) : this;
    }

    public r1(ArrayList arrayList) {
        this.b = arrayList;
    }

    @Override // com.google.android.gms.internal.vision.n0, java.util.AbstractList, java.util.List
    public final boolean addAll(int i10, Collection collection) {
        i();
        if (collection instanceof t1) {
            collection = ((t1) collection).zzd();
        }
        boolean addAll = this.b.addAll(i10, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }
}
