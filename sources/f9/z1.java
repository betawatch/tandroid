package f9;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class z1 extends t0 {
    public static final Object[] r;
    public static final z1 s;
    public final transient Object[] d;
    public final transient int e;
    public final transient Object[] f;
    public final transient int h;
    public final transient int n;

    static {
        Object[] objArr = new Object[0];
        r = objArr;
        s = new z1(0, 0, 0, objArr, objArr);
    }

    public z1(int i10, int i11, int i12, Object[] objArr, Object[] objArr2) {
        this.d = objArr;
        this.e = i10;
        this.f = objArr2;
        this.h = i11;
        this.n = i12;
    }

    @Override // f9.d0, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f;
            if (objArr.length != 0) {
                int u10 = o.u(obj);
                while (true) {
                    int i10 = u10 & this.h;
                    Object obj2 = objArr[i10];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    u10 = i10 + 1;
                }
            }
        }
        return false;
    }

    @Override // f9.t0, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.e;
    }

    @Override // f9.d0
    public final int m(int i10, Object[] objArr) {
        Object[] objArr2 = this.d;
        int i11 = this.n;
        System.arraycopy(objArr2, 0, objArr, i10, i11);
        return i10 + i11;
    }

    @Override // f9.d0
    public final Object[] n() {
        return this.d;
    }

    @Override // f9.d0
    public final int o() {
        return this.n;
    }

    @Override // f9.d0
    public final int p() {
        return 0;
    }

    @Override // f9.d0
    public final boolean q() {
        return false;
    }

    @Override // f9.d0
    /* renamed from: r */
    public final g2 iterator() {
        return h().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.n;
    }

    @Override // f9.t0
    public final i0 v() {
        return i0.s(this.n, this.d);
    }
}
