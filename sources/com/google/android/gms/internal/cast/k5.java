package com.google.android.gms.internal.cast;

import j$.util.DesugarCollections;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class k5 extends r4 implements RandomAccess, l5 {
    public final List b;

    static {
        new k5();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k5(int i10) {
        super(true);
        ArrayList arrayList = new ArrayList(i10);
        this.b = arrayList;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i10, Object obj) {
        h();
        this.b.add(i10, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.cast.r4, java.util.AbstractList, java.util.List
    public final boolean addAll(int i10, Collection collection) {
        h();
        if (collection instanceof l5) {
            collection = ((l5) collection).zzh();
        }
        boolean addAll = this.b.addAll(i10, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // com.google.android.gms.internal.cast.l5
    public final Object c(int i10) {
        return this.b.get(i10);
    }

    @Override // com.google.android.gms.internal.cast.r4, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        h();
        this.b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final String get(int i10) {
        String str;
        List list = this.b;
        Object obj = list.get(i10);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (!(obj instanceof u4)) {
            byte[] bArr = (byte[]) obj;
            String str2 = new String(bArr, i5.a);
            b1 b1Var = r6.a;
            int length = bArr.length;
            b1Var.getClass();
            if (b1.a(length, bArr)) {
                list.set(i10, str2);
            }
            return str2;
        }
        u4 u4Var = (u4) obj;
        Charset charset = i5.a;
        if (u4Var.n() == 0) {
            str = "";
        } else {
            str = new String(u4Var.b, 0, u4Var.n(), charset);
        }
        int n10 = u4Var.n();
        byte[] bArr2 = u4Var.b;
        r6.a.getClass();
        if (b1.a(n10, bArr2)) {
            list.set(i10, str);
        }
        return str;
    }

    @Override // com.google.android.gms.internal.cast.r4, java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        h();
        Object remove = this.b.remove(i10);
        ((AbstractList) this).modCount++;
        if (remove instanceof String) {
            return (String) remove;
        }
        if (!(remove instanceof u4)) {
            return new String((byte[]) remove, i5.a);
        }
        u4 u4Var = (u4) remove;
        Charset charset = i5.a;
        if (u4Var.n() == 0) {
            return "";
        }
        return new String(u4Var.b, 0, u4Var.n(), charset);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        h();
        Object obj2 = this.b.set(i10, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (!(obj2 instanceof u4)) {
            return new String((byte[]) obj2, i5.a);
        }
        u4 u4Var = (u4) obj2;
        Charset charset = i5.a;
        if (u4Var.n() == 0) {
            return "";
        }
        return new String(u4Var.b, 0, u4Var.n(), charset);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.b.size();
    }

    @Override // com.google.android.gms.internal.cast.l5
    public final l5 zzd() {
        return this.a ? new k6(this) : this;
    }

    @Override // com.google.android.gms.internal.cast.h5
    public final h5 zzg(int i10) {
        List list = this.b;
        if (i10 < list.size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i10);
        arrayList.addAll(list);
        return new k5(arrayList);
    }

    @Override // com.google.android.gms.internal.cast.l5
    public final List zzh() {
        return DesugarCollections.unmodifiableList(this.b);
    }

    public k5(ArrayList arrayList) {
        super(true);
        this.b = arrayList;
    }

    public k5() {
        super(false);
        this.b = Collections.EMPTY_LIST;
    }

    @Override // com.google.android.gms.internal.cast.r4, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.b.size(), collection);
    }
}
