package hd;

import a8.p0;
import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class t extends c implements RandomAccess {
    public final Object[] a;
    public final int b;
    public int c;
    public int d;

    public t(int i7, Object[] objArr) {
        this.a = objArr;
        if (i7 < 0) {
            throw new IllegalArgumentException(jg.g.j(i7, "ring buffer filled size should not be negative but it is ").toString());
        }
        if (i7 <= objArr.length) {
            this.b = objArr.length;
            this.d = i7;
        } else {
            StringBuilder n10 = jg.g.n(i7, "ring buffer filled size: ", " cannot be larger than the buffer size: ");
            n10.append(objArr.length);
            throw new IllegalArgumentException(n10.toString().toString());
        }
    }

    @Override // hd.c
    public final int f() {
        return this.d;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        int f10 = f();
        if (i7 < 0 || i7 >= f10) {
            throw new IndexOutOfBoundsException(p0.m(i7, f10, "index: ", ", size: "));
        }
        return this.a[(this.c + i7) % this.b];
    }

    public final void i() {
        if (20 > this.d) {
            throw new IllegalArgumentException(("n shouldn't be greater than the buffer size: n = 20, size = " + this.d).toString());
        }
        int i7 = this.c;
        int i10 = this.b;
        int i11 = (i7 + 20) % i10;
        Object[] objArr = this.a;
        if (i7 > i11) {
            e.e(i7, i10, objArr);
            e.e(0, i11, objArr);
        } else {
            e.e(i7, i11, objArr);
        }
        this.c = i11;
        this.d -= 20;
    }

    @Override // hd.c, java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new s(this);
    }

    @Override // hd.c, java.util.List, java.util.Collection
    public final Object[] toArray() {
        return toArray(new Object[f()]);
    }

    @Override // hd.c, java.util.List, java.util.Collection
    public final Object[] toArray(Object[] array) {
        Object[] objArr;
        kotlin.jvm.internal.j.e(array, "array");
        int length = array.length;
        int i7 = this.d;
        if (length < i7) {
            array = Arrays.copyOf(array, i7);
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
