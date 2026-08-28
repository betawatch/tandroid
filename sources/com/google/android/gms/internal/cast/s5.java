package com.google.android.gms.internal.cast;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class s5 extends u4 implements RandomAccess, j5, d6 {
    public static final s5 d = new s5(new long[0], 0, false);
    public long[] b;
    public int c;

    public s5(long[] jArr, int i9, boolean z10) {
        super(z10);
        this.b = jArr;
        this.c = i9;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i9, Object obj) {
        int i10;
        long longValue = ((Long) obj).longValue();
        i();
        if (i9 < 0 || i9 > (i10 = this.c)) {
            throw new IndexOutOfBoundsException(aa.d.k(i9, this.c, "Index:", ", Size:"));
        }
        int i11 = i9 + 1;
        long[] jArr = this.b;
        if (i10 < jArr.length) {
            System.arraycopy(jArr, i9, jArr, i11, i10 - i9);
        } else {
            long[] jArr2 = new long[((i10 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i9);
            System.arraycopy(this.b, i9, jArr2, i11, this.c - i9);
            this.b = jArr2;
        }
        this.b[i9] = longValue;
        this.c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.cast.u4, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        i();
        Charset charset = l5.a;
        collection.getClass();
        if (!(collection instanceof s5)) {
            return super.addAll(collection);
        }
        s5 s5Var = (s5) collection;
        int i9 = s5Var.c;
        if (i9 == 0) {
            return false;
        }
        int i10 = this.c;
        if (ConnectionsManager.DEFAULT_DATACENTER_ID - i10 < i9) {
            throw new OutOfMemoryError();
        }
        int i11 = i10 + i9;
        long[] jArr = this.b;
        if (i11 > jArr.length) {
            this.b = Arrays.copyOf(jArr, i11);
        }
        System.arraycopy(s5Var.b, 0, this.b, this.c, s5Var.c);
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
        if (!(obj instanceof s5)) {
            return super.equals(obj);
        }
        s5 s5Var = (s5) obj;
        if (this.c != s5Var.c) {
            return false;
        }
        long[] jArr = s5Var.b;
        for (int i9 = 0; i9 < this.c; i9++) {
            if (this.b[i9] != jArr[i9]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i9) {
        n(i9);
        return Long.valueOf(this.b[i9]);
    }

    @Override // com.google.android.gms.internal.cast.u4, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i9 = 1;
        for (int i10 = 0; i10 < this.c; i10++) {
            long j10 = this.b[i10];
            Charset charset = l5.a;
            i9 = (i9 * 31) + ((int) (j10 ^ (j10 >>> 32)));
        }
        return i9;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int i9 = this.c;
        for (int i10 = 0; i10 < i9; i10++) {
            if (this.b[i10] == longValue) {
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
        long[] jArr = this.b;
        long j10 = jArr[i9];
        if (i9 < this.c - 1) {
            System.arraycopy(jArr, i9 + 1, jArr, i9, (r3 - i9) - 1);
        }
        this.c--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i9, int i10) {
        i();
        if (i10 < i9) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.b;
        System.arraycopy(jArr, i10, jArr, i9, this.c - i10);
        this.c -= i10 - i9;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i9, Object obj) {
        long longValue = ((Long) obj).longValue();
        i();
        n(i9);
        long[] jArr = this.b;
        long j10 = jArr[i9];
        jArr[i9] = longValue;
        return Long.valueOf(j10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c;
    }

    @Override // com.google.android.gms.internal.cast.k5
    public final /* bridge */ /* synthetic */ k5 zzg(int i9) {
        if (i9 >= this.c) {
            return new s5(Arrays.copyOf(this.b, i9), this.c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.cast.u4, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        long longValue = ((Long) obj).longValue();
        i();
        int i9 = this.c;
        long[] jArr = this.b;
        if (i9 == jArr.length) {
            long[] jArr2 = new long[((i9 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i9);
            this.b = jArr2;
        }
        long[] jArr3 = this.b;
        int i10 = this.c;
        this.c = i10 + 1;
        jArr3[i10] = longValue;
        return true;
    }
}
