package com.google.android.gms.internal.cast;

import j$.util.DesugarCollections;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class k5 extends s4 implements RandomAccess, l5 {
    public final List b;

    static {
        new k5();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k5(int i3) {
        super(true);
        ArrayList arrayList = new ArrayList(i3);
        this.b = arrayList;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i3, Object obj) {
        h();
        this.b.add(i3, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.cast.s4, java.util.AbstractList, java.util.List
    public final boolean addAll(int i3, Collection collection) {
        h();
        if (collection instanceof l5) {
            collection = ((l5) collection).zzh();
        }
        boolean addAll = this.b.addAll(i3, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // com.google.android.gms.internal.cast.s4, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        h();
        this.b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.cast.l5
    public final Object d(int i3) {
        return this.b.get(i3);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final String get(int i3) {
        String str;
        List list = this.b;
        Object obj = list.get(i3);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (!(obj instanceof v4)) {
            byte[] bArr = (byte[]) obj;
            String str2 = new String(bArr, i5.a);
            c1 c1Var = r6.a;
            int length = bArr.length;
            c1Var.getClass();
            if (c1.a(length, bArr)) {
                list.set(i3, str2);
            }
            return str2;
        }
        v4 v4Var = (v4) obj;
        Charset charset = i5.a;
        if (v4Var.j() == 0) {
            str = "";
        } else {
            str = new String(v4Var.b, 0, v4Var.j(), charset);
        }
        int j10 = v4Var.j();
        byte[] bArr2 = v4Var.b;
        r6.a.getClass();
        if (c1.a(j10, bArr2)) {
            list.set(i3, str);
        }
        return str;
    }

    @Override // com.google.android.gms.internal.cast.s4, java.util.AbstractList, java.util.List
    public final Object remove(int i3) {
        h();
        Object remove = this.b.remove(i3);
        ((AbstractList) this).modCount++;
        if (remove instanceof String) {
            return (String) remove;
        }
        if (!(remove instanceof v4)) {
            return new String((byte[]) remove, i5.a);
        }
        v4 v4Var = (v4) remove;
        Charset charset = i5.a;
        if (v4Var.j() == 0) {
            return "";
        }
        return new String(v4Var.b, 0, v4Var.j(), charset);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i3, Object obj) {
        h();
        Object obj2 = this.b.set(i3, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (!(obj2 instanceof v4)) {
            return new String((byte[]) obj2, i5.a);
        }
        v4 v4Var = (v4) obj2;
        Charset charset = i5.a;
        if (v4Var.j() == 0) {
            return "";
        }
        return new String(v4Var.b, 0, v4Var.j(), charset);
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
    public final h5 zzg(int i3) {
        List list = this.b;
        if (i3 < list.size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i3);
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

    @Override // com.google.android.gms.internal.cast.s4, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.b.size(), collection);
    }
}
