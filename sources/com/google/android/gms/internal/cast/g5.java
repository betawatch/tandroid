package com.google.android.gms.internal.cast;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class g5 extends u4 implements RandomAccess, h5, d6 {
    public static final g5 d = new g5(new int[0], 0, false);
    public int[] b;
    public int c;

    public g5(int[] iArr, int i9, boolean z10) {
        super(z10);
        this.b = iArr;
        this.c = i9;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i9, Object obj) {
        int i10;
        int intValue = ((Integer) obj).intValue();
        i();
        if (i9 < 0 || i9 > (i10 = this.c)) {
            throw new IndexOutOfBoundsException(aa.d.k(i9, this.c, "Index:", ", Size:"));
        }
        int i11 = i9 + 1;
        int[] iArr = this.b;
        if (i10 < iArr.length) {
            System.arraycopy(iArr, i9, iArr, i11, i10 - i9);
        } else {
            int[] iArr2 = new int[((i10 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i9);
            System.arraycopy(this.b, i9, iArr2, i11, this.c - i9);
            this.b = iArr2;
        }
        this.b[i9] = intValue;
        this.c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.cast.u4, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        i();
        Charset charset = l5.a;
        collection.getClass();
        if (!(collection instanceof g5)) {
            return super.addAll(collection);
        }
        g5 g5Var = (g5) collection;
        int i9 = g5Var.c;
        if (i9 == 0) {
            return false;
        }
        int i10 = this.c;
        if (ConnectionsManager.DEFAULT_DATACENTER_ID - i10 < i9) {
            throw new OutOfMemoryError();
        }
        int i11 = i10 + i9;
        int[] iArr = this.b;
        if (i11 > iArr.length) {
            this.b = Arrays.copyOf(iArr, i11);
        }
        System.arraycopy(g5Var.b, 0, this.b, this.c, g5Var.c);
        this.c = i11;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.cast.u4, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g5)) {
            return super.equals(obj);
        }
        g5 g5Var = (g5) obj;
        if (this.c != g5Var.c) {
            return false;
        }
        int[] iArr = g5Var.b;
        for (int i9 = 0; i9 < this.c; i9++) {
            if (this.b[i9] != iArr[i9]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i9) {
        n(i9);
        return Integer.valueOf(this.b[i9]);
    }

    @Override // com.google.android.gms.internal.cast.u4, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i9 = 1;
        for (int i10 = 0; i10 < this.c; i10++) {
            i9 = (i9 * 31) + this.b[i10];
        }
        return i9;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i9 = this.c;
        for (int i10 = 0; i10 < i9; i10++) {
            if (this.b[i10] == intValue) {
                return i10;
            }
        }
        return -1;
    }

    public final void n(int i9) {
        if (i9 < 0 || i9 >= this.c) {
            throw new IndexOutOfBoundsException(aa.d.k(i9, this.c, "Index:", ", Size:"));
        }
    }

    @Override // com.google.android.gms.internal.cast.u4, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i9) {
        i();
        n(i9);
        int[] iArr = this.b;
        int i10 = iArr[i9];
        if (i9 < this.c - 1) {
            System.arraycopy(iArr, i9 + 1, iArr, i9, (r2 - i9) - 1);
        }
        this.c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i9, int i10) {
        i();
        if (i10 < i9) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.b;
        System.arraycopy(iArr, i10, iArr, i9, this.c - i10);
        this.c -= i10 - i9;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i9, Object obj) {
        int intValue = ((Integer) obj).intValue();
        i();
        n(i9);
        int[] iArr = this.b;
        int i10 = iArr[i9];
        iArr[i9] = intValue;
        return Integer.valueOf(i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c;
    }

    @Override // com.google.android.gms.internal.cast.k5
    public final k5 zzg(int i9) {
        if (i9 >= this.c) {
            return new g5(Arrays.copyOf(this.b, i9), this.c, true);
        }
        throw new IllegalArgumentException();
    }

    public final void zzh(int i9) {
        i();
        int i10 = this.c;
        int[] iArr = this.b;
        if (i10 == iArr.length) {
            int[] iArr2 = new int[((i10 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i10);
            this.b = iArr2;
        }
        int[] iArr3 = this.b;
        int i11 = this.c;
        this.c = i11 + 1;
        iArr3[i11] = i9;
    }

    @Override // com.google.android.gms.internal.cast.u4, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzh(((Integer) obj).intValue());
        return true;
    }
}
