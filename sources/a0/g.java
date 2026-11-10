package a0;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class g implements Collection, Set {
    public int[] a = b0.a.a;
    public Object[] b = b0.a.c;
    public int c;

    public g(int i7) {
        if (i7 > 0) {
            i.a(this, i7);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i7;
        int b10;
        int i10 = this.c;
        if (obj == null) {
            b10 = i.b(this, null, 0);
            i7 = 0;
        } else {
            int hashCode = obj.hashCode();
            i7 = hashCode;
            b10 = i.b(this, obj, hashCode);
        }
        if (b10 >= 0) {
            return false;
        }
        int i11 = ~b10;
        int[] iArr = this.a;
        if (i10 >= iArr.length) {
            int i12 = 8;
            if (i10 >= 8) {
                i12 = (i10 >> 1) + i10;
            } else if (i10 < 4) {
                i12 = 4;
            }
            Object[] objArr = this.b;
            int[] iArr2 = new int[i12];
            this.a = iArr2;
            this.b = new Object[i12];
            if (i10 != this.c) {
                throw new ConcurrentModificationException();
            }
            if (iArr2.length != 0) {
                hd.e.b(0, 0, iArr.length, iArr, iArr2);
                hd.e.d(0, objArr.length, 6, objArr, this.b);
            }
        }
        if (i11 < i10) {
            int[] iArr3 = this.a;
            int i13 = i11 + 1;
            hd.e.b(i13, i11, i10, iArr3, iArr3);
            Object[] objArr2 = this.b;
            hd.e.c(i13, i11, i10, objArr2, objArr2);
        }
        int i14 = this.c;
        if (i10 == i14) {
            int[] iArr4 = this.a;
            if (i11 < iArr4.length) {
                iArr4[i11] = i7;
                this.b[i11] = obj;
                this.c = i14 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection elements) {
        kotlin.jvm.internal.j.e(elements, "elements");
        int size = elements.size() + this.c;
        int i7 = this.c;
        int[] iArr = this.a;
        boolean z9 = false;
        if (iArr.length < size) {
            Object[] objArr = this.b;
            int[] iArr2 = new int[size];
            this.a = iArr2;
            this.b = new Object[size];
            if (i7 > 0) {
                hd.e.b(0, 0, i7, iArr, iArr2);
                hd.e.d(0, this.c, 6, objArr, this.b);
            }
        }
        if (this.c != i7) {
            throw new ConcurrentModificationException();
        }
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            z9 |= add(it.next());
        }
        return z9;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        if (this.c != 0) {
            this.a = b0.a.a;
            this.b = b0.a.c;
            this.c = 0;
        }
        if (this.c != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return (obj == null ? i.b(this, null, 0) : i.b(this, obj, obj.hashCode())) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection elements) {
        kotlin.jvm.internal.j.e(elements, "elements");
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set) || this.c != ((Set) obj).size()) {
            return false;
        }
        try {
            int i7 = this.c;
            for (int i10 = 0; i10 < i7; i10++) {
                if (!((Set) obj).contains(this.b[i10])) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public final void f(int i7) {
        int i10 = this.c;
        Object[] objArr = this.b;
        Object obj = objArr[i7];
        if (i10 <= 1) {
            clear();
            return;
        }
        int i11 = i10 - 1;
        int[] iArr = this.a;
        if (iArr.length <= 8 || i10 >= iArr.length / 3) {
            if (i7 < i11) {
                int i12 = i7 + 1;
                hd.e.b(i7, i12, i10, iArr, iArr);
                Object[] objArr2 = this.b;
                hd.e.c(i7, i12, i10, objArr2, objArr2);
            }
            this.b[i11] = null;
        } else {
            int i13 = i10 > 8 ? i10 + (i10 >> 1) : 8;
            int[] iArr2 = new int[i13];
            this.a = iArr2;
            this.b = new Object[i13];
            if (i7 > 0) {
                hd.e.b(0, 0, i7, iArr, iArr2);
                hd.e.d(0, i7, 6, objArr, this.b);
            }
            if (i7 < i11) {
                int i14 = i7 + 1;
                hd.e.b(i7, i14, i10, iArr, this.a);
                hd.e.c(i7, i14, i10, objArr, this.b);
            }
        }
        if (i10 != this.c) {
            throw new ConcurrentModificationException();
        }
        this.c = i11;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.a;
        int i7 = this.c;
        int i10 = 0;
        for (int i11 = 0; i11 < i7; i11++) {
            i10 += iArr[i11];
        }
        return i10;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.c <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new b(this);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int b10 = obj == null ? i.b(this, null, 0) : i.b(this, obj, obj.hashCode());
        if (b10 < 0) {
            return false;
        }
        f(b10);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection elements) {
        kotlin.jvm.internal.j.e(elements, "elements");
        Iterator it = elements.iterator();
        boolean z9 = false;
        while (it.hasNext()) {
            z9 |= remove(it.next());
        }
        return z9;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection elements) {
        boolean z9;
        kotlin.jvm.internal.j.e(elements, "elements");
        int i7 = this.c - 1;
        boolean z10 = false;
        while (true) {
            int i10 = -1;
            if (-1 >= i7) {
                return z10;
            }
            Object obj = this.b[i7];
            Collection collection = elements;
            if (collection instanceof Collection) {
                z9 = collection.contains(obj);
            } else {
                if (!(collection instanceof List)) {
                    Iterator it = collection.iterator();
                    int i11 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        if (i11 < 0) {
                            throw new ArithmeticException("Index overflow has happened.");
                        }
                        if (kotlin.jvm.internal.j.a(obj, next)) {
                            i10 = i11;
                            break;
                        }
                        i11++;
                    }
                } else {
                    i10 = ((List) collection).indexOf(obj);
                }
                z9 = i10 >= 0;
            }
            if (!z9) {
                f(i7);
                z10 = true;
            }
            i7--;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.c;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        Object[] objArr = this.b;
        int i7 = this.c;
        kotlin.jvm.internal.j.e(objArr, "<this>");
        int length = objArr.length;
        if (i7 <= length) {
            Object[] copyOfRange = Arrays.copyOfRange(objArr, 0, i7);
            kotlin.jvm.internal.j.d(copyOfRange, "copyOfRange(...)");
            return copyOfRange;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i7 + ") is greater than size (" + length + ").");
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.c * 14);
        sb2.append('{');
        int i7 = this.c;
        for (int i10 = 0; i10 < i7; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            Object obj = this.b[i10];
            if (obj != this) {
                sb2.append(obj);
            } else {
                sb2.append("(this Set)");
            }
        }
        sb2.append('}');
        String sb3 = sb2.toString();
        kotlin.jvm.internal.j.d(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] array) {
        kotlin.jvm.internal.j.e(array, "array");
        int i7 = this.c;
        if (array.length < i7) {
            array = (Object[]) Array.newInstance(array.getClass().getComponentType(), i7);
        } else if (array.length > i7) {
            array[i7] = null;
        }
        hd.e.c(0, 0, this.c, this.b, array);
        return array;
    }
}
