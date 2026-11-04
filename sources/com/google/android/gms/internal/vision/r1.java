package com.google.android.gms.internal.vision;

import j$.util.DesugarCollections;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class r1 extends n0 implements t1, RandomAccess {
    public final ArrayList b;

    static {
        new r1(10).a = false;
    }

    public r1(int i3) {
        this(new ArrayList(i3));
    }

    @Override // com.google.android.gms.internal.vision.t1
    public final Object a(int i3) {
        return this.b.get(i3);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i3, Object obj) {
        h();
        this.b.add(i3, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.vision.n0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.b.size(), collection);
    }

    @Override // com.google.android.gms.internal.vision.n0, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        h();
        this.b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.vision.t1
    public final void f(q0 q0Var) {
        h();
        this.b.add(q0Var);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i3) {
        ArrayList arrayList = this.b;
        Object obj = arrayList.get(i3);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (!(obj instanceof q0)) {
            byte[] bArr = (byte[]) obj;
            String str = new String(bArr, j1.a);
            if (a3.a.s(0, bArr.length, bArr)) {
                arrayList.set(i3, str);
            }
            return str;
        }
        q0 q0Var = (q0) obj;
        String str2 = q0Var.i() == 0 ? "" : new String(q0Var.b, q0Var.m(), q0Var.i(), j1.a);
        int m10 = q0Var.m();
        if (a3.a.s(m10, q0Var.i() + m10, q0Var.b)) {
            arrayList.set(i3, str2);
        }
        return str2;
    }

    @Override // com.google.android.gms.internal.vision.n0, java.util.AbstractList, java.util.List
    public final Object remove(int i3) {
        h();
        Object remove = this.b.remove(i3);
        ((AbstractList) this).modCount++;
        if (remove instanceof String) {
            return (String) remove;
        }
        if (!(remove instanceof q0)) {
            return new String((byte[]) remove, j1.a);
        }
        q0 q0Var = (q0) remove;
        return q0Var.i() == 0 ? "" : new String(q0Var.b, q0Var.m(), q0Var.i(), j1.a);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i3, Object obj) {
        h();
        Object obj2 = this.b.set(i3, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (!(obj2 instanceof q0)) {
            return new String((byte[]) obj2, j1.a);
        }
        q0 q0Var = (q0) obj2;
        return q0Var.i() == 0 ? "" : new String(q0Var.b, q0Var.m(), q0Var.i(), j1.a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.b.size();
    }

    @Override // com.google.android.gms.internal.vision.o1
    public final o1 zza(int i3) {
        ArrayList arrayList = this.b;
        if (i3 < arrayList.size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList2 = new ArrayList(i3);
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
    public final boolean addAll(int i3, Collection collection) {
        h();
        if (collection instanceof t1) {
            collection = ((t1) collection).zzd();
        }
        boolean addAll = this.b.addAll(i3, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }
}
