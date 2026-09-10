package com.google.android.gms.internal.cast;

import j$.util.DesugarCollections;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class p5 extends w4 implements RandomAccess, q5 {
    public final List b;

    static {
        new p5();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p5(int i10) {
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

    @Override // com.google.android.gms.internal.cast.w4, java.util.AbstractList, java.util.List
    public final boolean addAll(int i10, Collection collection) {
        i();
        if (collection instanceof q5) {
            collection = ((q5) collection).zzh();
        }
        boolean addAll = this.b.addAll(i10, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // com.google.android.gms.internal.cast.q5
    public final Object c(int i10) {
        return this.b.get(i10);
    }

    @Override // com.google.android.gms.internal.cast.w4, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
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
        if (!(obj instanceof z4)) {
            byte[] bArr = (byte[]) obj;
            String str2 = new String(bArr, n5.a);
            g1 g1Var = w6.a;
            int length = bArr.length;
            g1Var.getClass();
            if (g1.a(length, bArr)) {
                list.set(i10, str2);
            }
            return str2;
        }
        z4 z4Var = (z4) obj;
        Charset charset = n5.a;
        if (z4Var.o() == 0) {
            str = "";
        } else {
            str = new String(z4Var.b, 0, z4Var.o(), charset);
        }
        int o9 = z4Var.o();
        byte[] bArr2 = z4Var.b;
        w6.a.getClass();
        if (g1.a(o9, bArr2)) {
            list.set(i10, str);
        }
        return str;
    }

    @Override // com.google.android.gms.internal.cast.w4, java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        i();
        Object remove = this.b.remove(i10);
        ((AbstractList) this).modCount++;
        if (remove instanceof String) {
            return (String) remove;
        }
        if (!(remove instanceof z4)) {
            return new String((byte[]) remove, n5.a);
        }
        z4 z4Var = (z4) remove;
        Charset charset = n5.a;
        if (z4Var.o() == 0) {
            return "";
        }
        return new String(z4Var.b, 0, z4Var.o(), charset);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        i();
        Object obj2 = this.b.set(i10, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (!(obj2 instanceof z4)) {
            return new String((byte[]) obj2, n5.a);
        }
        z4 z4Var = (z4) obj2;
        Charset charset = n5.a;
        if (z4Var.o() == 0) {
            return "";
        }
        return new String(z4Var.b, 0, z4Var.o(), charset);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.b.size();
    }

    @Override // com.google.android.gms.internal.cast.q5
    public final q5 zzd() {
        return this.a ? new p6(this) : this;
    }

    @Override // com.google.android.gms.internal.cast.m5
    public final m5 zzg(int i10) {
        List list = this.b;
        if (i10 < list.size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i10);
        arrayList.addAll(list);
        return new p5(arrayList);
    }

    @Override // com.google.android.gms.internal.cast.q5
    public final List zzh() {
        return DesugarCollections.unmodifiableList(this.b);
    }

    public p5(ArrayList arrayList) {
        super(true);
        this.b = arrayList;
    }

    public p5() {
        super(false);
        this.b = Collections.EMPTY_LIST;
    }

    @Override // com.google.android.gms.internal.cast.w4, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.b.size(), collection);
    }
}
