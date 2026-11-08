package l9;

import a8.ia;
import c8.e1;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class b extends AbstractList implements RandomAccess, Serializable {
    public final int[] a;
    public final int b;
    public final int c;

    public b(int i7, int i10, int[] iArr) {
        this.a = iArr;
        this.b = i7;
        this.c = i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return (obj instanceof Integer) && e1.d(((Integer) obj).intValue(), this.b, this.c, this.a) != -1;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return super.equals(obj);
        }
        b bVar = (b) obj;
        int size = size();
        if (bVar.size() != size) {
            return false;
        }
        for (int i7 = 0; i7 < size; i7++) {
            if (this.a[this.b + i7] != bVar.a[bVar.b + i7]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i7) {
        ia.j(i7, size());
        return Integer.valueOf(this.a[this.b + i7]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i7 = 1;
        for (int i10 = this.b; i10 < this.c; i10++) {
            i7 = (i7 * 31) + this.a[i10];
        }
        return i7;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i7 = this.c;
        int i10 = this.b;
        int d = e1.d(intValue, i10, i7, this.a);
        if (d >= 0) {
            return d - i10;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int i7;
        if (obj instanceof Integer) {
            int intValue = ((Integer) obj).intValue();
            int i10 = this.c;
            while (true) {
                i10--;
                i7 = this.b;
                if (i10 < i7) {
                    i10 = -1;
                    break;
                }
                if (this.a[i10] == intValue) {
                    break;
                }
            }
            if (i10 >= 0) {
                return i10 - i7;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i7, Object obj) {
        Integer num = (Integer) obj;
        ia.j(i7, size());
        int i10 = this.b + i7;
        int[] iArr = this.a;
        int i11 = iArr[i10];
        num.getClass();
        iArr[i10] = num.intValue();
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c - this.b;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i7, int i10) {
        ia.n(i7, i10, size());
        if (i7 == i10) {
            return Collections.EMPTY_LIST;
        }
        int i11 = this.b;
        return new b(i7 + i11, i11 + i10, this.a);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        StringBuilder sb2 = new StringBuilder(size() * 5);
        sb2.append('[');
        int[] iArr = this.a;
        int i7 = this.b;
        sb2.append(iArr[i7]);
        while (true) {
            i7++;
            if (i7 >= this.c) {
                sb2.append(']');
                return sb2.toString();
            }
            sb2.append(", ");
            sb2.append(iArr[i7]);
        }
    }
}
