package com.google.android.gms.internal.vision;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class h1 extends n0 implements i2, RandomAccess {
    public static final h1 d;
    public int[] b;
    public int c;

    static {
        h1 h1Var = new h1(new int[0], 0);
        d = h1Var;
        h1Var.a = false;
    }

    public h1(int[] iArr, int i7) {
        this.b = iArr;
        this.c = i7;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i7, Object obj) {
        int i10;
        int intValue = ((Integer) obj).intValue();
        f();
        if (i7 < 0 || i7 > (i10 = this.c)) {
            throw new IndexOutOfBoundsException(k(i7));
        }
        int[] iArr = this.b;
        if (i10 < iArr.length) {
            System.arraycopy(iArr, i7, iArr, i7 + 1, i10 - i7);
        } else {
            int[] iArr2 = new int[((i10 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i7);
            System.arraycopy(this.b, i7, iArr2, i7 + 1, this.c - i7);
            this.b = iArr2;
        }
        this.b[i7] = intValue;
        this.c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.vision.n0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        f();
        Charset charset = j1.a;
        collection.getClass();
        if (!(collection instanceof h1)) {
            return super.addAll(collection);
        }
        h1 h1Var = (h1) collection;
        int i7 = h1Var.c;
        if (i7 == 0) {
            return false;
        }
        int i10 = this.c;
        if (ConnectionsManager.DEFAULT_DATACENTER_ID - i10 < i7) {
            throw new OutOfMemoryError();
        }
        int i11 = i10 + i7;
        int[] iArr = this.b;
        if (i11 > iArr.length) {
            this.b = Arrays.copyOf(iArr, i11);
        }
        System.arraycopy(h1Var.b, 0, this.b, this.c, h1Var.c);
        this.c = i11;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.vision.n0, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h1)) {
            return super.equals(obj);
        }
        h1 h1Var = (h1) obj;
        if (this.c != h1Var.c) {
            return false;
        }
        int[] iArr = h1Var.b;
        for (int i7 = 0; i7 < this.c; i7++) {
            if (this.b[i7] != iArr[i7]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i7) {
        j(i7);
        return Integer.valueOf(this.b[i7]);
    }

    @Override // com.google.android.gms.internal.vision.n0, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i7 = 1;
        for (int i10 = 0; i10 < this.c; i10++) {
            i7 = (i7 * 31) + this.b[i10];
        }
        return i7;
    }

    public final void i(int i7) {
        f();
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
        iArr3[i11] = i7;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i7 = this.c;
        for (int i10 = 0; i10 < i7; i10++) {
            if (this.b[i10] == intValue) {
                return i10;
            }
        }
        return -1;
    }

    public final void j(int i7) {
        if (i7 < 0 || i7 >= this.c) {
            throw new IndexOutOfBoundsException(k(i7));
        }
    }

    public final String k(int i7) {
        int i10 = this.c;
        StringBuilder sb2 = new StringBuilder(35);
        sb2.append("Index:");
        sb2.append(i7);
        sb2.append(", Size:");
        sb2.append(i10);
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.vision.n0, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i7) {
        f();
        j(i7);
        int[] iArr = this.b;
        int i10 = iArr[i7];
        if (i7 < this.c - 1) {
            System.arraycopy(iArr, i7 + 1, iArr, i7, (r2 - i7) - 1);
        }
        this.c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i7, int i10) {
        f();
        if (i10 < i7) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.b;
        System.arraycopy(iArr, i10, iArr, i7, this.c - i10);
        this.c -= i10 - i7;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i7, Object obj) {
        int intValue = ((Integer) obj).intValue();
        f();
        j(i7);
        int[] iArr = this.b;
        int i10 = iArr[i7];
        iArr[i7] = intValue;
        return Integer.valueOf(i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c;
    }

    @Override // com.google.android.gms.internal.vision.o1
    public final /* synthetic */ o1 zza(int i7) {
        if (i7 >= this.c) {
            return new h1(Arrays.copyOf(this.b, i7), this.c);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.vision.n0, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        i(((Integer) obj).intValue());
        return true;
    }
}
