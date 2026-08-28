package com.google.android.gms.internal.vision;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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

    public m2(int i9, Object[] objArr) {
        this.b = objArr;
        this.c = i9;
    }

    @Override // com.google.android.gms.internal.vision.n0, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        i();
        int i9 = this.c;
        Object[] objArr = this.b;
        if (i9 == objArr.length) {
            this.b = Arrays.copyOf(objArr, ((i9 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.b;
        int i10 = this.c;
        this.c = i10 + 1;
        objArr2[i10] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i9) {
        n(i9);
        return this.b[i9];
    }

    public final void n(int i9) {
        if (i9 < 0 || i9 >= this.c) {
            throw new IndexOutOfBoundsException(o(i9));
        }
    }

    public final String o(int i9) {
        int i10 = this.c;
        StringBuilder sb2 = new StringBuilder(35);
        sb2.append("Index:");
        sb2.append(i9);
        sb2.append(", Size:");
        sb2.append(i10);
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.vision.n0, java.util.AbstractList, java.util.List
    public final Object remove(int i9) {
        i();
        n(i9);
        Object[] objArr = this.b;
        Object obj = objArr[i9];
        if (i9 < this.c - 1) {
            System.arraycopy(objArr, i9 + 1, objArr, i9, (r2 - i9) - 1);
        }
        this.c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i9, Object obj) {
        i();
        n(i9);
        Object[] objArr = this.b;
        Object obj2 = objArr[i9];
        objArr[i9] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
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
        return new m2(this.c, Arrays.copyOf(this.b, i9));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i9, Object obj) {
        int i10;
        i();
        if (i9 >= 0 && i9 <= (i10 = this.c)) {
            Object[] objArr = this.b;
            if (i10 < objArr.length) {
                System.arraycopy(objArr, i9, objArr, i9 + 1, i10 - i9);
            } else {
                Object[] objArr2 = new Object[((i10 * 3) / 2) + 1];
                System.arraycopy(objArr, 0, objArr2, 0, i9);
                System.arraycopy(this.b, i9, objArr2, i9 + 1, this.c - i9);
                this.b = objArr2;
            }
            this.b[i9] = obj;
            this.c++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(o(i9));
    }
}
