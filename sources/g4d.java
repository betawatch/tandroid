// default package

import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class g4d extends b4d implements Set, j$.util.Set {
    public static final Object[] w;
    public static final g4d x;
    public transient f4d n;
    public final transient Object[] r;
    public final transient Object[] s;

    static {
        Object[] objArr = new Object[0];
        w = objArr;
        x = new g4d(objArr, objArr);
    }

    public g4d(Object[] objArr, Object[] objArr2) {
        super((byte) 0);
        this.r = objArr;
        this.s = objArr2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        int length = this.s.length;
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (set.size() == 0) {
                    return containsAll(set);
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // b4d
    public final int h(Object[] objArr) {
        System.arraycopy(this.r, 0, objArr, 0, 0);
        return 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return 0;
    }

    @Override // b4d
    public final int i() {
        return 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        f4d f4dVar = this.n;
        if (f4dVar == null) {
            c4d c4dVar = e4d.n;
            f4dVar = f4d.s;
            this.n = f4dVar;
        }
        return f4dVar.listIterator(0);
    }

    @Override // b4d
    public final int j() {
        return 0;
    }

    @Override // b4d
    public final Object[] k() {
        return this.r;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 0;
    }
}
