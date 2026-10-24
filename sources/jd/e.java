package jd;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import org.telegram.tgnet.ConnectionsManager;
import v7.s8;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class e extends AbstractList implements List {
    public static final Object[] d = new Object[0];
    public int a;
    public Object[] b = d;
    public int c;

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        int i12 = this.c;
        if (i10 < 0 || i10 > i12) {
            throw new IndexOutOfBoundsException(a1.g.l(i10, i12, "index: ", ", size: "));
        }
        if (i10 == i12) {
            addLast(obj);
            return;
        }
        if (i10 == 0) {
            addFirst(obj);
            return;
        }
        r();
        m(this.c + 1);
        int q6 = q(this.a + i10);
        int i13 = this.c;
        if (i10 < ((i13 + 1) >> 1)) {
            if (q6 == 0) {
                Object[] objArr = this.b;
                kotlin.jvm.internal.i.e(objArr, "<this>");
                q6 = objArr.length;
            }
            int i14 = q6 - 1;
            int i15 = this.a;
            if (i15 == 0) {
                Object[] objArr2 = this.b;
                kotlin.jvm.internal.i.e(objArr2, "<this>");
                i11 = objArr2.length - 1;
            } else {
                i11 = i15 - 1;
            }
            int i16 = this.a;
            if (i14 >= i16) {
                Object[] objArr3 = this.b;
                objArr3[i11] = objArr3[i16];
                f.c(i16, i16 + 1, i14 + 1, objArr3, objArr3);
            } else {
                Object[] objArr4 = this.b;
                f.c(i16 - 1, i16, objArr4.length, objArr4, objArr4);
                Object[] objArr5 = this.b;
                objArr5[objArr5.length - 1] = objArr5[0];
                f.c(0, 1, i14 + 1, objArr5, objArr5);
            }
            this.b[i14] = obj;
            this.a = i11;
        } else {
            int q10 = q(this.a + i13);
            if (q6 < q10) {
                Object[] objArr6 = this.b;
                f.c(q6 + 1, q6, q10, objArr6, objArr6);
            } else {
                Object[] objArr7 = this.b;
                f.c(1, 0, q10, objArr7, objArr7);
                Object[] objArr8 = this.b;
                objArr8[0] = objArr8[objArr8.length - 1];
                f.c(q6 + 1, q6, objArr8.length - 1, objArr8, objArr8);
            }
            this.b[q6] = obj;
        }
        this.c++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i10, Collection elements) {
        kotlin.jvm.internal.i.e(elements, "elements");
        int i11 = this.c;
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(a1.g.l(i10, i11, "index: ", ", size: "));
        }
        if (elements.isEmpty()) {
            return false;
        }
        if (i10 == this.c) {
            return addAll(elements);
        }
        r();
        m(elements.size() + this.c);
        int q6 = q(this.a + this.c);
        int q10 = q(this.a + i10);
        int size = elements.size();
        if (i10 >= ((this.c + 1) >> 1)) {
            int i12 = q10 + size;
            if (q10 < q6) {
                int i13 = size + q6;
                Object[] objArr = this.b;
                if (i13 <= objArr.length) {
                    f.c(i12, q10, q6, objArr, objArr);
                } else if (i12 >= objArr.length) {
                    f.c(i12 - objArr.length, q10, q6, objArr, objArr);
                } else {
                    int length = q6 - (i13 - objArr.length);
                    f.c(0, length, q6, objArr, objArr);
                    Object[] objArr2 = this.b;
                    f.c(i12, q10, length, objArr2, objArr2);
                }
            } else {
                Object[] objArr3 = this.b;
                f.c(size, 0, q6, objArr3, objArr3);
                Object[] objArr4 = this.b;
                if (i12 >= objArr4.length) {
                    f.c(i12 - objArr4.length, q10, objArr4.length, objArr4, objArr4);
                } else {
                    f.c(0, objArr4.length - size, objArr4.length, objArr4, objArr4);
                    Object[] objArr5 = this.b;
                    f.c(i12, q10, objArr5.length - size, objArr5, objArr5);
                }
            }
            h(q10, elements);
            return true;
        }
        int i14 = this.a;
        int i15 = i14 - size;
        if (q10 < i14) {
            Object[] objArr6 = this.b;
            f.c(i15, i14, objArr6.length, objArr6, objArr6);
            if (size >= q10) {
                Object[] objArr7 = this.b;
                f.c(objArr7.length - size, 0, q10, objArr7, objArr7);
            } else {
                Object[] objArr8 = this.b;
                f.c(objArr8.length - size, 0, size, objArr8, objArr8);
                Object[] objArr9 = this.b;
                f.c(0, size, q10, objArr9, objArr9);
            }
        } else if (i15 >= 0) {
            Object[] objArr10 = this.b;
            f.c(i15, i14, q10, objArr10, objArr10);
        } else {
            Object[] objArr11 = this.b;
            i15 += objArr11.length;
            int i16 = q10 - i14;
            int length2 = objArr11.length - i15;
            if (length2 >= i16) {
                f.c(i15, i14, q10, objArr11, objArr11);
            } else {
                f.c(i15, i14, i14 + length2, objArr11, objArr11);
                Object[] objArr12 = this.b;
                f.c(0, this.a + length2, q10, objArr12, objArr12);
            }
        }
        this.a = i15;
        h(o(q10 - size), elements);
        return true;
    }

    public final void addFirst(Object obj) {
        r();
        m(this.c + 1);
        int i10 = this.a;
        if (i10 == 0) {
            Object[] objArr = this.b;
            kotlin.jvm.internal.i.e(objArr, "<this>");
            i10 = objArr.length;
        }
        int i11 = i10 - 1;
        this.a = i11;
        this.b[i11] = obj;
        this.c++;
    }

    public final void addLast(Object obj) {
        r();
        m(this.c + 1);
        this.b[q(this.a + this.c)] = obj;
        this.c++;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            r();
            p(this.a, q(this.a + this.c));
        }
        this.a = 0;
        this.c = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        int i11 = this.c;
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException(a1.g.l(i10, i11, "index: ", ", size: "));
        }
        return this.b[q(this.a + i10)];
    }

    public final void h(int i10, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.b.length;
        while (i10 < length && it.hasNext()) {
            this.b[i10] = it.next();
            i10++;
        }
        int i11 = this.a;
        for (int i12 = 0; i12 < i11 && it.hasNext(); i12++) {
            this.b[i12] = it.next();
        }
        this.c = collection.size() + this.c;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i10;
        int q6 = q(this.a + this.c);
        int i11 = this.a;
        if (i11 < q6) {
            while (i11 < q6) {
                if (kotlin.jvm.internal.i.a(obj, this.b[i11])) {
                    i10 = this.a;
                } else {
                    i11++;
                }
            }
            return -1;
        }
        if (i11 < q6) {
            return -1;
        }
        int length = this.b.length;
        while (true) {
            if (i11 >= length) {
                for (int i12 = 0; i12 < q6; i12++) {
                    if (kotlin.jvm.internal.i.a(obj, this.b[i12])) {
                        i11 = i12 + this.b.length;
                        i10 = this.a;
                    }
                }
                return -1;
            }
            if (kotlin.jvm.internal.i.a(obj, this.b[i11])) {
                i10 = this.a;
                break;
            }
            i11++;
        }
        return i11 - i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.c == 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i10;
        int q6 = q(this.a + this.c);
        int i11 = this.a;
        if (i11 < q6) {
            length = q6 - 1;
            if (i11 <= length) {
                while (!kotlin.jvm.internal.i.a(obj, this.b[length])) {
                    if (length != i11) {
                        length--;
                    }
                }
                i10 = this.a;
                return length - i10;
            }
            return -1;
        }
        if (i11 > q6) {
            int i12 = q6 - 1;
            while (true) {
                if (-1 >= i12) {
                    Object[] objArr = this.b;
                    kotlin.jvm.internal.i.e(objArr, "<this>");
                    length = objArr.length - 1;
                    int i13 = this.a;
                    if (i13 <= length) {
                        while (!kotlin.jvm.internal.i.a(obj, this.b[length])) {
                            if (length != i13) {
                                length--;
                            }
                        }
                        i10 = this.a;
                    }
                } else {
                    if (kotlin.jvm.internal.i.a(obj, this.b[i12])) {
                        length = i12 + this.b.length;
                        i10 = this.a;
                        break;
                    }
                    i12--;
                }
            }
        }
        return -1;
    }

    public final void m(int i10) {
        if (i10 < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.b;
        if (i10 <= objArr.length) {
            return;
        }
        if (objArr == d) {
            if (i10 < 10) {
                i10 = 10;
            }
            this.b = new Object[i10];
            return;
        }
        int length = objArr.length;
        int i11 = length + (length >> 1);
        if (i11 - i10 < 0) {
            i11 = i10;
        }
        if (i11 - 2147483639 > 0) {
            i11 = i10 > 2147483639 ? ConnectionsManager.DEFAULT_DATACENTER_ID : 2147483639;
        }
        Object[] objArr2 = new Object[i11];
        f.c(0, this.a, objArr.length, objArr, objArr2);
        Object[] objArr3 = this.b;
        int length2 = objArr3.length;
        int i12 = this.a;
        f.c(length2 - i12, 0, i12, objArr3, objArr2);
        this.a = 0;
        this.b = objArr2;
    }

    public final int n(int i10) {
        kotlin.jvm.internal.i.e(this.b, "<this>");
        if (i10 == r0.length - 1) {
            return 0;
        }
        return i10 + 1;
    }

    public final int o(int i10) {
        return i10 < 0 ? i10 + this.b.length : i10;
    }

    public final void p(int i10, int i11) {
        if (i10 < i11) {
            f.e(i10, i11, this.b);
            return;
        }
        Object[] objArr = this.b;
        f.e(i10, objArr.length, objArr);
        f.e(0, i11, this.b);
    }

    public final int q(int i10) {
        Object[] objArr = this.b;
        return i10 >= objArr.length ? i10 - objArr.length : i10;
    }

    public final void r() {
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        int i11 = this.c;
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException(a1.g.l(i10, i11, "index: ", ", size: "));
        }
        if (i10 == h.a(this)) {
            return removeLast();
        }
        if (i10 == 0) {
            return removeFirst();
        }
        r();
        int q6 = q(this.a + i10);
        Object[] objArr = this.b;
        Object obj = objArr[q6];
        if (i10 < (this.c >> 1)) {
            int i12 = this.a;
            if (q6 >= i12) {
                f.c(i12 + 1, i12, q6, objArr, objArr);
            } else {
                f.c(1, 0, q6, objArr, objArr);
                Object[] objArr2 = this.b;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i13 = this.a;
                f.c(i13 + 1, i13, objArr2.length - 1, objArr2, objArr2);
            }
            Object[] objArr3 = this.b;
            int i14 = this.a;
            objArr3[i14] = null;
            this.a = n(i14);
        } else {
            int q10 = q(h.a(this) + this.a);
            if (q6 <= q10) {
                Object[] objArr4 = this.b;
                f.c(q6, q6 + 1, q10 + 1, objArr4, objArr4);
            } else {
                Object[] objArr5 = this.b;
                f.c(q6, q6 + 1, objArr5.length, objArr5, objArr5);
                Object[] objArr6 = this.b;
                objArr6[objArr6.length - 1] = objArr6[0];
                f.c(0, 1, q10 + 1, objArr6, objArr6);
            }
            this.b[q10] = null;
        }
        this.c--;
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection elements) {
        int q6;
        kotlin.jvm.internal.i.e(elements, "elements");
        boolean z10 = false;
        z10 = false;
        z10 = false;
        if (!isEmpty() && this.b.length != 0) {
            int q10 = q(this.a + this.c);
            int i10 = this.a;
            if (i10 < q10) {
                q6 = i10;
                while (i10 < q10) {
                    Object obj = this.b[i10];
                    if (elements.contains(obj)) {
                        z10 = true;
                    } else {
                        this.b[q6] = obj;
                        q6++;
                    }
                    i10++;
                }
                f.e(q6, q10, this.b);
            } else {
                int length = this.b.length;
                boolean z11 = false;
                int i11 = i10;
                while (i10 < length) {
                    Object[] objArr = this.b;
                    Object obj2 = objArr[i10];
                    objArr[i10] = null;
                    if (elements.contains(obj2)) {
                        z11 = true;
                    } else {
                        this.b[i11] = obj2;
                        i11++;
                    }
                    i10++;
                }
                q6 = q(i11);
                for (int i12 = 0; i12 < q10; i12++) {
                    Object[] objArr2 = this.b;
                    Object obj3 = objArr2[i12];
                    objArr2[i12] = null;
                    if (elements.contains(obj3)) {
                        z11 = true;
                    } else {
                        this.b[q6] = obj3;
                        q6 = n(q6);
                    }
                }
                z10 = z11;
            }
            if (z10) {
                r();
                this.c = o(q6 - this.a);
            }
        }
        return z10;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        r();
        Object[] objArr = this.b;
        int i10 = this.a;
        Object obj = objArr[i10];
        objArr[i10] = null;
        this.a = n(i10);
        this.c--;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        r();
        int q6 = q(h.a(this) + this.a);
        Object[] objArr = this.b;
        Object obj = objArr[q6];
        objArr[q6] = null;
        this.c--;
        return obj;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        s8.a(i10, i11, this.c);
        int i12 = i11 - i10;
        if (i12 == 0) {
            return;
        }
        if (i12 == this.c) {
            clear();
            return;
        }
        if (i12 == 1) {
            remove(i10);
            return;
        }
        r();
        if (i10 < this.c - i11) {
            int q6 = q((i10 - 1) + this.a);
            int q10 = q((i11 - 1) + this.a);
            while (i10 > 0) {
                int i13 = q6 + 1;
                int min = Math.min(i10, Math.min(i13, q10 + 1));
                Object[] objArr = this.b;
                int i14 = q10 - min;
                int i15 = q6 - min;
                f.c(i14 + 1, i15 + 1, i13, objArr, objArr);
                q6 = o(i15);
                q10 = o(i14);
                i10 -= min;
            }
            int q11 = q(this.a + i12);
            p(this.a, q11);
            this.a = q11;
        } else {
            int q12 = q(this.a + i11);
            int q13 = q(this.a + i10);
            int i16 = this.c;
            while (true) {
                i16 -= i11;
                if (i16 <= 0) {
                    break;
                }
                Object[] objArr2 = this.b;
                i11 = Math.min(i16, Math.min(objArr2.length - q12, objArr2.length - q13));
                Object[] objArr3 = this.b;
                int i17 = q12 + i11;
                f.c(q13, q12, i17, objArr3, objArr3);
                q12 = q(i17);
                q13 = q(q13 + i11);
            }
            int q14 = q(this.a + this.c);
            p(o(q14 - i12), q14);
        }
        this.c -= i12;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection elements) {
        int q6;
        kotlin.jvm.internal.i.e(elements, "elements");
        boolean z10 = false;
        z10 = false;
        z10 = false;
        if (!isEmpty() && this.b.length != 0) {
            int q10 = q(this.a + this.c);
            int i10 = this.a;
            if (i10 < q10) {
                q6 = i10;
                while (i10 < q10) {
                    Object obj = this.b[i10];
                    if (elements.contains(obj)) {
                        this.b[q6] = obj;
                        q6++;
                    } else {
                        z10 = true;
                    }
                    i10++;
                }
                f.e(q6, q10, this.b);
            } else {
                int length = this.b.length;
                boolean z11 = false;
                int i11 = i10;
                while (i10 < length) {
                    Object[] objArr = this.b;
                    Object obj2 = objArr[i10];
                    objArr[i10] = null;
                    if (elements.contains(obj2)) {
                        this.b[i11] = obj2;
                        i11++;
                    } else {
                        z11 = true;
                    }
                    i10++;
                }
                q6 = q(i11);
                for (int i12 = 0; i12 < q10; i12++) {
                    Object[] objArr2 = this.b;
                    Object obj3 = objArr2[i12];
                    objArr2[i12] = null;
                    if (elements.contains(obj3)) {
                        this.b[q6] = obj3;
                        q6 = n(q6);
                    } else {
                        z11 = true;
                    }
                }
                z10 = z11;
            }
            if (z10) {
                r();
                this.c = o(q6 - this.a);
            }
        }
        return z10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        int i11 = this.c;
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException(a1.g.l(i10, i11, "index: ", ", size: "));
        }
        int q6 = q(this.a + i10);
        Object[] objArr = this.b;
        Object obj2 = objArr[q6];
        objArr[q6] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[this.c]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] array) {
        kotlin.jvm.internal.i.e(array, "array");
        int length = array.length;
        int i10 = this.c;
        if (length < i10) {
            Object newInstance = Array.newInstance(array.getClass().getComponentType(), i10);
            kotlin.jvm.internal.i.c(newInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            array = (Object[]) newInstance;
        }
        int q6 = q(this.a + this.c);
        int i11 = this.a;
        if (i11 < q6) {
            f.d(i11, q6, 2, this.b, array);
        } else if (!isEmpty()) {
            Object[] objArr = this.b;
            f.c(0, this.a, objArr.length, objArr, array);
            Object[] objArr2 = this.b;
            f.c(objArr2.length - this.a, 0, q6, objArr2, array);
        }
        int i12 = this.c;
        if (i12 < array.length) {
            array[i12] = null;
        }
        return array;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection elements) {
        kotlin.jvm.internal.i.e(elements, "elements");
        if (elements.isEmpty()) {
            return false;
        }
        r();
        m(elements.size() + this.c);
        h(q(this.a + this.c), elements);
        return true;
    }
}
