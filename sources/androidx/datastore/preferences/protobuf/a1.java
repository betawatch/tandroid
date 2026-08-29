package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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

    public a1(int i10, Object[] objArr) {
        this.b = objArr;
        this.c = i10;
    }

    @Override // androidx.datastore.preferences.protobuf.b, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
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

    @Override // androidx.datastore.preferences.protobuf.z
    public final z e(int i10) {
        if (i10 < this.c) {
            throw new IllegalArgumentException();
        }
        return new a1(this.c, Arrays.copyOf(this.b, i10));
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        n(i10);
        return this.b[i10];
    }

    public final void n(int i10) {
        if (i10 < 0 || i10 >= this.c) {
            StringBuilder o10 = j7.l1.o(i10, "Index:", ", Size:");
            o10.append(this.c);
            throw new IndexOutOfBoundsException(o10.toString());
        }
    }

    @Override // java.util.AbstractList, java.util.List
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
        StringBuilder o10 = j7.l1.o(i10, "Index:", ", Size:");
        o10.append(this.c);
        throw new IndexOutOfBoundsException(o10.toString());
    }
}
