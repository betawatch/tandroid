package com.google.android.gms.internal.play_billing;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class w1 extends f1 implements RandomAccess, y1 {
    public static final int[] d;
    public static final w1 e;
    public int[] b;
    public int c;

    static {
        int[] iArr = new int[0];
        d = iArr;
        e = new w1(iArr, 0, false);
    }

    public w1(int[] iArr, int i7, boolean z9) {
        super(z9);
        this.b = iArr;
        this.c = i7;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i7, Object obj) {
        int i10;
        int intValue = ((Integer) obj).intValue();
        f();
        if (i7 < 0 || i7 > (i10 = this.c)) {
            throw new IndexOutOfBoundsException(a8.p0.m(i7, this.c, "Index:", ", Size:"));
        }
        int i11 = i7 + 1;
        int[] iArr = this.b;
        int length = iArr.length;
        if (i10 < length) {
            System.arraycopy(iArr, i7, iArr, i11, i10 - i7);
        } else {
            int[] iArr2 = new int[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.b, 0, iArr2, 0, i7);
            System.arraycopy(this.b, i7, iArr2, i11, this.c - i7);
            this.b = iArr2;
        }
        this.b[i7] = intValue;
        this.c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.play_billing.f1, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        f();
        Charset charset = a2.a;
        collection.getClass();
        if (!(collection instanceof w1)) {
            return super.addAll(collection);
        }
        w1 w1Var = (w1) collection;
        int i7 = w1Var.c;
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
        System.arraycopy(w1Var.b, 0, this.b, this.c, w1Var.c);
        this.c = i11;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.play_billing.f1, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w1)) {
            return super.equals(obj);
        }
        w1 w1Var = (w1) obj;
        if (this.c != w1Var.c) {
            return false;
        }
        int[] iArr = w1Var.b;
        for (int i7 = 0; i7 < this.c; i7++) {
            if (this.b[i7] != iArr[i7]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i7) {
        k(i7);
        return Integer.valueOf(this.b[i7]);
    }

    @Override // com.google.android.gms.internal.play_billing.f1, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i7 = 1;
        for (int i10 = 0; i10 < this.c; i10++) {
            i7 = (i7 * 31) + this.b[i10];
        }
        return i7;
    }

    public final int i(int i7) {
        k(i7);
        return this.b[i7];
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
        f();
        int i10 = this.c;
        int length = this.b.length;
        if (i10 == length) {
            int[] iArr = new int[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.b, 0, iArr, 0, this.c);
            this.b = iArr;
        }
        int[] iArr2 = this.b;
        int i11 = this.c;
        this.c = i11 + 1;
        iArr2[i11] = i7;
    }

    public final void k(int i7) {
        if (i7 < 0 || i7 >= this.c) {
            throw new IndexOutOfBoundsException(a8.p0.m(i7, this.c, "Index:", ", Size:"));
        }
    }

    @Override // com.google.android.gms.internal.play_billing.f1, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i7) {
        f();
        k(i7);
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
    public final /* bridge */ /* synthetic */ Object set(int i7, Object obj) {
        int intValue = ((Integer) obj).intValue();
        f();
        k(i7);
        int[] iArr = this.b;
        int i10 = iArr[i7];
        iArr[i7] = intValue;
        return Integer.valueOf(i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c;
    }

    @Override // com.google.android.gms.internal.play_billing.z1
    public final /* bridge */ /* synthetic */ z1 zzd(int i7) {
        if (i7 >= this.c) {
            return new w1(i7 == 0 ? d : Arrays.copyOf(this.b, i7), this.c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        j(((Integer) obj).intValue());
        return true;
    }
}
