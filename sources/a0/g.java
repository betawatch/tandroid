package a0;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class g implements Collection, Set {
    public int[] a = b0.a.a;
    public Object[] b = b0.a.c;
    public int c;

    public g(int i9) {
        if (i9 > 0) {
            i.a(this, i9);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i9;
        int b10;
        int i10 = this.c;
        if (obj == null) {
            b10 = i.b(this, null, 0);
            i9 = 0;
        } else {
            int hashCode = obj.hashCode();
            i9 = hashCode;
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
                pc.f.b(0, 0, iArr.length, iArr, iArr2);
                pc.f.d(0, objArr.length, 6, objArr, this.b);
            }
        }
        if (i11 < i10) {
            int[] iArr3 = this.a;
            int i13 = i11 + 1;
            pc.f.b(i13, i11, i10, iArr3, iArr3);
            Object[] objArr2 = this.b;
            pc.f.c(i13, i11, i10, objArr2, objArr2);
        }
        int i14 = this.c;
        if (i10 == i14) {
            int[] iArr4 = this.a;
            if (i11 < iArr4.length) {
                iArr4[i11] = i9;
                this.b[i11] = obj;
                this.c = i14 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection elements) {
        kotlin.jvm.internal.i.e(elements, "elements");
        int size = elements.size() + this.c;
        int i9 = this.c;
        int[] iArr = this.a;
        boolean z10 = false;
        if (iArr.length < size) {
            Object[] objArr = this.b;
            int[] iArr2 = new int[size];
            this.a = iArr2;
            this.b = new Object[size];
            if (i9 > 0) {
                pc.f.b(0, 0, i9, iArr, iArr2);
                pc.f.d(0, this.c, 6, objArr, this.b);
            }
        }
        if (this.c != i9) {
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
        return (obj == null ? i.b(this, null, 0) : i.b(this, obj, obj.hashCode())) >= 0;
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
            int i9 = this.c;
            for (int i10 = 0; i10 < i9; i10++) {
                if (!((Set) obj).contains(this.b[i10])) {
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
        int i9 = this.c;
        int i10 = 0;
        for (int i11 = 0; i11 < i9; i11++) {
            i10 += iArr[i11];
        }
        return i10;
    }

    public final void i(int i9) {
        int i10 = this.c;
        Object[] objArr = this.b;
        Object obj = objArr[i9];
        if (i10 <= 1) {
            clear();
            return;
        }
        int i11 = i10 - 1;
        int[] iArr = this.a;
        if (iArr.length <= 8 || i10 >= iArr.length / 3) {
            if (i9 < i11) {
                int i12 = i9 + 1;
                pc.f.b(i9, i12, i10, iArr, iArr);
                Object[] objArr2 = this.b;
                pc.f.c(i9, i12, i10, objArr2, objArr2);
            }
            this.b[i11] = null;
        } else {
            int i13 = i10 > 8 ? i10 + (i10 >> 1) : 8;
            int[] iArr2 = new int[i13];
            this.a = iArr2;
            this.b = new Object[i13];
            if (i9 > 0) {
                pc.f.b(0, 0, i9, iArr, iArr2);
                pc.f.d(0, i9, 6, objArr, this.b);
            }
            if (i9 < i11) {
                int i14 = i9 + 1;
                pc.f.b(i9, i14, i10, iArr, this.a);
                pc.f.c(i9, i14, i10, objArr, this.b);
            }
        }
        if (i10 != this.c) {
            throw new ConcurrentModificationException();
        }
        this.c = i11;
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
        int i9 = this.c - 1;
        boolean z11 = false;
        while (true) {
            int i10 = -1;
            if (-1 >= i9) {
                return z11;
            }
            Object obj = this.b[i9];
            Collection collection = elements;
            if (collection instanceof Collection) {
                z10 = collection.contains(obj);
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
                        if (kotlin.jvm.internal.i.a(obj, next)) {
                            i10 = i11;
                            break;
                        }
                        i11++;
                    }
                } else {
                    i10 = ((List) collection).indexOf(obj);
                }
                z10 = i10 >= 0;
            }
            if (!z10) {
                i(i9);
                z11 = true;
            }
            i9--;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.c;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        Object[] objArr = this.b;
        int i9 = this.c;
        kotlin.jvm.internal.i.e(objArr, "<this>");
        int length = objArr.length;
        if (i9 <= length) {
            Object[] copyOfRange = Arrays.copyOfRange(objArr, 0, i9);
            kotlin.jvm.internal.i.d(copyOfRange, "copyOfRange(...)");
            return copyOfRange;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i9 + ") is greater than size (" + length + ").");
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.c * 14);
        sb2.append('{');
        int i9 = this.c;
        for (int i10 = 0; i10 < i9; i10++) {
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
        kotlin.jvm.internal.i.d(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] array) {
        kotlin.jvm.internal.i.e(array, "array");
        int i9 = this.c;
        if (array.length < i9) {
            array = (Object[]) Array.newInstance(array.getClass().getComponentType(), i9);
        } else if (array.length > i9) {
            array[i9] = null;
        }
        pc.f.c(0, 0, this.c, this.b, array);
        return array;
    }
}
