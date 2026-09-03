package com.google.android.gms.internal.cast;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class q5 extends t4 implements RandomAccess, h5, b6 {
    public static final q5 d = new q5(new long[0], 0, false);
    public long[] b;
    public int c;

    public q5(long[] jArr, int i10, boolean z4) {
        super(z4);
        this.b = jArr;
        this.c = i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        long longValue = ((Long) obj).longValue();
        i();
        if (i10 < 0 || i10 > (i11 = this.c)) {
            throw new IndexOutOfBoundsException(android.support.v4.media.a.k(i10, this.c, "Index:", ", Size:"));
        }
        int i12 = i10 + 1;
        long[] jArr = this.b;
        if (i11 < jArr.length) {
            System.arraycopy(jArr, i10, jArr, i12, i11 - i10);
        } else {
            long[] jArr2 = new long[((i11 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            System.arraycopy(this.b, i10, jArr2, i12, this.c - i10);
            this.b = jArr2;
        }
        this.b[i10] = longValue;
        this.c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.cast.t4, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        i();
        Charset charset = j5.a;
        collection.getClass();
        if (!(collection instanceof q5)) {
            return super.addAll(collection);
        }
        q5 q5Var = (q5) collection;
        int i10 = q5Var.c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.c;
        if (ConnectionsManager.DEFAULT_DATACENTER_ID - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        long[] jArr = this.b;
        if (i12 > jArr.length) {
            this.b = Arrays.copyOf(jArr, i12);
        }
        System.arraycopy(q5Var.b, 0, this.b, this.c, q5Var.c);
        this.c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.cast.t4, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q5)) {
            return super.equals(obj);
        }
        q5 q5Var = (q5) obj;
        if (this.c != q5Var.c) {
            return false;
        }
        long[] jArr = q5Var.b;
        for (int i10 = 0; i10 < this.c; i10++) {
            if (this.b[i10] != jArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        n(i10);
        return Long.valueOf(this.b[i10]);
    }

    @Override // com.google.android.gms.internal.cast.t4, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.c; i11++) {
            long j10 = this.b[i11];
            Charset charset = j5.a;
            i10 = (i10 * 31) + ((int) (j10 ^ (j10 >>> 32)));
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int i10 = this.c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.b[i11] == longValue) {
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

    @Override // com.google.android.gms.internal.cast.t4, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        i();
        n(i10);
        long[] jArr = this.b;
        long j10 = jArr[i10];
        if (i10 < this.c - 1) {
            System.arraycopy(jArr, i10 + 1, jArr, i10, (r3 - i10) - 1);
        }
        this.c--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        i();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.b;
        System.arraycopy(jArr, i11, jArr, i10, this.c - i11);
        this.c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        long longValue = ((Long) obj).longValue();
        i();
        n(i10);
        long[] jArr = this.b;
        long j10 = jArr[i10];
        jArr[i10] = longValue;
        return Long.valueOf(j10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c;
    }

    @Override // com.google.android.gms.internal.cast.i5
    public final /* bridge */ /* synthetic */ i5 zzg(int i10) {
        if (i10 >= this.c) {
            return new q5(Arrays.copyOf(this.b, i10), this.c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.cast.t4, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        long longValue = ((Long) obj).longValue();
        i();
        int i10 = this.c;
        long[] jArr = this.b;
        if (i10 == jArr.length) {
            long[] jArr2 = new long[((i10 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            this.b = jArr2;
        }
        long[] jArr3 = this.b;
        int i11 = this.c;
        this.c = i11 + 1;
        jArr3[i11] = longValue;
        return true;
    }
}
