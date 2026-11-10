package hd;

import a8.p0;
import c8.b0;
import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class d extends AbstractList implements List {
    public static final Object[] d = new Object[0];
    public int a;
    public Object[] b = d;
    public int c;

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i7, Object obj) {
        int i10;
        int i11 = this.c;
        if (i7 < 0 || i7 > i11) {
            throw new IndexOutOfBoundsException(p0.m(i7, i11, "index: ", ", size: "));
        }
        if (i7 == i11) {
            addLast(obj);
            return;
        }
        if (i7 == 0) {
            addFirst(obj);
            return;
        }
        n();
        i(this.c + 1);
        int m10 = m(this.a + i7);
        int i12 = this.c;
        if (i7 < ((i12 + 1) >> 1)) {
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
                e.c(i15, i15 + 1, i13 + 1, objArr3, objArr3);
            } else {
                Object[] objArr4 = this.b;
                e.c(i15 - 1, i15, objArr4.length, objArr4, objArr4);
                Object[] objArr5 = this.b;
                objArr5[objArr5.length - 1] = objArr5[0];
                e.c(0, 1, i13 + 1, objArr5, objArr5);
            }
            this.b[i13] = obj;
            this.a = i10;
        } else {
            int m11 = m(this.a + i12);
            if (m10 < m11) {
                Object[] objArr6 = this.b;
                e.c(m10 + 1, m10, m11, objArr6, objArr6);
            } else {
                Object[] objArr7 = this.b;
                e.c(1, 0, m11, objArr7, objArr7);
                Object[] objArr8 = this.b;
                objArr8[0] = objArr8[objArr8.length - 1];
                e.c(m10 + 1, m10, objArr8.length - 1, objArr8, objArr8);
            }
            this.b[m10] = obj;
        }
        this.c++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i7, Collection elements) {
        kotlin.jvm.internal.j.e(elements, "elements");
        int i10 = this.c;
        if (i7 < 0 || i7 > i10) {
            throw new IndexOutOfBoundsException(p0.m(i7, i10, "index: ", ", size: "));
        }
        if (elements.isEmpty()) {
            return false;
        }
        if (i7 == this.c) {
            return addAll(elements);
        }
        n();
        i(elements.size() + this.c);
        int m10 = m(this.a + this.c);
        int m11 = m(this.a + i7);
        int size = elements.size();
        if (i7 >= ((this.c + 1) >> 1)) {
            int i11 = m11 + size;
            if (m11 < m10) {
                int i12 = size + m10;
                Object[] objArr = this.b;
                if (i12 <= objArr.length) {
                    e.c(i11, m11, m10, objArr, objArr);
                } else if (i11 >= objArr.length) {
                    e.c(i11 - objArr.length, m11, m10, objArr, objArr);
                } else {
                    int length = m10 - (i12 - objArr.length);
                    e.c(0, length, m10, objArr, objArr);
                    Object[] objArr2 = this.b;
                    e.c(i11, m11, length, objArr2, objArr2);
                }
            } else {
                Object[] objArr3 = this.b;
                e.c(size, 0, m10, objArr3, objArr3);
                Object[] objArr4 = this.b;
                if (i11 >= objArr4.length) {
                    e.c(i11 - objArr4.length, m11, objArr4.length, objArr4, objArr4);
                } else {
                    e.c(0, objArr4.length - size, objArr4.length, objArr4, objArr4);
                    Object[] objArr5 = this.b;
                    e.c(i11, m11, objArr5.length - size, objArr5, objArr5);
                }
            }
            f(m11, elements);
            return true;
        }
        int i13 = this.a;
        int i14 = i13 - size;
        if (m11 < i13) {
            Object[] objArr6 = this.b;
            e.c(i14, i13, objArr6.length, objArr6, objArr6);
            if (size >= m11) {
                Object[] objArr7 = this.b;
                e.c(objArr7.length - size, 0, m11, objArr7, objArr7);
            } else {
                Object[] objArr8 = this.b;
                e.c(objArr8.length - size, 0, size, objArr8, objArr8);
                Object[] objArr9 = this.b;
                e.c(0, size, m11, objArr9, objArr9);
            }
        } else if (i14 >= 0) {
            Object[] objArr10 = this.b;
            e.c(i14, i13, m11, objArr10, objArr10);
        } else {
            Object[] objArr11 = this.b;
            i14 += objArr11.length;
            int i15 = m11 - i13;
            int length2 = objArr11.length - i14;
            if (length2 >= i15) {
                e.c(i14, i13, m11, objArr11, objArr11);
            } else {
                e.c(i14, i13, i13 + length2, objArr11, objArr11);
                Object[] objArr12 = this.b;
                e.c(0, this.a + length2, m11, objArr12, objArr12);
            }
        }
        this.a = i14;
        f(k(m11 - size), elements);
        return true;
    }

    public final void addFirst(Object obj) {
        n();
        i(this.c + 1);
        int i7 = this.a;
        if (i7 == 0) {
            Object[] objArr = this.b;
            kotlin.jvm.internal.j.e(objArr, "<this>");
            i7 = objArr.length;
        }
        int i10 = i7 - 1;
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

    public final void f(int i7, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.b.length;
        while (i7 < length && it.hasNext()) {
            this.b[i7] = it.next();
            i7++;
        }
        int i10 = this.a;
        for (int i11 = 0; i11 < i10 && it.hasNext(); i11++) {
            this.b[i11] = it.next();
        }
        this.c = collection.size() + this.c;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i7) {
        int i10 = this.c;
        if (i7 < 0 || i7 >= i10) {
            throw new IndexOutOfBoundsException(p0.m(i7, i10, "index: ", ", size: "));
        }
        return this.b[m(this.a + i7)];
    }

    public final void i(int i7) {
        if (i7 < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.b;
        if (i7 <= objArr.length) {
            return;
        }
        if (objArr == d) {
            if (i7 < 10) {
                i7 = 10;
            }
            this.b = new Object[i7];
            return;
        }
        int length = objArr.length;
        int i10 = length + (length >> 1);
        if (i10 - i7 < 0) {
            i10 = i7;
        }
        if (i10 - 2147483639 > 0) {
            i10 = i7 > 2147483639 ? ConnectionsManager.DEFAULT_DATACENTER_ID : 2147483639;
        }
        Object[] objArr2 = new Object[i10];
        e.c(0, this.a, objArr.length, objArr, objArr2);
        Object[] objArr3 = this.b;
        int length2 = objArr3.length;
        int i11 = this.a;
        e.c(length2 - i11, 0, i11, objArr3, objArr2);
        this.a = 0;
        this.b = objArr2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i7;
        int m10 = m(this.a + this.c);
        int i10 = this.a;
        if (i10 < m10) {
            while (i10 < m10) {
                if (kotlin.jvm.internal.j.a(obj, this.b[i10])) {
                    i7 = this.a;
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
                        i7 = this.a;
                    }
                }
                return -1;
            }
            if (kotlin.jvm.internal.j.a(obj, this.b[i10])) {
                i7 = this.a;
                break;
            }
            i10++;
        }
        return i10 - i7;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.c == 0;
    }

    public final int j(int i7) {
        kotlin.jvm.internal.j.e(this.b, "<this>");
        if (i7 == r0.length - 1) {
            return 0;
        }
        return i7 + 1;
    }

    public final int k(int i7) {
        return i7 < 0 ? i7 + this.b.length : i7;
    }

    public final void l(int i7, int i10) {
        if (i7 < i10) {
            e.e(i7, i10, this.b);
            return;
        }
        Object[] objArr = this.b;
        e.e(i7, objArr.length, objArr);
        e.e(0, i10, this.b);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i7;
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
                i7 = this.a;
                return length - i7;
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
                        i7 = this.a;
                    }
                } else {
                    if (kotlin.jvm.internal.j.a(obj, this.b[i11])) {
                        length = i11 + this.b.length;
                        i7 = this.a;
                        break;
                    }
                    i11--;
                }
            }
        }
        return -1;
    }

    public final int m(int i7) {
        Object[] objArr = this.b;
        return i7 >= objArr.length ? i7 - objArr.length : i7;
    }

    public final void n() {
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i7) {
        int i10 = this.c;
        if (i7 < 0 || i7 >= i10) {
            throw new IndexOutOfBoundsException(p0.m(i7, i10, "index: ", ", size: "));
        }
        if (i7 == g.b(this)) {
            return removeLast();
        }
        if (i7 == 0) {
            return removeFirst();
        }
        n();
        int m10 = m(this.a + i7);
        Object[] objArr = this.b;
        Object obj = objArr[m10];
        if (i7 < (this.c >> 1)) {
            int i11 = this.a;
            if (m10 >= i11) {
                e.c(i11 + 1, i11, m10, objArr, objArr);
            } else {
                e.c(1, 0, m10, objArr, objArr);
                Object[] objArr2 = this.b;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i12 = this.a;
                e.c(i12 + 1, i12, objArr2.length - 1, objArr2, objArr2);
            }
            Object[] objArr3 = this.b;
            int i13 = this.a;
            objArr3[i13] = null;
            this.a = j(i13);
        } else {
            int m11 = m(g.b(this) + this.a);
            if (m10 <= m11) {
                Object[] objArr4 = this.b;
                e.c(m10, m10 + 1, m11 + 1, objArr4, objArr4);
            } else {
                Object[] objArr5 = this.b;
                e.c(m10, m10 + 1, objArr5.length, objArr5, objArr5);
                Object[] objArr6 = this.b;
                objArr6[objArr6.length - 1] = objArr6[0];
                e.c(0, 1, m11 + 1, objArr6, objArr6);
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
        boolean z9 = false;
        z9 = false;
        z9 = false;
        if (!isEmpty() && this.b.length != 0) {
            int m11 = m(this.a + this.c);
            int i7 = this.a;
            if (i7 < m11) {
                m10 = i7;
                while (i7 < m11) {
                    Object obj = this.b[i7];
                    if (elements.contains(obj)) {
                        z9 = true;
                    } else {
                        this.b[m10] = obj;
                        m10++;
                    }
                    i7++;
                }
                e.e(m10, m11, this.b);
            } else {
                int length = this.b.length;
                boolean z10 = false;
                int i10 = i7;
                while (i7 < length) {
                    Object[] objArr = this.b;
                    Object obj2 = objArr[i7];
                    objArr[i7] = null;
                    if (elements.contains(obj2)) {
                        z10 = true;
                    } else {
                        this.b[i10] = obj2;
                        i10++;
                    }
                    i7++;
                }
                m10 = m(i10);
                for (int i11 = 0; i11 < m11; i11++) {
                    Object[] objArr2 = this.b;
                    Object obj3 = objArr2[i11];
                    objArr2[i11] = null;
                    if (elements.contains(obj3)) {
                        z10 = true;
                    } else {
                        this.b[m10] = obj3;
                        m10 = j(m10);
                    }
                }
                z9 = z10;
            }
            if (z9) {
                n();
                this.c = k(m10 - this.a);
            }
        }
        return z9;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        n();
        Object[] objArr = this.b;
        int i7 = this.a;
        Object obj = objArr[i7];
        objArr[i7] = null;
        this.a = j(i7);
        this.c--;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        n();
        int m10 = m(g.b(this) + this.a);
        Object[] objArr = this.b;
        Object obj = objArr[m10];
        objArr[m10] = null;
        this.c--;
        return obj;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i7, int i10) {
        b0.a(i7, i10, this.c);
        int i11 = i10 - i7;
        if (i11 == 0) {
            return;
        }
        if (i11 == this.c) {
            clear();
            return;
        }
        if (i11 == 1) {
            remove(i7);
            return;
        }
        n();
        if (i7 < this.c - i10) {
            int m10 = m((i7 - 1) + this.a);
            int m11 = m((i10 - 1) + this.a);
            while (i7 > 0) {
                int i12 = m10 + 1;
                int min = Math.min(i7, Math.min(i12, m11 + 1));
                Object[] objArr = this.b;
                int i13 = m11 - min;
                int i14 = m10 - min;
                e.c(i13 + 1, i14 + 1, i12, objArr, objArr);
                m10 = k(i14);
                m11 = k(i13);
                i7 -= min;
            }
            int m12 = m(this.a + i11);
            l(this.a, m12);
            this.a = m12;
        } else {
            int m13 = m(this.a + i10);
            int m14 = m(this.a + i7);
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
                e.c(m14, m13, i16, objArr3, objArr3);
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
        boolean z9 = false;
        z9 = false;
        z9 = false;
        if (!isEmpty() && this.b.length != 0) {
            int m11 = m(this.a + this.c);
            int i7 = this.a;
            if (i7 < m11) {
                m10 = i7;
                while (i7 < m11) {
                    Object obj = this.b[i7];
                    if (elements.contains(obj)) {
                        this.b[m10] = obj;
                        m10++;
                    } else {
                        z9 = true;
                    }
                    i7++;
                }
                e.e(m10, m11, this.b);
            } else {
                int length = this.b.length;
                boolean z10 = false;
                int i10 = i7;
                while (i7 < length) {
                    Object[] objArr = this.b;
                    Object obj2 = objArr[i7];
                    objArr[i7] = null;
                    if (elements.contains(obj2)) {
                        this.b[i10] = obj2;
                        i10++;
                    } else {
                        z10 = true;
                    }
                    i7++;
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
                        z10 = true;
                    }
                }
                z9 = z10;
            }
            if (z9) {
                n();
                this.c = k(m10 - this.a);
            }
        }
        return z9;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i7, Object obj) {
        int i10 = this.c;
        if (i7 < 0 || i7 >= i10) {
            throw new IndexOutOfBoundsException(p0.m(i7, i10, "index: ", ", size: "));
        }
        int m10 = m(this.a + i7);
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
        int i7 = this.c;
        if (length < i7) {
            Object newInstance = Array.newInstance(array.getClass().getComponentType(), i7);
            kotlin.jvm.internal.j.c(newInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            array = (Object[]) newInstance;
        }
        int m10 = m(this.a + this.c);
        int i10 = this.a;
        if (i10 < m10) {
            e.d(i10, m10, 2, this.b, array);
        } else if (!isEmpty()) {
            Object[] objArr = this.b;
            e.c(0, this.a, objArr.length, objArr, array);
            Object[] objArr2 = this.b;
            e.c(objArr2.length - this.a, 0, m10, objArr2, array);
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
        f(m(this.a + this.c), elements);
        return true;
    }
}
