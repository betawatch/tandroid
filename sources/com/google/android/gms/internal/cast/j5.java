package com.google.android.gms.internal.cast;

import j$.util.DesugarCollections;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class j5 extends r4 implements RandomAccess, k5 {
    public final List b;

    static {
        new j5();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j5(int i7) {
        super(true);
        ArrayList arrayList = new ArrayList(i7);
        this.b = arrayList;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i7, Object obj) {
        f();
        this.b.add(i7, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.cast.r4, java.util.AbstractList, java.util.List
    public final boolean addAll(int i7, Collection collection) {
        f();
        if (collection instanceof k5) {
            collection = ((k5) collection).zzh();
        }
        boolean addAll = this.b.addAll(i7, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // com.google.android.gms.internal.cast.r4, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        f();
        this.b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.cast.k5
    public final Object g(int i7) {
        return this.b.get(i7);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final String get(int i7) {
        String str;
        List list = this.b;
        Object obj = list.get(i7);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (!(obj instanceof u4)) {
            byte[] bArr = (byte[]) obj;
            String str2 = new String(bArr, h5.a);
            b1 b1Var = q6.a;
            int length = bArr.length;
            b1Var.getClass();
            if (b1.a(length, bArr)) {
                list.set(i7, str2);
            }
            return str2;
        }
        u4 u4Var = (u4) obj;
        Charset charset = h5.a;
        if (u4Var.j() == 0) {
            str = "";
        } else {
            str = new String(u4Var.b, 0, u4Var.j(), charset);
        }
        int j3 = u4Var.j();
        byte[] bArr2 = u4Var.b;
        q6.a.getClass();
        if (b1.a(j3, bArr2)) {
            list.set(i7, str);
        }
        return str;
    }

    @Override // com.google.android.gms.internal.cast.r4, java.util.AbstractList, java.util.List
    public final Object remove(int i7) {
        f();
        Object remove = this.b.remove(i7);
        ((AbstractList) this).modCount++;
        if (remove instanceof String) {
            return (String) remove;
        }
        if (!(remove instanceof u4)) {
            return new String((byte[]) remove, h5.a);
        }
        u4 u4Var = (u4) remove;
        Charset charset = h5.a;
        if (u4Var.j() == 0) {
            return "";
        }
        return new String(u4Var.b, 0, u4Var.j(), charset);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i7, Object obj) {
        f();
        Object obj2 = this.b.set(i7, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (!(obj2 instanceof u4)) {
            return new String((byte[]) obj2, h5.a);
        }
        u4 u4Var = (u4) obj2;
        Charset charset = h5.a;
        if (u4Var.j() == 0) {
            return "";
        }
        return new String(u4Var.b, 0, u4Var.j(), charset);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.b.size();
    }

    @Override // com.google.android.gms.internal.cast.k5
    public final k5 zzd() {
        return this.a ? new j6(this) : this;
    }

    @Override // com.google.android.gms.internal.cast.g5
    public final g5 zzg(int i7) {
        List list = this.b;
        if (i7 < list.size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i7);
        arrayList.addAll(list);
        return new j5(arrayList);
    }

    @Override // com.google.android.gms.internal.cast.k5
    public final List zzh() {
        return DesugarCollections.unmodifiableList(this.b);
    }

    public j5(ArrayList arrayList) {
        super(true);
        this.b = arrayList;
    }

    public j5() {
        super(false);
        this.b = Collections.EMPTY_LIST;
    }

    @Override // com.google.android.gms.internal.cast.r4, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.b.size(), collection);
    }
}
