package com.google.android.gms.internal.cast;

import j$.util.DesugarCollections;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class m5 extends u4 implements RandomAccess, n5 {
    public final List b;

    static {
        new m5();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m5(int i10) {
        super(true);
        ArrayList arrayList = new ArrayList(i10);
        this.b = arrayList;
    }

    @Override // com.google.android.gms.internal.cast.n5
    public final Object a(int i10) {
        return this.b.get(i10);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i10, Object obj) {
        i();
        this.b.add(i10, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.cast.u4, java.util.AbstractList, java.util.List
    public final boolean addAll(int i10, Collection collection) {
        i();
        if (collection instanceof n5) {
            collection = ((n5) collection).zzh();
        }
        boolean addAll = this.b.addAll(i10, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // com.google.android.gms.internal.cast.u4, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        i();
        this.b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public final String get(int i10) {
        String str;
        List list = this.b;
        Object obj = list.get(i10);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (!(obj instanceof x4)) {
            byte[] bArr = (byte[]) obj;
            String str2 = new String(bArr, k5.a);
            e1 e1Var = t6.a;
            int length = bArr.length;
            e1Var.getClass();
            if (e1.a(length, bArr)) {
                list.set(i10, str2);
            }
            return str2;
        }
        x4 x4Var = (x4) obj;
        Charset charset = k5.a;
        if (x4Var.o() == 0) {
            str = "";
        } else {
            str = new String(x4Var.b, 0, x4Var.o(), charset);
        }
        int o10 = x4Var.o();
        byte[] bArr2 = x4Var.b;
        t6.a.getClass();
        if (e1.a(o10, bArr2)) {
            list.set(i10, str);
        }
        return str;
    }

    @Override // com.google.android.gms.internal.cast.u4, java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        i();
        Object remove = this.b.remove(i10);
        ((AbstractList) this).modCount++;
        if (remove instanceof String) {
            return (String) remove;
        }
        if (!(remove instanceof x4)) {
            return new String((byte[]) remove, k5.a);
        }
        x4 x4Var = (x4) remove;
        Charset charset = k5.a;
        if (x4Var.o() == 0) {
            return "";
        }
        return new String(x4Var.b, 0, x4Var.o(), charset);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        i();
        Object obj2 = this.b.set(i10, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (!(obj2 instanceof x4)) {
            return new String((byte[]) obj2, k5.a);
        }
        x4 x4Var = (x4) obj2;
        Charset charset = k5.a;
        if (x4Var.o() == 0) {
            return "";
        }
        return new String(x4Var.b, 0, x4Var.o(), charset);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.b.size();
    }

    @Override // com.google.android.gms.internal.cast.n5
    public final n5 zzd() {
        return this.a ? new m6(this) : this;
    }

    @Override // com.google.android.gms.internal.cast.j5
    public final j5 zzg(int i10) {
        List list = this.b;
        if (i10 < list.size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i10);
        arrayList.addAll(list);
        return new m5(arrayList);
    }

    @Override // com.google.android.gms.internal.cast.n5
    public final List zzh() {
        return DesugarCollections.unmodifiableList(this.b);
    }

    public m5(ArrayList arrayList) {
        super(true);
        this.b = arrayList;
    }

    public m5() {
        super(false);
        this.b = Collections.EMPTY_LIST;
    }

    @Override // com.google.android.gms.internal.cast.u4, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.b.size(), collection);
    }
}
