package com.google.android.gms.internal.cast;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class f6 extends u4 implements RandomAccess {
    public static final f6 d = new f6(new Object[0], 0, false);
    public Object[] b;
    public int c;

    public f6(Object[] objArr, int i10, boolean z10) {
        super(z10);
        this.b = objArr;
        this.c = i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        i();
        if (i10 < 0 || i10 > (i11 = this.c)) {
            throw new IndexOutOfBoundsException(a4.w.k(i10, this.c, "Index:", ", Size:"));
        }
        int i12 = i10 + 1;
        Object[] objArr = this.b;
        if (i11 < objArr.length) {
            System.arraycopy(objArr, i10, objArr, i12, i11 - i10);
        } else {
            Object[] objArr2 = new Object[((i11 * 3) / 2) + 1];
            System.arraycopy(objArr, 0, objArr2, 0, i10);
            System.arraycopy(this.b, i10, objArr2, i12, this.c - i10);
            this.b = objArr2;
        }
        this.b[i10] = obj;
        this.c++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        n(i10);
        return this.b[i10];
    }

    public final void n(int i10) {
        if (i10 < 0 || i10 >= this.c) {
            throw new IndexOutOfBoundsException(a4.w.k(i10, this.c, "Index:", ", Size:"));
        }
    }

    @Override // com.google.android.gms.internal.cast.u4, java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        i();
        n(i10);
        Object[] objArr = this.b;
        Object obj = objArr[i10];
        if (i10 < this.c - 1) {
            System.arraycopy(objArr, i10 + 1, objArr, i10, (r2 - i10) - 1);
        }
        this.c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        i();
        n(i10);
        Object[] objArr = this.b;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c;
    }

    @Override // com.google.android.gms.internal.cast.k5
    public final /* bridge */ /* synthetic */ k5 zzg(int i10) {
        if (i10 >= this.c) {
            return new f6(Arrays.copyOf(this.b, i10), this.c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.cast.u4, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        i();
        int i10 = this.c;
        Object[] objArr = this.b;
        if (i10 == objArr.length) {
            this.b = Arrays.copyOf(objArr, ((i10 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.b;
        int i11 = this.c;
        this.c = i11 + 1;
        objArr2[i11] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
