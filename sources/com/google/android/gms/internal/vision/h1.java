package com.google.android.gms.internal.vision;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class h1 extends n0 implements i2, RandomAccess {
    public static final h1 d;
    public int[] b;
    public int c;

    static {
        h1 h1Var = new h1(0, new int[0]);
        d = h1Var;
        h1Var.a = false;
    }

    public h1(int i9, int[] iArr) {
        this.b = iArr;
        this.c = i9;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i9, Object obj) {
        int i10;
        int intValue = ((Integer) obj).intValue();
        i();
        if (i9 < 0 || i9 > (i10 = this.c)) {
            throw new IndexOutOfBoundsException(p(i9));
        }
        int[] iArr = this.b;
        if (i10 < iArr.length) {
            System.arraycopy(iArr, i9, iArr, i9 + 1, i10 - i9);
        } else {
            int[] iArr2 = new int[((i10 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i9);
            System.arraycopy(this.b, i9, iArr2, i9 + 1, this.c - i9);
            this.b = iArr2;
        }
        this.b[i9] = intValue;
        this.c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.vision.n0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        i();
        Charset charset = j1.a;
        collection.getClass();
        if (!(collection instanceof h1)) {
            return super.addAll(collection);
        }
        h1 h1Var = (h1) collection;
        int i9 = h1Var.c;
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
        for (int i9 = 0; i9 < this.c; i9++) {
            if (this.b[i9] != iArr[i9]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i9) {
        o(i9);
        return Integer.valueOf(this.b[i9]);
    }

    @Override // com.google.android.gms.internal.vision.n0, java.util.AbstractList, java.util.Collection, java.util.List
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

    public final void o(int i9) {
        if (i9 < 0 || i9 >= this.c) {
            throw new IndexOutOfBoundsException(p(i9));
        }
    }

    public final String p(int i9) {
        int i10 = this.c;
        StringBuilder sb2 = new StringBuilder(35);
        sb2.append("Index:");
        sb2.append(i9);
        sb2.append(", Size:");
        sb2.append(i10);
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.vision.n0, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i9) {
        i();
        o(i9);
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
    public final /* synthetic */ Object set(int i9, Object obj) {
        int intValue = ((Integer) obj).intValue();
        i();
        o(i9);
        int[] iArr = this.b;
        int i10 = iArr[i9];
        iArr[i9] = intValue;
        return Integer.valueOf(i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c;
    }

    @Override // com.google.android.gms.internal.vision.o1
    public final /* synthetic */ o1 zza(int i9) {
        if (i9 < this.c) {
            throw new IllegalArgumentException();
        }
        return new h1(this.c, Arrays.copyOf(this.b, i9));
    }

    @Override // com.google.android.gms.internal.vision.n0, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        n(((Integer) obj).intValue());
        return true;
    }
}
