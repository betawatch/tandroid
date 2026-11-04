package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class z0 extends b implements RandomAccess {
    public static final z0 d = new z0(new Object[0], 0, false);
    public Object[] b;
    public int c;

    public z0(Object[] objArr, int i3, boolean z10) {
        this.a = z10;
        this.b = objArr;
        this.c = i3;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
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
            StringBuilder m10 = k2.p1.m(i3, "Index:", ", Size:");
            m10.append(this.c);
            throw new IndexOutOfBoundsException(m10.toString());
        }
    }

    public final z0 j(int i3) {
        if (i3 >= this.c) {
            return new z0(Arrays.copyOf(this.b, i3), this.c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.datastore.preferences.protobuf.b, java.util.AbstractList, java.util.List
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
        StringBuilder m10 = k2.p1.m(i3, "Index:", ", Size:");
        m10.append(this.c);
        throw new IndexOutOfBoundsException(m10.toString());
    }
}
