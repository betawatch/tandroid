package com.google.android.gms.internal.cast;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class p5 extends s4 implements RandomAccess, g5, a6 {
    public static final p5 d = new p5(new long[0], 0, false);
    public long[] b;
    public int c;

    public p5(long[] jArr, int i3, boolean z10) {
        super(z10);
        this.b = jArr;
        this.c = i3;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i3, Object obj) {
        int i10;
        long longValue = ((Long) obj).longValue();
        h();
        if (i3 < 0 || i3 > (i10 = this.c)) {
            throw new IndexOutOfBoundsException(a1.g.n(i3, this.c, "Index:", ", Size:"));
        }
        int i11 = i3 + 1;
        long[] jArr = this.b;
        if (i10 < jArr.length) {
            System.arraycopy(jArr, i3, jArr, i11, i10 - i3);
        } else {
            long[] jArr2 = new long[((i10 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i3);
            System.arraycopy(this.b, i3, jArr2, i11, this.c - i3);
            this.b = jArr2;
        }
        this.b[i3] = longValue;
        this.c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.cast.s4, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        h();
        Charset charset = i5.a;
        collection.getClass();
        if (!(collection instanceof p5)) {
            return super.addAll(collection);
        }
        p5 p5Var = (p5) collection;
        int i3 = p5Var.c;
        if (i3 == 0) {
            return false;
        }
        int i10 = this.c;
        if (ConnectionsManager.DEFAULT_DATACENTER_ID - i10 < i3) {
            throw new OutOfMemoryError();
        }
        int i11 = i10 + i3;
        long[] jArr = this.b;
        if (i11 > jArr.length) {
            this.b = Arrays.copyOf(jArr, i11);
        }
        System.arraycopy(p5Var.b, 0, this.b, this.c, p5Var.c);
        this.c = i11;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.cast.s4, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p5)) {
            return super.equals(obj);
        }
        p5 p5Var = (p5) obj;
        if (this.c != p5Var.c) {
            return false;
        }
        long[] jArr = p5Var.b;
        for (int i3 = 0; i3 < this.c; i3++) {
            if (this.b[i3] != jArr[i3]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i3) {
        i(i3);
        return Long.valueOf(this.b[i3]);
    }

    @Override // com.google.android.gms.internal.cast.s4, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i3 = 1;
        for (int i10 = 0; i10 < this.c; i10++) {
            long j10 = this.b[i10];
            Charset charset = i5.a;
            i3 = (i3 * 31) + ((int) (j10 ^ (j10 >>> 32)));
        }
        return i3;
    }

    public final void i(int i3) {
        if (i3 < 0 || i3 >= this.c) {
            throw new IndexOutOfBoundsException(a1.g.n(i3, this.c, "Index:", ", Size:"));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int i3 = this.c;
        for (int i10 = 0; i10 < i3; i10++) {
            if (this.b[i10] == longValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.cast.s4, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i3) {
        h();
        i(i3);
        long[] jArr = this.b;
        long j10 = jArr[i3];
        if (i3 < this.c - 1) {
            System.arraycopy(jArr, i3 + 1, jArr, i3, (r3 - i3) - 1);
        }
        this.c--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i3, int i10) {
        h();
        if (i10 < i3) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.b;
        System.arraycopy(jArr, i10, jArr, i3, this.c - i10);
        this.c -= i10 - i3;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i3, Object obj) {
        long longValue = ((Long) obj).longValue();
        h();
        i(i3);
        long[] jArr = this.b;
        long j10 = jArr[i3];
        jArr[i3] = longValue;
        return Long.valueOf(j10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c;
    }

    @Override // com.google.android.gms.internal.cast.h5
    public final /* bridge */ /* synthetic */ h5 zzg(int i3) {
        if (i3 >= this.c) {
            return new p5(Arrays.copyOf(this.b, i3), this.c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.cast.s4, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        long longValue = ((Long) obj).longValue();
        h();
        int i3 = this.c;
        long[] jArr = this.b;
        if (i3 == jArr.length) {
            long[] jArr2 = new long[((i3 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i3);
            this.b = jArr2;
        }
        long[] jArr3 = this.b;
        int i10 = this.c;
        this.c = i10 + 1;
        jArr3[i10] = longValue;
        return true;
    }
}
