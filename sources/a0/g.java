package a0;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class g implements Collection, Set {
    public int[] a = b0.a.a;
    public Object[] b = b0.a.c;
    public int c;

    public g(int i10) {
        if (i10 > 0) {
            j.a(this, i10);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i10;
        int b10;
        int i11 = this.c;
        if (obj == null) {
            b10 = j.b(this, null, 0);
            i10 = 0;
        } else {
            int hashCode = obj.hashCode();
            i10 = hashCode;
            b10 = j.b(this, obj, hashCode);
        }
        if (b10 >= 0) {
            return false;
        }
        int i12 = ~b10;
        int[] iArr = this.a;
        if (i11 >= iArr.length) {
            int i13 = 8;
            if (i11 >= 8) {
                i13 = (i11 >> 1) + i11;
            } else if (i11 < 4) {
                i13 = 4;
            }
            Object[] objArr = this.b;
            int[] iArr2 = new int[i13];
            this.a = iArr2;
            this.b = new Object[i13];
            if (i11 != this.c) {
                throw new ConcurrentModificationException();
            }
            if (iArr2.length != 0) {
                hd.f.b(0, 0, iArr.length, iArr, iArr2);
                hd.f.d(0, objArr.length, 6, objArr, this.b);
            }
        }
        if (i12 < i11) {
            int[] iArr3 = this.a;
            int i14 = i12 + 1;
            hd.f.b(i14, i12, i11, iArr3, iArr3);
            Object[] objArr2 = this.b;
            hd.f.c(i14, i12, i11, objArr2, objArr2);
        }
        int i15 = this.c;
        if (i11 == i15) {
            int[] iArr4 = this.a;
            if (i12 < iArr4.length) {
                iArr4[i12] = i10;
                this.b[i12] = obj;
                this.c = i15 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection elements) {
        kotlin.jvm.internal.i.e(elements, "elements");
        int size = elements.size() + this.c;
        int i10 = this.c;
        int[] iArr = this.a;
        boolean z10 = false;
        if (iArr.length < size) {
            Object[] objArr = this.b;
            int[] iArr2 = new int[size];
            this.a = iArr2;
            this.b = new Object[size];
            if (i10 > 0) {
                hd.f.b(0, 0, i10, iArr, iArr2);
                hd.f.d(0, this.c, 6, objArr, this.b);
            }
        }
        if (this.c != i10) {
            throw new ConcurrentModificationException();
        }
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            z10 |= add(it.next());
        }
        return z10;
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
        return (obj == null ? j.b(this, null, 0) : j.b(this, obj, obj.hashCode())) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection elements) {
        kotlin.jvm.internal.i.e(elements, "elements");
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
            int i10 = this.c;
            for (int i11 = 0; i11 < i10; i11++) {
                if (!((Set) obj).contains(this.b[i11])) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.a;
        int i10 = this.c;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 += iArr[i12];
        }
        return i11;
    }

    public final void i(int i10) {
        int i11 = this.c;
        Object[] objArr = this.b;
        Object obj = objArr[i10];
        if (i11 <= 1) {
            clear();
            return;
        }
        int i12 = i11 - 1;
        int[] iArr = this.a;
        if (iArr.length <= 8 || i11 >= iArr.length / 3) {
            if (i10 < i12) {
                int i13 = i10 + 1;
                hd.f.b(i10, i13, i11, iArr, iArr);
                Object[] objArr2 = this.b;
                hd.f.c(i10, i13, i11, objArr2, objArr2);
            }
            this.b[i12] = null;
        } else {
            int i14 = i11 > 8 ? i11 + (i11 >> 1) : 8;
            int[] iArr2 = new int[i14];
            this.a = iArr2;
            this.b = new Object[i14];
            if (i10 > 0) {
                hd.f.b(0, 0, i10, iArr, iArr2);
                hd.f.d(0, i10, 6, objArr, this.b);
            }
            if (i10 < i12) {
                int i15 = i10 + 1;
                hd.f.b(i10, i15, i11, iArr, this.a);
                hd.f.c(i10, i15, i11, objArr, this.b);
            }
        }
        if (i11 != this.c) {
            throw new ConcurrentModificationException();
        }
        this.c = i12;
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
        int b10 = obj == null ? j.b(this, null, 0) : j.b(this, obj, obj.hashCode());
        if (b10 < 0) {
            return false;
        }
        i(b10);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection elements) {
        kotlin.jvm.internal.i.e(elements, "elements");
        Iterator it = elements.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            z10 |= remove(it.next());
        }
        return z10;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection elements) {
        boolean z10;
        kotlin.jvm.internal.i.e(elements, "elements");
        int i10 = this.c - 1;
        boolean z11 = false;
        while (true) {
            int i11 = -1;
            if (-1 >= i10) {
                return z11;
            }
            Object obj = this.b[i10];
            Collection collection = elements;
            if (collection instanceof Collection) {
                z10 = collection.contains(obj);
            } else {
                if (!(collection instanceof List)) {
                    Iterator it = collection.iterator();
                    int i12 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        if (i12 < 0) {
                            throw new ArithmeticException("Index overflow has happened.");
                        }
                        if (kotlin.jvm.internal.i.a(obj, next)) {
                            i11 = i12;
                            break;
                        }
                        i12++;
                    }
                } else {
                    i11 = ((List) collection).indexOf(obj);
                }
                z10 = i11 >= 0;
            }
            if (!z10) {
                i(i10);
                z11 = true;
            }
            i10--;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.c;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        Object[] objArr = this.b;
        int i10 = this.c;
        kotlin.jvm.internal.i.e(objArr, "<this>");
        int length = objArr.length;
        if (i10 <= length) {
            Object[] copyOfRange = Arrays.copyOfRange(objArr, 0, i10);
            kotlin.jvm.internal.i.d(copyOfRange, "copyOfRange(...)");
            return copyOfRange;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i10 + ") is greater than size (" + length + ").");
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.c * 14);
        sb2.append('{');
        int i10 = this.c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            Object obj = this.b[i11];
            if (obj != this) {
                sb2.append(obj);
            } else {
                sb2.append("(this Set)");
            }
        }
        sb2.append('}');
        String sb3 = sb2.toString();
        kotlin.jvm.internal.i.d(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] array) {
        kotlin.jvm.internal.i.e(array, "array");
        int i10 = this.c;
        if (array.length < i10) {
            array = (Object[]) Array.newInstance(array.getClass().getComponentType(), i10);
        } else if (array.length > i10) {
            array[i10] = null;
        }
        hd.f.c(0, 0, this.c, this.b, array);
        return array;
    }
}
