package g9;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
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

    public z1(int i3, int i10, int i11, Object[] objArr, Object[] objArr2) {
        this.d = objArr;
        this.e = i3;
        this.f = objArr2;
        this.h = i10;
        this.n = i11;
    }

    @Override // g9.d0, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f;
            if (objArr.length != 0) {
                int v = o.v(obj);
                while (true) {
                    int i3 = v & this.h;
                    Object obj2 = objArr[i3];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    v = i3 + 1;
                }
            }
        }
        return false;
    }

    @Override // g9.t0, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.e;
    }

    @Override // g9.d0
    public final int i(int i3, Object[] objArr) {
        Object[] objArr2 = this.d;
        int i10 = this.n;
        System.arraycopy(objArr2, 0, objArr, i3, i10);
        return i3 + i10;
    }

    @Override // g9.d0
    public final Object[] j() {
        return this.d;
    }

    @Override // g9.d0
    public final int k() {
        return this.n;
    }

    @Override // g9.d0
    public final int l() {
        return 0;
    }

    @Override // g9.d0
    public final boolean m() {
        return false;
    }

    @Override // g9.d0
    /* renamed from: n */
    public final g2 iterator() {
        return h().listIterator(0);
    }

    @Override // g9.t0
    public final i0 r() {
        return i0.o(this.n, this.d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.n;
    }
}
