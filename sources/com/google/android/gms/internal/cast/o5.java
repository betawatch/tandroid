package com.google.android.gms.internal.cast;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class o5 extends r4 implements RandomAccess, f5, z5 {
    public static final o5 d = new o5(new long[0], 0, false);
    public long[] b;
    public int c;

    public o5(long[] jArr, int i7, boolean z9) {
        super(z9);
        this.b = jArr;
        this.c = i7;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i7, Object obj) {
        int i10;
        long longValue = ((Long) obj).longValue();
        f();
        if (i7 < 0 || i7 > (i10 = this.c)) {
            throw new IndexOutOfBoundsException(a8.p0.m(i7, this.c, "Index:", ", Size:"));
        }
        int i11 = i7 + 1;
        long[] jArr = this.b;
        if (i10 < jArr.length) {
            System.arraycopy(jArr, i7, jArr, i11, i10 - i7);
        } else {
            long[] jArr2 = new long[((i10 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i7);
            System.arraycopy(this.b, i7, jArr2, i11, this.c - i7);
            this.b = jArr2;
        }
        this.b[i7] = longValue;
        this.c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.cast.r4, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        f();
        Charset charset = h5.a;
        collection.getClass();
        if (!(collection instanceof o5)) {
            return super.addAll(collection);
        }
        o5 o5Var = (o5) collection;
        int i7 = o5Var.c;
        if (i7 == 0) {
            return false;
        }
        int i10 = this.c;
        if (ConnectionsManager.DEFAULT_DATACENTER_ID - i10 < i7) {
            throw new OutOfMemoryError();
        }
        int i11 = i10 + i7;
        long[] jArr = this.b;
        if (i11 > jArr.length) {
            this.b = Arrays.copyOf(jArr, i11);
        }
        System.arraycopy(o5Var.b, 0, this.b, this.c, o5Var.c);
        this.c = i11;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.cast.r4, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o5)) {
            return super.equals(obj);
        }
        o5 o5Var = (o5) obj;
        if (this.c != o5Var.c) {
            return false;
        }
        long[] jArr = o5Var.b;
        for (int i7 = 0; i7 < this.c; i7++) {
            if (this.b[i7] != jArr[i7]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i7) {
        i(i7);
        return Long.valueOf(this.b[i7]);
    }

    @Override // com.google.android.gms.internal.cast.r4, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i7 = 1;
        for (int i10 = 0; i10 < this.c; i10++) {
            long j3 = this.b[i10];
            Charset charset = h5.a;
            i7 = (i7 * 31) + ((int) (j3 ^ (j3 >>> 32)));
        }
        return i7;
    }

    public final void i(int i7) {
        if (i7 < 0 || i7 >= this.c) {
            throw new IndexOutOfBoundsException(a8.p0.m(i7, this.c, "Index:", ", Size:"));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int i7 = this.c;
        for (int i10 = 0; i10 < i7; i10++) {
            if (this.b[i10] == longValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.cast.r4, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i7) {
        f();
        i(i7);
        long[] jArr = this.b;
        long j3 = jArr[i7];
        if (i7 < this.c - 1) {
            System.arraycopy(jArr, i7 + 1, jArr, i7, (r3 - i7) - 1);
        }
        this.c--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j3);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i7, int i10) {
        f();
        if (i10 < i7) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.b;
        System.arraycopy(jArr, i10, jArr, i7, this.c - i10);
        this.c -= i10 - i7;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i7, Object obj) {
        long longValue = ((Long) obj).longValue();
        f();
        i(i7);
        long[] jArr = this.b;
        long j3 = jArr[i7];
        jArr[i7] = longValue;
        return Long.valueOf(j3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c;
    }

    @Override // com.google.android.gms.internal.cast.g5
    public final /* bridge */ /* synthetic */ g5 zzg(int i7) {
        if (i7 >= this.c) {
            return new o5(Arrays.copyOf(this.b, i7), this.c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.cast.r4, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        long longValue = ((Long) obj).longValue();
        f();
        int i7 = this.c;
        long[] jArr = this.b;
        if (i7 == jArr.length) {
            long[] jArr2 = new long[((i7 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i7);
            this.b = jArr2;
        }
        long[] jArr3 = this.b;
        int i10 = this.c;
        this.c = i10 + 1;
        jArr3[i10] = longValue;
        return true;
    }
}
