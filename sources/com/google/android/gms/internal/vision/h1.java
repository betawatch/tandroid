package com.google.android.gms.internal.vision;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
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

    public h1(int[] iArr, int i3) {
        this.b = iArr;
        this.c = i3;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i3, Object obj) {
        int i10;
        int intValue = ((Integer) obj).intValue();
        h();
        if (i3 < 0 || i3 > (i10 = this.c)) {
            throw new IndexOutOfBoundsException(k(i3));
        }
        int[] iArr = this.b;
        if (i10 < iArr.length) {
            System.arraycopy(iArr, i3, iArr, i3 + 1, i10 - i3);
        } else {
            int[] iArr2 = new int[((i10 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i3);
            System.arraycopy(this.b, i3, iArr2, i3 + 1, this.c - i3);
            this.b = iArr2;
        }
        this.b[i3] = intValue;
        this.c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.vision.n0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        h();
        Charset charset = j1.a;
        collection.getClass();
        if (!(collection instanceof h1)) {
            return super.addAll(collection);
        }
        h1 h1Var = (h1) collection;
        int i3 = h1Var.c;
        if (i3 == 0) {
            return false;
        }
        int i10 = this.c;
        if (ConnectionsManager.DEFAULT_DATACENTER_ID - i10 < i3) {
            throw new OutOfMemoryError();
        }
        int i11 = i10 + i3;
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
        for (int i3 = 0; i3 < this.c; i3++) {
            if (this.b[i3] != iArr[i3]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i3) {
        j(i3);
        return Integer.valueOf(this.b[i3]);
    }

    @Override // com.google.android.gms.internal.vision.n0, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i3 = 1;
        for (int i10 = 0; i10 < this.c; i10++) {
            i3 = (i3 * 31) + this.b[i10];
        }
        return i3;
    }

    public final void i(int i3) {
        h();
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
        iArr3[i11] = i3;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i3 = this.c;
        for (int i10 = 0; i10 < i3; i10++) {
            if (this.b[i10] == intValue) {
                return i10;
            }
        }
        return -1;
    }

    public final void j(int i3) {
        if (i3 < 0 || i3 >= this.c) {
            throw new IndexOutOfBoundsException(k(i3));
        }
    }

    public final String k(int i3) {
        int i10 = this.c;
        StringBuilder sb2 = new StringBuilder(35);
        sb2.append("Index:");
        sb2.append(i3);
        sb2.append(", Size:");
        sb2.append(i10);
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.vision.n0, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i3) {
        h();
        j(i3);
        int[] iArr = this.b;
        int i10 = iArr[i3];
        if (i3 < this.c - 1) {
            System.arraycopy(iArr, i3 + 1, iArr, i3, (r2 - i3) - 1);
        }
        this.c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i3, int i10) {
        h();
        if (i10 < i3) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.b;
        System.arraycopy(iArr, i10, iArr, i3, this.c - i10);
        this.c -= i10 - i3;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i3, Object obj) {
        int intValue = ((Integer) obj).intValue();
        h();
        j(i3);
        int[] iArr = this.b;
        int i10 = iArr[i3];
        iArr[i3] = intValue;
        return Integer.valueOf(i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c;
    }

    @Override // com.google.android.gms.internal.vision.o1
    public final /* synthetic */ o1 zza(int i3) {
        if (i3 >= this.c) {
            return new h1(Arrays.copyOf(this.b, i3), this.c);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.vision.n0, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        i(((Integer) obj).intValue());
        return true;
    }
}
