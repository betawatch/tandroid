package com.google.android.gms.internal.vision;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
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

    public m2(int i3, Object[] objArr) {
        this.b = objArr;
        this.c = i3;
    }

    @Override // com.google.android.gms.internal.vision.n0, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        h();
        int i3 = this.c;
        Object[] objArr = this.b;
        if (i3 == objArr.length) {
            this.b = Arrays.copyOf(objArr, ((i3 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.b;
        int i10 = this.c;
        this.c = i10 + 1;
        objArr2[i10] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i3) {
        i(i3);
        return this.b[i3];
    }

    public final void i(int i3) {
        if (i3 < 0 || i3 >= this.c) {
            throw new IndexOutOfBoundsException(j(i3));
        }
    }

    public final String j(int i3) {
        int i10 = this.c;
        StringBuilder sb2 = new StringBuilder(35);
        sb2.append("Index:");
        sb2.append(i3);
        sb2.append(", Size:");
        sb2.append(i10);
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.vision.n0, java.util.AbstractList, java.util.List
    public final Object remove(int i3) {
        h();
        i(i3);
        Object[] objArr = this.b;
        Object obj = objArr[i3];
        if (i3 < this.c - 1) {
            System.arraycopy(objArr, i3 + 1, objArr, i3, (r2 - i3) - 1);
        }
        this.c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i3, Object obj) {
        h();
        i(i3);
        Object[] objArr = this.b;
        Object obj2 = objArr[i3];
        objArr[i3] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c;
    }

    @Override // com.google.android.gms.internal.vision.o1
    public final /* synthetic */ o1 zza(int i3) {
        if (i3 < this.c) {
            throw new IllegalArgumentException();
        }
        return new m2(this.c, Arrays.copyOf(this.b, i3));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i3, Object obj) {
        int i10;
        h();
        if (i3 >= 0 && i3 <= (i10 = this.c)) {
            Object[] objArr = this.b;
            if (i10 < objArr.length) {
                System.arraycopy(objArr, i3, objArr, i3 + 1, i10 - i3);
            } else {
                Object[] objArr2 = new Object[((i10 * 3) / 2) + 1];
                System.arraycopy(objArr, 0, objArr2, 0, i3);
                System.arraycopy(this.b, i3, objArr2, i3 + 1, this.c - i3);
                this.b = objArr2;
            }
            this.b[i3] = obj;
            this.c++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(j(i3));
    }
}
