package k9;

import b8.od;
import b8.zb;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class b extends AbstractList implements RandomAccess, Serializable {
    public final int[] a;
    public final int b;
    public final int c;

    public b(int i3, int i10, int[] iArr) {
        this.a = iArr;
        this.b = i3;
        this.c = i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return (obj instanceof Integer) && od.d(((Integer) obj).intValue(), this.b, this.c, this.a) != -1;
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
        for (int i3 = 0; i3 < size; i3++) {
            if (this.a[this.b + i3] != bVar.a[bVar.b + i3]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i3) {
        zb.j(i3, size());
        return Integer.valueOf(this.a[this.b + i3]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i3 = 1;
        for (int i10 = this.b; i10 < this.c; i10++) {
            i3 = (i3 * 31) + this.a[i10];
        }
        return i3;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i3 = this.c;
        int i10 = this.b;
        int d = od.d(intValue, i10, i3, this.a);
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
        int i3;
        if (obj instanceof Integer) {
            int intValue = ((Integer) obj).intValue();
            int i10 = this.c;
            while (true) {
                i10--;
                i3 = this.b;
                if (i10 < i3) {
                    i10 = -1;
                    break;
                }
                if (this.a[i10] == intValue) {
                    break;
                }
            }
            if (i10 >= 0) {
                return i10 - i3;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i3, Object obj) {
        Integer num = (Integer) obj;
        zb.j(i3, size());
        int i10 = this.b + i3;
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
    public final List subList(int i3, int i10) {
        zb.n(i3, i10, size());
        if (i3 == i10) {
            return Collections.EMPTY_LIST;
        }
        int i11 = this.b;
        return new b(i3 + i11, i11 + i10, this.a);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        StringBuilder sb2 = new StringBuilder(size() * 5);
        sb2.append('[');
        int[] iArr = this.a;
        int i3 = this.b;
        sb2.append(iArr[i3]);
        while (true) {
            i3++;
            if (i3 >= this.c) {
                sb2.append(']');
                return sb2.toString();
            }
            sb2.append(", ");
            sb2.append(iArr[i3]);
        }
    }
}
