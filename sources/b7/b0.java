package b7;

import java.util.Iterator;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class b0 extends q {
    public static final Object[] r;
    public static final b0 s;
    public final transient Object[] d;
    public final transient int e;
    public final transient Object[] f;
    public final transient int h;
    public final transient int n;

    static {
        Object[] objArr = new Object[0];
        r = objArr;
        s = new b0(0, 0, 0, objArr, objArr);
    }

    public b0(int i10, int i11, int i12, Object[] objArr, Object[] objArr2) {
        this.d = objArr;
        this.e = i10;
        this.f = objArr2;
        this.h = i11;
        this.n = i12;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        Object[] objArr = this.f;
        if (objArr.length == 0) {
            return false;
        }
        int rotateLeft = (int) (Integer.rotateLeft((int) (obj.hashCode() * (-862048943)), 15) * 461845907);
        while (true) {
            int i10 = this.h & rotateLeft;
            Object obj2 = objArr[i10];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            rotateLeft = i10 + 1;
        }
    }

    @Override // b7.q, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.e;
    }

    @Override // b7.j
    public final int i(Object[] objArr) {
        Object[] objArr2 = this.d;
        int i10 = this.n;
        System.arraycopy(objArr2, 0, objArr, 0, i10);
        return i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return t().listIterator(0);
    }

    @Override // b7.j
    public final int n() {
        return this.n;
    }

    @Override // b7.j
    public final int o() {
        return 0;
    }

    @Override // b7.j
    public final g0 p() {
        return t().listIterator(0);
    }

    @Override // b7.j
    public final Object[] q() {
        return this.d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.n;
    }

    @Override // b7.q
    public final o u() {
        return o.t(this.n, this.d);
    }
}
