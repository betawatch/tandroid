package com.google.android.gms.internal.vision;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class m2 extends n0 implements RandomAccess {
    public static final m2 d;
    public Object[] b;
    public int c;

    static {
        m2 m2Var = new m2(0, new Object[0]);
        d = m2Var;
        m2Var.a = false;
    }

    public m2(int i7, Object[] objArr) {
        this.b = objArr;
        this.c = i7;
    }

    @Override // com.google.android.gms.internal.vision.n0, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        f();
        int i7 = this.c;
        Object[] objArr = this.b;
        if (i7 == objArr.length) {
            this.b = Arrays.copyOf(objArr, ((i7 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.b;
        int i10 = this.c;
        this.c = i10 + 1;
        objArr2[i10] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i7) {
        i(i7);
        return this.b[i7];
    }

    public final void i(int i7) {
        if (i7 < 0 || i7 >= this.c) {
            throw new IndexOutOfBoundsException(j(i7));
        }
    }

    public final String j(int i7) {
        int i10 = this.c;
        StringBuilder sb2 = new StringBuilder(35);
        sb2.append("Index:");
        sb2.append(i7);
        sb2.append(", Size:");
        sb2.append(i10);
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.vision.n0, java.util.AbstractList, java.util.List
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

    @Override // com.google.android.gms.internal.vision.o1
    public final /* synthetic */ o1 zza(int i7) {
        if (i7 < this.c) {
            throw new IllegalArgumentException();
        }
        return new m2(this.c, Arrays.copyOf(this.b, i7));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i7, Object obj) {
        int i10;
        f();
        if (i7 >= 0 && i7 <= (i10 = this.c)) {
            Object[] objArr = this.b;
            if (i10 < objArr.length) {
                System.arraycopy(objArr, i7, objArr, i7 + 1, i10 - i7);
            } else {
                Object[] objArr2 = new Object[((i10 * 3) / 2) + 1];
                System.arraycopy(objArr, 0, objArr2, 0, i7);
                System.arraycopy(this.b, i7, objArr2, i7 + 1, this.c - i7);
                this.b = objArr2;
            }
            this.b[i7] = obj;
            this.c++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(j(i7));
    }
}
