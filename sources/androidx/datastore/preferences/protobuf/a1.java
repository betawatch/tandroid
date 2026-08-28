package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class a1 extends b implements RandomAccess {
    public static final a1 d;
    public Object[] b;
    public int c;

    static {
        a1 a1Var = new a1(0, new Object[0]);
        d = a1Var;
        a1Var.a = false;
    }

    public a1(int i9, Object[] objArr) {
        this.b = objArr;
        this.c = i9;
    }

    @Override // androidx.datastore.preferences.protobuf.b, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
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

    @Override // androidx.datastore.preferences.protobuf.z
    public final z e(int i9) {
        if (i9 < this.c) {
            throw new IllegalArgumentException();
        }
        return new a1(this.c, Arrays.copyOf(this.b, i9));
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i9) {
        n(i9);
        return this.b[i9];
    }

    public final void n(int i9) {
        if (i9 < 0 || i9 >= this.c) {
            StringBuilder p6 = j3.r0.p(i9, "Index:", ", Size:");
            p6.append(this.c);
            throw new IndexOutOfBoundsException(p6.toString());
        }
    }

    @Override // java.util.AbstractList, java.util.List
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
        StringBuilder p6 = j3.r0.p(i9, "Index:", ", Size:");
        p6.append(this.c);
        throw new IndexOutOfBoundsException(p6.toString());
    }
}
