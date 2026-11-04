package com.google.android.gms.internal.play_billing;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
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

    public w1(int[] iArr, int i3, boolean z10) {
        super(z10);
        this.b = iArr;
        this.c = i3;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i3, Object obj) {
        int i10;
        int intValue = ((Integer) obj).intValue();
        h();
        if (i3 < 0 || i3 > (i10 = this.c)) {
            throw new IndexOutOfBoundsException(a1.g.n(i3, this.c, "Index:", ", Size:"));
        }
        int i11 = i3 + 1;
        int[] iArr = this.b;
        int length = iArr.length;
        if (i10 < length) {
            System.arraycopy(iArr, i3, iArr, i11, i10 - i3);
        } else {
            int[] iArr2 = new int[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.b, 0, iArr2, 0, i3);
            System.arraycopy(this.b, i3, iArr2, i11, this.c - i3);
            this.b = iArr2;
        }
        this.b[i3] = intValue;
        this.c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.play_billing.f1, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        h();
        Charset charset = a2.a;
        collection.getClass();
        if (!(collection instanceof w1)) {
            return super.addAll(collection);
        }
        w1 w1Var = (w1) collection;
        int i3 = w1Var.c;
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
        for (int i3 = 0; i3 < this.c; i3++) {
            if (this.b[i3] != iArr[i3]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i3) {
        k(i3);
        return Integer.valueOf(this.b[i3]);
    }

    @Override // com.google.android.gms.internal.play_billing.f1, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i3 = 1;
        for (int i10 = 0; i10 < this.c; i10++) {
            i3 = (i3 * 31) + this.b[i10];
        }
        return i3;
    }

    public final int i(int i3) {
        k(i3);
        return this.b[i3];
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
        h();
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
        iArr2[i11] = i3;
    }

    public final void k(int i3) {
        if (i3 < 0 || i3 >= this.c) {
            throw new IndexOutOfBoundsException(a1.g.n(i3, this.c, "Index:", ", Size:"));
        }
    }

    @Override // com.google.android.gms.internal.play_billing.f1, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i3) {
        h();
        k(i3);
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
    public final /* bridge */ /* synthetic */ Object set(int i3, Object obj) {
        int intValue = ((Integer) obj).intValue();
        h();
        k(i3);
        int[] iArr = this.b;
        int i10 = iArr[i3];
        iArr[i3] = intValue;
        return Integer.valueOf(i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c;
    }

    @Override // com.google.android.gms.internal.play_billing.z1
    public final /* bridge */ /* synthetic */ z1 zzd(int i3) {
        if (i3 >= this.c) {
            return new w1(i3 == 0 ? d : Arrays.copyOf(this.b, i3), this.c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        j(((Integer) obj).intValue());
        return true;
    }
}
