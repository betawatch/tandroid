package com.google.android.gms.internal.cast;

import j$.util.DesugarCollections;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class n5 extends u4 implements RandomAccess, o5 {
    public final List b;

    static {
        new n5();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n5(int i10) {
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

    @Override // com.google.android.gms.internal.cast.u4, java.util.AbstractList, java.util.List
    public final boolean addAll(int i10, Collection collection) {
        i();
        if (collection instanceof o5) {
            collection = ((o5) collection).zzh();
        }
        boolean addAll = this.b.addAll(i10, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // com.google.android.gms.internal.cast.o5
    public final Object c(int i10) {
        return this.b.get(i10);
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
            String str2 = new String(bArr, l5.a);
            f1 f1Var = u6.a;
            int length = bArr.length;
            f1Var.getClass();
            if (f1.a(length, bArr)) {
                list.set(i10, str2);
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
        int o10 = x4Var.o();
        byte[] bArr2 = x4Var.b;
        u6.a.getClass();
        if (f1.a(o10, bArr2)) {
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
    public final Object set(int i10, Object obj) {
        i();
        Object obj2 = this.b.set(i10, (String) obj);
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
    public final k5 zzg(int i10) {
        List list = this.b;
        if (i10 < list.size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i10);
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
