package com.google.android.gms.internal.vision;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class n2 extends n0 implements RandomAccess {
    public static final n2 d;
    public Object[] b;
    public int c;

    static {
        n2 n2Var = new n2(0, new Object[0]);
        d = n2Var;
        n2Var.a = false;
    }

    public n2(int i10, Object[] objArr) {
        this.b = objArr;
        this.c = i10;
    }

    @Override // com.google.android.gms.internal.vision.n0, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        i();
        int i10 = this.c;
        Object[] objArr = this.b;
        if (i10 == objArr.length) {
            this.b = Arrays.copyOf(objArr, ((i10 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.b;
        int i11 = this.c;
        this.c = i11 + 1;
        objArr2[i11] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        n(i10);
        return this.b[i10];
    }

    public final void n(int i10) {
        if (i10 < 0 || i10 >= this.c) {
            throw new IndexOutOfBoundsException(o(i10));
        }
    }

    public final String o(int i10) {
        int i11 = this.c;
        StringBuilder sb2 = new StringBuilder(35);
        sb2.append("Index:");
        sb2.append(i10);
        sb2.append(", Size:");
        sb2.append(i11);
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.vision.n0, java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        i();
        n(i10);
        Object[] objArr = this.b;
        Object obj = objArr[i10];
        if (i10 < this.c - 1) {
            System.arraycopy(objArr, i10 + 1, objArr, i10, (r2 - i10) - 1);
        }
        this.c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        i();
        n(i10);
        Object[] objArr = this.b;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c;
    }

    @Override // com.google.android.gms.internal.vision.o1
    public final /* synthetic */ o1 zza(int i10) {
        if (i10 < this.c) {
            throw new IllegalArgumentException();
        }
        return new n2(this.c, Arrays.copyOf(this.b, i10));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        i();
        if (i10 >= 0 && i10 <= (i11 = this.c)) {
            Object[] objArr = this.b;
            if (i11 < objArr.length) {
                System.arraycopy(objArr, i10, objArr, i10 + 1, i11 - i10);
            } else {
                Object[] objArr2 = new Object[((i11 * 3) / 2) + 1];
                System.arraycopy(objArr, 0, objArr2, 0, i10);
                System.arraycopy(this.b, i10, objArr2, i10 + 1, this.c - i10);
                this.b = objArr2;
            }
            this.b[i10] = obj;
            this.c++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(o(i10));
    }
}
