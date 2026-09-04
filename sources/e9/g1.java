package e9;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class g1 extends m0 {
    public static final Object[] r;
    public static final g1 s;
    public final transient Object[] d;
    public final transient int e;
    public final transient Object[] f;
    public final transient int h;
    public final transient int n;

    static {
        Object[] objArr = new Object[0];
        r = objArr;
        s = new g1(0, 0, 0, objArr, objArr);
    }

    public g1(int i10, int i11, int i12, Object[] objArr, Object[] objArr2) {
        this.d = objArr;
        this.e = i10;
        this.f = objArr2;
        this.h = i11;
        this.n = i12;
    }

    @Override // e9.d0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f;
            if (objArr.length != 0) {
                int t10 = q.t(obj);
                while (true) {
                    int i10 = t10 & this.h;
                    Object obj2 = objArr[i10];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    t10 = i10 + 1;
                }
            }
        }
        return false;
    }

    @Override // e9.m0, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.e;
    }

    @Override // e9.d0
    public final int n(int i10, Object[] objArr) {
        Object[] objArr2 = this.d;
        int i11 = this.n;
        System.arraycopy(objArr2, 0, objArr, i10, i11);
        return i10 + i11;
    }

    @Override // e9.d0
    public final Object[] o() {
        return this.d;
    }

    @Override // e9.d0
    public final int p() {
        return this.n;
    }

    @Override // e9.d0
    public final int q() {
        return 0;
    }

    @Override // e9.d0
    public final boolean r() {
        return false;
    }

    @Override // e9.d0
    /* renamed from: s */
    public final o1 iterator() {
        return i().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.n;
    }

    @Override // e9.m0
    public final i0 w() {
        return i0.t(this.n, this.d);
    }
}
