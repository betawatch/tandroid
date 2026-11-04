package ed;

import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;
import k2.p1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class u extends d implements RandomAccess {
    public final Object[] a;
    public final int b;
    public int c;
    public int d;

    public u(int i3, Object[] objArr) {
        this.a = objArr;
        if (i3 < 0) {
            throw new IllegalArgumentException(p1.i(i3, "ring buffer filled size should not be negative but it is ").toString());
        }
        if (i3 <= objArr.length) {
            this.b = objArr.length;
            this.d = i3;
        } else {
            StringBuilder m10 = p1.m(i3, "ring buffer filled size: ", " cannot be larger than the buffer size: ");
            m10.append(objArr.length);
            throw new IllegalArgumentException(m10.toString().toString());
        }
    }

    @Override // java.util.List
    public final Object get(int i3) {
        int h = h();
        if (i3 < 0 || i3 >= h) {
            throw new IndexOutOfBoundsException(a1.g.n(i3, h, "index: ", ", size: "));
        }
        return this.a[(this.c + i3) % this.b];
    }

    @Override // ed.d
    public final int h() {
        return this.d;
    }

    public final void i() {
        if (20 > this.d) {
            throw new IllegalArgumentException(("n shouldn't be greater than the buffer size: n = 20, size = " + this.d).toString());
        }
        int i3 = this.c;
        int i10 = this.b;
        int i11 = (i3 + 20) % i10;
        Object[] objArr = this.a;
        if (i3 > i11) {
            f.e(i3, i10, objArr);
            f.e(0, i11, objArr);
        } else {
            f.e(i3, i11, objArr);
        }
        this.c = i11;
        this.d -= 20;
    }

    @Override // ed.d, java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new t(this);
    }

    @Override // ed.d, java.util.List, java.util.Collection
    public final Object[] toArray() {
        return toArray(new Object[h()]);
    }

    @Override // ed.d, java.util.List, java.util.Collection
    public final Object[] toArray(Object[] array) {
        Object[] objArr;
        kotlin.jvm.internal.j.e(array, "array");
        int length = array.length;
        int i3 = this.d;
        if (length < i3) {
            array = Arrays.copyOf(array, i3);
            kotlin.jvm.internal.j.d(array, "copyOf(...)");
        }
        int i10 = this.d;
        int i11 = this.c;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            objArr = this.a;
            if (i13 >= i10 || i11 >= this.b) {
                break;
            }
            array[i13] = objArr[i11];
            i13++;
            i11++;
        }
        while (i13 < i10) {
            array[i13] = objArr[i12];
            i13++;
            i12++;
        }
        if (i10 < array.length) {
            array[i10] = null;
        }
        return array;
    }
}
