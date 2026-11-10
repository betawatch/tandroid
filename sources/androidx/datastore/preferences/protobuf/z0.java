package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class z0 extends b implements RandomAccess {
    public static final z0 d = new z0(new Object[0], 0, false);
    public Object[] b;
    public int c;

    public z0(Object[] objArr, int i7, boolean z9) {
        this.a = z9;
        this.b = objArr;
        this.c = i7;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
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
            StringBuilder n10 = jg.g.n(i7, "Index:", ", Size:");
            n10.append(this.c);
            throw new IndexOutOfBoundsException(n10.toString());
        }
    }

    public final z0 j(int i7) {
        if (i7 >= this.c) {
            return new z0(Arrays.copyOf(this.b, i7), this.c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.datastore.preferences.protobuf.b, java.util.AbstractList, java.util.List
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
        StringBuilder n10 = jg.g.n(i7, "Index:", ", Size:");
        n10.append(this.c);
        throw new IndexOutOfBoundsException(n10.toString());
    }
}
