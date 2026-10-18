package jd;

import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes.dex */
public final class t extends c implements RandomAccess {
    public final Object[] a;
    public final int b;
    public int c;
    public int d;

    public t(int i10, Object[] objArr) {
        this.a = objArr;
        if (i10 < 0) {
            throw new IllegalArgumentException(i2.d.j(i10, "ring buffer filled size should not be negative but it is ").toString());
        }
        if (i10 <= objArr.length) {
            this.b = objArr.length;
            this.d = i10;
        } else {
            StringBuilder l4 = i2.d.l(i10, "ring buffer filled size: ", " cannot be larger than the buffer size: ");
            l4.append(objArr.length);
            throw new IllegalArgumentException(l4.toString().toString());
        }
    }

    @Override // java.util.List
    public final Object get(int i10) {
        int h = h();
        if (i10 < 0 || i10 >= h) {
            throw new IndexOutOfBoundsException(a1.g.l(i10, h, "index: ", ", size: "));
        }
        return this.a[(this.c + i10) % this.b];
    }

    @Override // jd.c
    public final int h() {
        return this.d;
    }

    @Override // jd.c, java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new s(this);
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
            f.e(i10, i11, objArr);
            f.e(0, i12, objArr);
        } else {
            f.e(i10, i12, objArr);
        }
        this.c = i12;
        this.d -= 20;
    }

    @Override // jd.c, java.util.List, java.util.Collection
    public final Object[] toArray() {
        return toArray(new Object[h()]);
    }

    @Override // jd.c, java.util.List, java.util.Collection
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
