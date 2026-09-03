package com.google.android.gms.internal.cast;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class f5 extends u4 implements RandomAccess, g5, c6 {
    public static final f5 d = new f5(new int[0], 0, false);
    public int[] b;
    public int c;

    public f5(int[] iArr, int i10, boolean z4) {
        super(z4);
        this.b = iArr;
        this.c = i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        int intValue = ((Integer) obj).intValue();
        i();
        if (i10 < 0 || i10 > (i11 = this.c)) {
            throw new IndexOutOfBoundsException(android.support.v4.media.a.k(i10, this.c, "Index:", ", Size:"));
        }
        int i12 = i10 + 1;
        int[] iArr = this.b;
        if (i11 < iArr.length) {
            System.arraycopy(iArr, i10, iArr, i12, i11 - i10);
        } else {
            int[] iArr2 = new int[((i11 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i10);
            System.arraycopy(this.b, i10, iArr2, i12, this.c - i10);
            this.b = iArr2;
        }
        this.b[i10] = intValue;
        this.c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.cast.u4, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        i();
        Charset charset = k5.a;
        collection.getClass();
        if (!(collection instanceof f5)) {
            return super.addAll(collection);
        }
        f5 f5Var = (f5) collection;
        int i10 = f5Var.c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.c;
        if (ConnectionsManager.DEFAULT_DATACENTER_ID - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        int[] iArr = this.b;
        if (i12 > iArr.length) {
            this.b = Arrays.copyOf(iArr, i12);
        }
        System.arraycopy(f5Var.b, 0, this.b, this.c, f5Var.c);
        this.c = i12;
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
        if (!(obj instanceof f5)) {
            return super.equals(obj);
        }
        f5 f5Var = (f5) obj;
        if (this.c != f5Var.c) {
            return false;
        }
        int[] iArr = f5Var.b;
        for (int i10 = 0; i10 < this.c; i10++) {
            if (this.b[i10] != iArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        n(i10);
        return Integer.valueOf(this.b[i10]);
    }

    @Override // com.google.android.gms.internal.cast.u4, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.c; i11++) {
            i10 = (i10 * 31) + this.b[i11];
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i10 = this.c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.b[i11] == intValue) {
                return i11;
            }
        }
        return -1;
    }

    public final void n(int i10) {
        if (i10 < 0 || i10 >= this.c) {
            throw new IndexOutOfBoundsException(android.support.v4.media.a.k(i10, this.c, "Index:", ", Size:"));
        }
    }

    @Override // com.google.android.gms.internal.cast.u4, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        i();
        n(i10);
        int[] iArr = this.b;
        int i11 = iArr[i10];
        if (i10 < this.c - 1) {
            System.arraycopy(iArr, i10 + 1, iArr, i10, (r2 - i10) - 1);
        }
        this.c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        i();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.b;
        System.arraycopy(iArr, i11, iArr, i10, this.c - i11);
        this.c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        int intValue = ((Integer) obj).intValue();
        i();
        n(i10);
        int[] iArr = this.b;
        int i11 = iArr[i10];
        iArr[i10] = intValue;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c;
    }

    @Override // com.google.android.gms.internal.cast.j5
    public final j5 zzg(int i10) {
        if (i10 >= this.c) {
            return new f5(Arrays.copyOf(this.b, i10), this.c, true);
        }
        throw new IllegalArgumentException();
    }

    public final void zzh(int i10) {
        i();
        int i11 = this.c;
        int[] iArr = this.b;
        if (i11 == iArr.length) {
            int[] iArr2 = new int[((i11 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i11);
            this.b = iArr2;
        }
        int[] iArr3 = this.b;
        int i12 = this.c;
        this.c = i12 + 1;
        iArr3[i12] = i10;
    }

    @Override // com.google.android.gms.internal.cast.u4, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzh(((Integer) obj).intValue());
        return true;
    }
}
