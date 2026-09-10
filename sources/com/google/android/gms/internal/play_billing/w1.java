package com.google.android.gms.internal.play_billing;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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

    public w1(int[] iArr, int i10, boolean z10) {
        super(z10);
        this.b = iArr;
        this.c = i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        int intValue = ((Integer) obj).intValue();
        i();
        if (i10 < 0 || i10 > (i11 = this.c)) {
            throw new IndexOutOfBoundsException(a4.a.l(i10, this.c, "Index:", ", Size:"));
        }
        int i12 = i10 + 1;
        int[] iArr = this.b;
        int length = iArr.length;
        if (i11 < length) {
            System.arraycopy(iArr, i10, iArr, i12, i11 - i10);
        } else {
            int[] iArr2 = new int[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.b, 0, iArr2, 0, i10);
            System.arraycopy(this.b, i10, iArr2, i12, this.c - i10);
            this.b = iArr2;
        }
        this.b[i10] = intValue;
        this.c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.play_billing.f1, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        i();
        Charset charset = a2.a;
        collection.getClass();
        if (!(collection instanceof w1)) {
            return super.addAll(collection);
        }
        w1 w1Var = (w1) collection;
        int i10 = w1Var.c;
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
        System.arraycopy(w1Var.b, 0, this.b, this.c, w1Var.c);
        this.c = i12;
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
        for (int i10 = 0; i10 < this.c; i10++) {
            if (this.b[i10] != iArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        p(i10);
        return Integer.valueOf(this.b[i10]);
    }

    @Override // com.google.android.gms.internal.play_billing.f1, java.util.AbstractList, java.util.Collection, java.util.List
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

    public final int n(int i10) {
        p(i10);
        return this.b[i10];
    }

    public final void o(int i10) {
        i();
        int i11 = this.c;
        int length = this.b.length;
        if (i11 == length) {
            int[] iArr = new int[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.b, 0, iArr, 0, this.c);
            this.b = iArr;
        }
        int[] iArr2 = this.b;
        int i12 = this.c;
        this.c = i12 + 1;
        iArr2[i12] = i10;
    }

    public final void p(int i10) {
        if (i10 < 0 || i10 >= this.c) {
            throw new IndexOutOfBoundsException(a4.a.l(i10, this.c, "Index:", ", Size:"));
        }
    }

    @Override // com.google.android.gms.internal.play_billing.f1, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        i();
        p(i10);
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
        p(i10);
        int[] iArr = this.b;
        int i11 = iArr[i10];
        iArr[i10] = intValue;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c;
    }

    @Override // com.google.android.gms.internal.play_billing.z1
    public final /* bridge */ /* synthetic */ z1 zzd(int i10) {
        if (i10 >= this.c) {
            return new w1(i10 == 0 ? d : Arrays.copyOf(this.b, i10), this.c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        o(((Integer) obj).intValue());
        return true;
    }
}
