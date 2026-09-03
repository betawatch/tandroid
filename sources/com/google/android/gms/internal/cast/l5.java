package com.google.android.gms.internal.cast;

import j$.util.DesugarCollections;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class l5 extends t4 implements RandomAccess, m5 {
    public final List b;

    static {
        new l5();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l5(int i10) {
        super(true);
        ArrayList arrayList = new ArrayList(i10);
        this.b = arrayList;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i10, Object obj) {
        i();
        this.b.add(i10, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.cast.t4, java.util.AbstractList, java.util.List
    public final boolean addAll(int i10, Collection collection) {
        i();
        if (collection instanceof m5) {
            collection = ((m5) collection).zzh();
        }
        boolean addAll = this.b.addAll(i10, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // com.google.android.gms.internal.cast.m5
    public final Object c(int i10) {
        return this.b.get(i10);
    }

    @Override // com.google.android.gms.internal.cast.t4, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
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
        if (!(obj instanceof w4)) {
            byte[] bArr = (byte[]) obj;
            String str2 = new String(bArr, j5.a);
            d1 d1Var = s6.a;
            int length = bArr.length;
            d1Var.getClass();
            if (d1.a(length, bArr)) {
                list.set(i10, str2);
            }
            return str2;
        }
        w4 w4Var = (w4) obj;
        Charset charset = j5.a;
        if (w4Var.o() == 0) {
            str = "";
        } else {
            str = new String(w4Var.b, 0, w4Var.o(), charset);
        }
        int o10 = w4Var.o();
        byte[] bArr2 = w4Var.b;
        s6.a.getClass();
        if (d1.a(o10, bArr2)) {
            list.set(i10, str);
        }
        return str;
    }

    @Override // com.google.android.gms.internal.cast.t4, java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        i();
        Object remove = this.b.remove(i10);
        ((AbstractList) this).modCount++;
        if (remove instanceof String) {
            return (String) remove;
        }
        if (!(remove instanceof w4)) {
            return new String((byte[]) remove, j5.a);
        }
        w4 w4Var = (w4) remove;
        Charset charset = j5.a;
        if (w4Var.o() == 0) {
            return "";
        }
        return new String(w4Var.b, 0, w4Var.o(), charset);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        i();
        Object obj2 = this.b.set(i10, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (!(obj2 instanceof w4)) {
            return new String((byte[]) obj2, j5.a);
        }
        w4 w4Var = (w4) obj2;
        Charset charset = j5.a;
        if (w4Var.o() == 0) {
            return "";
        }
        return new String(w4Var.b, 0, w4Var.o(), charset);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.b.size();
    }

    @Override // com.google.android.gms.internal.cast.m5
    public final m5 zzd() {
        return this.a ? new l6(this) : this;
    }

    @Override // com.google.android.gms.internal.cast.i5
    public final i5 zzg(int i10) {
        List list = this.b;
        if (i10 < list.size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i10);
        arrayList.addAll(list);
        return new l5(arrayList);
    }

    @Override // com.google.android.gms.internal.cast.m5
    public final List zzh() {
        return DesugarCollections.unmodifiableList(this.b);
    }

    public l5(ArrayList arrayList) {
        super(true);
        this.b = arrayList;
    }

    public l5() {
        super(false);
        this.b = Collections.EMPTY_LIST;
    }

    @Override // com.google.android.gms.internal.cast.t4, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.b.size(), collection);
    }
}
