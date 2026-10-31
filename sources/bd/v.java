package bd;

import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class v extends e implements RandomAccess {
    public final Object[] a;
    public final int b;
    public int c;
    public int d;

    public v(int i10, Object[] objArr) {
        this.a = objArr;
        if (i10 < 0) {
            throw new IllegalArgumentException(i0.a.i(i10, "ring buffer filled size should not be negative but it is ").toString());
        }
        if (i10 <= objArr.length) {
            this.b = objArr.length;
            this.d = i10;
        } else {
            StringBuilder l4 = i0.a.l(i10, "ring buffer filled size: ", " cannot be larger than the buffer size: ");
            l4.append(objArr.length);
            throw new IllegalArgumentException(l4.toString().toString());
        }
    }

    @Override // java.util.List
    public final Object get(int i10) {
        int l4 = l();
        if (i10 < 0 || i10 >= l4) {
            throw new IndexOutOfBoundsException(a1.g.j(i10, l4, "index: ", ", size: "));
        }
        return this.a[(this.c + i10) % this.b];
    }

    @Override // bd.e, java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new u(this);
    }

    @Override // bd.e
    public final int l() {
        return this.d;
    }

    public final void m() {
        if (20 > this.d) {
            throw new IllegalArgumentException(("n shouldn't be greater than the buffer size: n = 20, size = " + this.d).toString());
        }
        int i10 = this.c;
        int i11 = this.b;
        int i12 = (i10 + 20) % i11;
        Object[] objArr = this.a;
        if (i10 > i12) {
            h.e(i10, i11, objArr);
            h.e(0, i12, objArr);
        } else {
            h.e(i10, i12, objArr);
        }
        this.c = i12;
        this.d -= 20;
    }

    @Override // bd.e, java.util.List, java.util.Collection
    public final Object[] toArray() {
        return toArray(new Object[l()]);
    }

    @Override // bd.e, java.util.List, java.util.Collection
    public final Object[] toArray(Object[] array) {
        Object[] objArr;
        kotlin.jvm.internal.i.e(array, "array");
        int length = array.length;
        int i10 = this.d;
        if (length < i10) {
            array = Arrays.copyOf(array, i10);
            kotlin.jvm.internal.i.d(array, "copyOf(...)");
        }
        int i11 = this.d;
        int i12 = this.c;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            objArr = this.a;
            if (i14 >= i11 || i12 >= this.b) {
                break;
            }
            array[i14] = objArr[i12];
            i14++;
            i12++;
        }
        while (i14 < i11) {
            array[i14] = objArr[i13];
            i14++;
            i13++;
        }
        if (i11 < array.length) {
            array[i11] = null;
        }
        return array;
    }
}
