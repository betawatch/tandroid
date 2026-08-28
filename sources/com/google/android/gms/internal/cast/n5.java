package com.google.android.gms.internal.cast;

import j$.util.DesugarCollections;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class n5 extends u4 implements RandomAccess, o5 {
    public final List b;

    static {
        new n5();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n5(int i9) {
        super(true);
        ArrayList arrayList = new ArrayList(i9);
        this.b = arrayList;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i9, Object obj) {
        i();
        this.b.add(i9, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.cast.u4, java.util.AbstractList, java.util.List
    public final boolean addAll(int i9, Collection collection) {
        i();
        if (collection instanceof o5) {
            collection = ((o5) collection).zzh();
        }
        boolean addAll = this.b.addAll(i9, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // com.google.android.gms.internal.cast.o5
    public final Object c(int i9) {
        return this.b.get(i9);
    }

    @Override // com.google.android.gms.internal.cast.u4, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        i();
        this.b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public final String get(int i9) {
        String str;
        List list = this.b;
        Object obj = list.get(i9);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (!(obj instanceof x4)) {
            byte[] bArr = (byte[]) obj;
            String str2 = new String(bArr, l5.a);
            e1 e1Var = u6.a;
            int length = bArr.length;
            e1Var.getClass();
            if (e1.a(length, bArr)) {
                list.set(i9, str2);
            }
            return str2;
        }
        x4 x4Var = (x4) obj;
        Charset charset = l5.a;
        if (x4Var.o() == 0) {
            str = "";
        } else {
            str = new String(x4Var.b, 0, x4Var.o(), charset);
        }
        int o6 = x4Var.o();
        byte[] bArr2 = x4Var.b;
        u6.a.getClass();
        if (e1.a(o6, bArr2)) {
            list.set(i9, str);
        }
        return str;
    }

    @Override // com.google.android.gms.internal.cast.u4, java.util.AbstractList, java.util.List
    public final Object remove(int i9) {
        i();
        Object remove = this.b.remove(i9);
        ((AbstractList) this).modCount++;
        if (remove instanceof String) {
            return (String) remove;
        }
        if (!(remove instanceof x4)) {
            return new String((byte[]) remove, l5.a);
        }
        x4 x4Var = (x4) remove;
        Charset charset = l5.a;
        if (x4Var.o() == 0) {
            return "";
        }
        return new String(x4Var.b, 0, x4Var.o(), charset);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i9, Object obj) {
        i();
        Object obj2 = this.b.set(i9, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (!(obj2 instanceof x4)) {
            return new String((byte[]) obj2, l5.a);
        }
        x4 x4Var = (x4) obj2;
        Charset charset = l5.a;
        if (x4Var.o() == 0) {
            return "";
        }
        return new String(x4Var.b, 0, x4Var.o(), charset);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.b.size();
    }

    @Override // com.google.android.gms.internal.cast.o5
    public final o5 zzd() {
        return this.a ? new n6(this) : this;
    }

    @Override // com.google.android.gms.internal.cast.k5
    public final k5 zzg(int i9) {
        List list = this.b;
        if (i9 < list.size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i9);
        arrayList.addAll(list);
        return new n5(arrayList);
    }

    @Override // com.google.android.gms.internal.cast.o5
    public final List zzh() {
        return DesugarCollections.unmodifiableList(this.b);
    }

    public n5(ArrayList arrayList) {
        super(true);
        this.b = arrayList;
    }

    public n5() {
        super(false);
        this.b = Collections.EMPTY_LIST;
    }

    @Override // com.google.android.gms.internal.cast.u4, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.b.size(), collection);
    }
}
