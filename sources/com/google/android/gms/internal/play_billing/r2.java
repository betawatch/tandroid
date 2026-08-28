package com.google.android.gms.internal.play_billing;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class r2 extends f1 implements RandomAccess {
    public static final Object[] d;
    public static final r2 e;
    public Object[] b;
    public int c;

    static {
        Object[] objArr = new Object[0];
        d = objArr;
        e = new r2(objArr, 0, false);
    }

    public r2(Object[] objArr, int i9, boolean z10) {
        super(z10);
        this.b = objArr;
        this.c = i9;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i9, Object obj) {
        int i10;
        i();
        if (i9 < 0 || i9 > (i10 = this.c)) {
            throw new IndexOutOfBoundsException(aa.d.k(i9, this.c, "Index:", ", Size:"));
        }
        int i11 = i9 + 1;
        Object[] objArr = this.b;
        int length = objArr.length;
        if (i10 < length) {
            System.arraycopy(objArr, i9, objArr, i11, i10 - i9);
        } else {
            Object[] objArr2 = new Object[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.b, 0, objArr2, 0, i9);
            System.arraycopy(this.b, i9, objArr2, i11, this.c - i9);
            this.b = objArr2;
        }
        this.b[i9] = obj;
        this.c++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i9) {
        n(i9);
        return this.b[i9];
    }

    public final void n(int i9) {
        if (i9 < 0 || i9 >= this.c) {
            throw new IndexOutOfBoundsException(aa.d.k(i9, this.c, "Index:", ", Size:"));
        }
    }

    @Override // com.google.android.gms.internal.play_billing.f1, java.util.AbstractList, java.util.List
    public final Object remove(int i9) {
        i();
        n(i9);
        Object[] objArr = this.b;
        Object obj = objArr[i9];
        if (i9 < this.c - 1) {
            System.arraycopy(objArr, i9 + 1, objArr, i9, (r2 - i9) - 1);
        }
        this.c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i9, Object obj) {
        i();
        n(i9);
        Object[] objArr = this.b;
        Object obj2 = objArr[i9];
        objArr[i9] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c;
    }

    @Override // com.google.android.gms.internal.play_billing.z1
    public final /* bridge */ /* synthetic */ z1 zzd(int i9) {
        if (i9 >= this.c) {
            return new r2(i9 == 0 ? d : Arrays.copyOf(this.b, i9), this.c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        i();
        int i9 = this.c;
        int length = this.b.length;
        if (i9 == length) {
            this.b = Arrays.copyOf(this.b, Math.max(((length * 3) / 2) + 1, 10));
        }
        Object[] objArr = this.b;
        int i10 = this.c;
        this.c = i10 + 1;
        objArr[i10] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
