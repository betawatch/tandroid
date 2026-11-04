package ed;

import b8.rb;
import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class e extends AbstractList implements List {
    public static final Object[] d = new Object[0];
    public int a;
    public Object[] b = d;
    public int c;

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i3, Object obj) {
        int i10;
        int i11 = this.c;
        if (i3 < 0 || i3 > i11) {
            throw new IndexOutOfBoundsException(a1.g.n(i3, i11, "index: ", ", size: "));
        }
        if (i3 == i11) {
            addLast(obj);
            return;
        }
        if (i3 == 0) {
            addFirst(obj);
            return;
        }
        n();
        i(this.c + 1);
        int m10 = m(this.a + i3);
        int i12 = this.c;
        if (i3 < ((i12 + 1) >> 1)) {
            if (m10 == 0) {
                Object[] objArr = this.b;
                kotlin.jvm.internal.j.e(objArr, "<this>");
                m10 = objArr.length;
            }
            int i13 = m10 - 1;
            int i14 = this.a;
            if (i14 == 0) {
                Object[] objArr2 = this.b;
                kotlin.jvm.internal.j.e(objArr2, "<this>");
                i10 = objArr2.length - 1;
            } else {
                i10 = i14 - 1;
            }
            int i15 = this.a;
            if (i13 >= i15) {
                Object[] objArr3 = this.b;
                objArr3[i10] = objArr3[i15];
                f.c(i15, i15 + 1, i13 + 1, objArr3, objArr3);
            } else {
                Object[] objArr4 = this.b;
                f.c(i15 - 1, i15, objArr4.length, objArr4, objArr4);
                Object[] objArr5 = this.b;
                objArr5[objArr5.length - 1] = objArr5[0];
                f.c(0, 1, i13 + 1, objArr5, objArr5);
            }
            this.b[i13] = obj;
            this.a = i10;
        } else {
            int m11 = m(this.a + i12);
            if (m10 < m11) {
                Object[] objArr6 = this.b;
                f.c(m10 + 1, m10, m11, objArr6, objArr6);
            } else {
                Object[] objArr7 = this.b;
                f.c(1, 0, m11, objArr7, objArr7);
                Object[] objArr8 = this.b;
                objArr8[0] = objArr8[objArr8.length - 1];
                f.c(m10 + 1, m10, objArr8.length - 1, objArr8, objArr8);
            }
            this.b[m10] = obj;
        }
        this.c++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i3, Collection elements) {
        kotlin.jvm.internal.j.e(elements, "elements");
        int i10 = this.c;
        if (i3 < 0 || i3 > i10) {
            throw new IndexOutOfBoundsException(a1.g.n(i3, i10, "index: ", ", size: "));
        }
        if (elements.isEmpty()) {
            return false;
        }
        if (i3 == this.c) {
            return addAll(elements);
        }
        n();
        i(elements.size() + this.c);
        int m10 = m(this.a + this.c);
        int m11 = m(this.a + i3);
        int size = elements.size();
        if (i3 >= ((this.c + 1) >> 1)) {
            int i11 = m11 + size;
            if (m11 < m10) {
                int i12 = size + m10;
                Object[] objArr = this.b;
                if (i12 <= objArr.length) {
                    f.c(i11, m11, m10, objArr, objArr);
                } else if (i11 >= objArr.length) {
                    f.c(i11 - objArr.length, m11, m10, objArr, objArr);
                } else {
                    int length = m10 - (i12 - objArr.length);
                    f.c(0, length, m10, objArr, objArr);
                    Object[] objArr2 = this.b;
                    f.c(i11, m11, length, objArr2, objArr2);
                }
            } else {
                Object[] objArr3 = this.b;
                f.c(size, 0, m10, objArr3, objArr3);
                Object[] objArr4 = this.b;
                if (i11 >= objArr4.length) {
                    f.c(i11 - objArr4.length, m11, objArr4.length, objArr4, objArr4);
                } else {
                    f.c(0, objArr4.length - size, objArr4.length, objArr4, objArr4);
                    Object[] objArr5 = this.b;
                    f.c(i11, m11, objArr5.length - size, objArr5, objArr5);
                }
            }
            h(m11, elements);
            return true;
        }
        int i13 = this.a;
        int i14 = i13 - size;
        if (m11 < i13) {
            Object[] objArr6 = this.b;
            f.c(i14, i13, objArr6.length, objArr6, objArr6);
            if (size >= m11) {
                Object[] objArr7 = this.b;
                f.c(objArr7.length - size, 0, m11, objArr7, objArr7);
            } else {
                Object[] objArr8 = this.b;
                f.c(objArr8.length - size, 0, size, objArr8, objArr8);
                Object[] objArr9 = this.b;
                f.c(0, size, m11, objArr9, objArr9);
            }
        } else if (i14 >= 0) {
            Object[] objArr10 = this.b;
            f.c(i14, i13, m11, objArr10, objArr10);
        } else {
            Object[] objArr11 = this.b;
            i14 += objArr11.length;
            int i15 = m11 - i13;
            int length2 = objArr11.length - i14;
            if (length2 >= i15) {
                f.c(i14, i13, m11, objArr11, objArr11);
            } else {
                f.c(i14, i13, i13 + length2, objArr11, objArr11);
                Object[] objArr12 = this.b;
                f.c(0, this.a + length2, m11, objArr12, objArr12);
            }
        }
        this.a = i14;
        h(k(m11 - size), elements);
        return true;
    }

    public final void addFirst(Object obj) {
        n();
        i(this.c + 1);
        int i3 = this.a;
        if (i3 == 0) {
            Object[] objArr = this.b;
            kotlin.jvm.internal.j.e(objArr, "<this>");
            i3 = objArr.length;
        }
        int i10 = i3 - 1;
        this.a = i10;
        this.b[i10] = obj;
        this.c++;
    }

    public final void addLast(Object obj) {
        n();
        i(this.c + 1);
        this.b[m(this.a + this.c)] = obj;
        this.c++;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            n();
            l(this.a, m(this.a + this.c));
        }
        this.a = 0;
        this.c = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i3) {
        int i10 = this.c;
        if (i3 < 0 || i3 >= i10) {
            throw new IndexOutOfBoundsException(a1.g.n(i3, i10, "index: ", ", size: "));
        }
        return this.b[m(this.a + i3)];
    }

    public final void h(int i3, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.b.length;
        while (i3 < length && it.hasNext()) {
            this.b[i3] = it.next();
            i3++;
        }
        int i10 = this.a;
        for (int i11 = 0; i11 < i10 && it.hasNext(); i11++) {
            this.b[i11] = it.next();
        }
        this.c = collection.size() + this.c;
    }

    public final void i(int i3) {
        if (i3 < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.b;
        if (i3 <= objArr.length) {
            return;
        }
        if (objArr == d) {
            if (i3 < 10) {
                i3 = 10;
            }
            this.b = new Object[i3];
            return;
        }
        int length = objArr.length;
        int i10 = length + (length >> 1);
        if (i10 - i3 < 0) {
            i10 = i3;
        }
        if (i10 - 2147483639 > 0) {
            i10 = i3 > 2147483639 ? ConnectionsManager.DEFAULT_DATACENTER_ID : 2147483639;
        }
        Object[] objArr2 = new Object[i10];
        f.c(0, this.a, objArr.length, objArr, objArr2);
        Object[] objArr3 = this.b;
        int length2 = objArr3.length;
        int i11 = this.a;
        f.c(length2 - i11, 0, i11, objArr3, objArr2);
        this.a = 0;
        this.b = objArr2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i3;
        int m10 = m(this.a + this.c);
        int i10 = this.a;
        if (i10 < m10) {
            while (i10 < m10) {
                if (kotlin.jvm.internal.j.a(obj, this.b[i10])) {
                    i3 = this.a;
                } else {
                    i10++;
                }
            }
            return -1;
        }
        if (i10 < m10) {
            return -1;
        }
        int length = this.b.length;
        while (true) {
            if (i10 >= length) {
                for (int i11 = 0; i11 < m10; i11++) {
                    if (kotlin.jvm.internal.j.a(obj, this.b[i11])) {
                        i10 = i11 + this.b.length;
                        i3 = this.a;
                    }
                }
                return -1;
            }
            if (kotlin.jvm.internal.j.a(obj, this.b[i10])) {
                i3 = this.a;
                break;
            }
            i10++;
        }
        return i10 - i3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.c == 0;
    }

    public final int j(int i3) {
        kotlin.jvm.internal.j.e(this.b, "<this>");
        if (i3 == r0.length - 1) {
            return 0;
        }
        return i3 + 1;
    }

    public final int k(int i3) {
        return i3 < 0 ? i3 + this.b.length : i3;
    }

    public final void l(int i3, int i10) {
        if (i3 < i10) {
            f.e(i3, i10, this.b);
            return;
        }
        Object[] objArr = this.b;
        f.e(i3, objArr.length, objArr);
        f.e(0, i10, this.b);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i3;
        int m10 = m(this.a + this.c);
        int i10 = this.a;
        if (i10 < m10) {
            length = m10 - 1;
            if (i10 <= length) {
                while (!kotlin.jvm.internal.j.a(obj, this.b[length])) {
                    if (length != i10) {
                        length--;
                    }
                }
                i3 = this.a;
                return length - i3;
            }
            return -1;
        }
        if (i10 > m10) {
            int i11 = m10 - 1;
            while (true) {
                if (-1 >= i11) {
                    Object[] objArr = this.b;
                    kotlin.jvm.internal.j.e(objArr, "<this>");
                    length = objArr.length - 1;
                    int i12 = this.a;
                    if (i12 <= length) {
                        while (!kotlin.jvm.internal.j.a(obj, this.b[length])) {
                            if (length != i12) {
                                length--;
                            }
                        }
                        i3 = this.a;
                    }
                } else {
                    if (kotlin.jvm.internal.j.a(obj, this.b[i11])) {
                        length = i11 + this.b.length;
                        i3 = this.a;
                        break;
                    }
                    i11--;
                }
            }
        }
        return -1;
    }

    public final int m(int i3) {
        Object[] objArr = this.b;
        return i3 >= objArr.length ? i3 - objArr.length : i3;
    }

    public final void n() {
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i3) {
        int i10 = this.c;
        if (i3 < 0 || i3 >= i10) {
            throw new IndexOutOfBoundsException(a1.g.n(i3, i10, "index: ", ", size: "));
        }
        if (i3 == h.b(this)) {
            return removeLast();
        }
        if (i3 == 0) {
            return removeFirst();
        }
        n();
        int m10 = m(this.a + i3);
        Object[] objArr = this.b;
        Object obj = objArr[m10];
        if (i3 < (this.c >> 1)) {
            int i11 = this.a;
            if (m10 >= i11) {
                f.c(i11 + 1, i11, m10, objArr, objArr);
            } else {
                f.c(1, 0, m10, objArr, objArr);
                Object[] objArr2 = this.b;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i12 = this.a;
                f.c(i12 + 1, i12, objArr2.length - 1, objArr2, objArr2);
            }
            Object[] objArr3 = this.b;
            int i13 = this.a;
            objArr3[i13] = null;
            this.a = j(i13);
        } else {
            int m11 = m(h.b(this) + this.a);
            if (m10 <= m11) {
                Object[] objArr4 = this.b;
                f.c(m10, m10 + 1, m11 + 1, objArr4, objArr4);
            } else {
                Object[] objArr5 = this.b;
                f.c(m10, m10 + 1, objArr5.length, objArr5, objArr5);
                Object[] objArr6 = this.b;
                objArr6[objArr6.length - 1] = objArr6[0];
                f.c(0, 1, m11 + 1, objArr6, objArr6);
            }
            this.b[m11] = null;
        }
        this.c--;
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection elements) {
        int m10;
        kotlin.jvm.internal.j.e(elements, "elements");
        boolean z10 = false;
        z10 = false;
        z10 = false;
        if (!isEmpty() && this.b.length != 0) {
            int m11 = m(this.a + this.c);
            int i3 = this.a;
            if (i3 < m11) {
                m10 = i3;
                while (i3 < m11) {
                    Object obj = this.b[i3];
                    if (elements.contains(obj)) {
                        z10 = true;
                    } else {
                        this.b[m10] = obj;
                        m10++;
                    }
                    i3++;
                }
                f.e(m10, m11, this.b);
            } else {
                int length = this.b.length;
                boolean z11 = false;
                int i10 = i3;
                while (i3 < length) {
                    Object[] objArr = this.b;
                    Object obj2 = objArr[i3];
                    objArr[i3] = null;
                    if (elements.contains(obj2)) {
                        z11 = true;
                    } else {
                        this.b[i10] = obj2;
                        i10++;
                    }
                    i3++;
                }
                m10 = m(i10);
                for (int i11 = 0; i11 < m11; i11++) {
                    Object[] objArr2 = this.b;
                    Object obj3 = objArr2[i11];
                    objArr2[i11] = null;
                    if (elements.contains(obj3)) {
                        z11 = true;
                    } else {
                        this.b[m10] = obj3;
                        m10 = j(m10);
                    }
                }
                z10 = z11;
            }
            if (z10) {
                n();
                this.c = k(m10 - this.a);
            }
        }
        return z10;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        n();
        Object[] objArr = this.b;
        int i3 = this.a;
        Object obj = objArr[i3];
        objArr[i3] = null;
        this.a = j(i3);
        this.c--;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        n();
        int m10 = m(h.b(this) + this.a);
        Object[] objArr = this.b;
        Object obj = objArr[m10];
        objArr[m10] = null;
        this.c--;
        return obj;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i3, int i10) {
        rb.a(i3, i10, this.c);
        int i11 = i10 - i3;
        if (i11 == 0) {
            return;
        }
        if (i11 == this.c) {
            clear();
            return;
        }
        if (i11 == 1) {
            remove(i3);
            return;
        }
        n();
        if (i3 < this.c - i10) {
            int m10 = m((i3 - 1) + this.a);
            int m11 = m((i10 - 1) + this.a);
            while (i3 > 0) {
                int i12 = m10 + 1;
                int min = Math.min(i3, Math.min(i12, m11 + 1));
                Object[] objArr = this.b;
                int i13 = m11 - min;
                int i14 = m10 - min;
                f.c(i13 + 1, i14 + 1, i12, objArr, objArr);
                m10 = k(i14);
                m11 = k(i13);
                i3 -= min;
            }
            int m12 = m(this.a + i11);
            l(this.a, m12);
            this.a = m12;
        } else {
            int m13 = m(this.a + i10);
            int m14 = m(this.a + i3);
            int i15 = this.c;
            while (true) {
                i15 -= i10;
                if (i15 <= 0) {
                    break;
                }
                Object[] objArr2 = this.b;
                i10 = Math.min(i15, Math.min(objArr2.length - m13, objArr2.length - m14));
                Object[] objArr3 = this.b;
                int i16 = m13 + i10;
                f.c(m14, m13, i16, objArr3, objArr3);
                m13 = m(i16);
                m14 = m(m14 + i10);
            }
            int m15 = m(this.a + this.c);
            l(k(m15 - i11), m15);
        }
        this.c -= i11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection elements) {
        int m10;
        kotlin.jvm.internal.j.e(elements, "elements");
        boolean z10 = false;
        z10 = false;
        z10 = false;
        if (!isEmpty() && this.b.length != 0) {
            int m11 = m(this.a + this.c);
            int i3 = this.a;
            if (i3 < m11) {
                m10 = i3;
                while (i3 < m11) {
                    Object obj = this.b[i3];
                    if (elements.contains(obj)) {
                        this.b[m10] = obj;
                        m10++;
                    } else {
                        z10 = true;
                    }
                    i3++;
                }
                f.e(m10, m11, this.b);
            } else {
                int length = this.b.length;
                boolean z11 = false;
                int i10 = i3;
                while (i3 < length) {
                    Object[] objArr = this.b;
                    Object obj2 = objArr[i3];
                    objArr[i3] = null;
                    if (elements.contains(obj2)) {
                        this.b[i10] = obj2;
                        i10++;
                    } else {
                        z11 = true;
                    }
                    i3++;
                }
                m10 = m(i10);
                for (int i11 = 0; i11 < m11; i11++) {
                    Object[] objArr2 = this.b;
                    Object obj3 = objArr2[i11];
                    objArr2[i11] = null;
                    if (elements.contains(obj3)) {
                        this.b[m10] = obj3;
                        m10 = j(m10);
                    } else {
                        z11 = true;
                    }
                }
                z10 = z11;
            }
            if (z10) {
                n();
                this.c = k(m10 - this.a);
            }
        }
        return z10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i3, Object obj) {
        int i10 = this.c;
        if (i3 < 0 || i3 >= i10) {
            throw new IndexOutOfBoundsException(a1.g.n(i3, i10, "index: ", ", size: "));
        }
        int m10 = m(this.a + i3);
        Object[] objArr = this.b;
        Object obj2 = objArr[m10];
        objArr[m10] = obj;
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
        kotlin.jvm.internal.j.e(array, "array");
        int length = array.length;
        int i3 = this.c;
        if (length < i3) {
            Object newInstance = Array.newInstance(array.getClass().getComponentType(), i3);
            kotlin.jvm.internal.j.c(newInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            array = (Object[]) newInstance;
        }
        int m10 = m(this.a + this.c);
        int i10 = this.a;
        if (i10 < m10) {
            f.d(i10, m10, 2, this.b, array);
        } else if (!isEmpty()) {
            Object[] objArr = this.b;
            f.c(0, this.a, objArr.length, objArr, array);
            Object[] objArr2 = this.b;
            f.c(objArr2.length - this.a, 0, m10, objArr2, array);
        }
        int i11 = this.c;
        if (i11 < array.length) {
            array[i11] = null;
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
        kotlin.jvm.internal.j.e(elements, "elements");
        if (elements.isEmpty()) {
            return false;
        }
        n();
        i(elements.size() + this.c);
        h(m(this.a + this.c), elements);
        return true;
    }
}
