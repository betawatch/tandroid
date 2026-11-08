package com.google.android.gms.internal.play_billing;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class r2 extends f1 implements RandomAccess {
    public static final Object[] d;
    public static final r2 e;
    public Object[] b;
    public int c;

    static {
        Object[] objArr = new Object[0];
        d = objArr;
        e = new r2(objArr, 0, false);
    }

    public r2(Object[] objArr, int i7, boolean z9) {
        super(z9);
        this.b = objArr;
        this.c = i7;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i7, Object obj) {
        int i10;
        f();
        if (i7 < 0 || i7 > (i10 = this.c)) {
            throw new IndexOutOfBoundsException(a8.p0.m(i7, this.c, "Index:", ", Size:"));
        }
        int i11 = i7 + 1;
        Object[] objArr = this.b;
        int length = objArr.length;
        if (i10 < length) {
            System.arraycopy(objArr, i7, objArr, i11, i10 - i7);
        } else {
            Object[] objArr2 = new Object[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.b, 0, objArr2, 0, i7);
            System.arraycopy(this.b, i7, objArr2, i11, this.c - i7);
            this.b = objArr2;
        }
        this.b[i7] = obj;
        this.c++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i7) {
        i(i7);
        return this.b[i7];
    }

    public final void i(int i7) {
        if (i7 < 0 || i7 >= this.c) {
            throw new IndexOutOfBoundsException(a8.p0.m(i7, this.c, "Index:", ", Size:"));
        }
    }

    @Override // com.google.android.gms.internal.play_billing.f1, java.util.AbstractList, java.util.List
    public final Object remove(int i7) {
        f();
        i(i7);
        Object[] objArr = this.b;
        Object obj = objArr[i7];
        if (i7 < this.c - 1) {
            System.arraycopy(objArr, i7 + 1, objArr, i7, (r2 - i7) - 1);
        }
        this.c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i7, Object obj) {
        f();
        i(i7);
        Object[] objArr = this.b;
        Object obj2 = objArr[i7];
        objArr[i7] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c;
    }

    @Override // com.google.android.gms.internal.play_billing.z1
    public final /* bridge */ /* synthetic */ z1 zzd(int i7) {
        if (i7 >= this.c) {
            return new r2(i7 == 0 ? d : Arrays.copyOf(this.b, i7), this.c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        f();
        int i7 = this.c;
        int length = this.b.length;
        if (i7 == length) {
            this.b = Arrays.copyOf(this.b, Math.max(((length * 3) / 2) + 1, 10));
        }
        Object[] objArr = this.b;
        int i10 = this.c;
        this.c = i10 + 1;
        objArr[i10] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
