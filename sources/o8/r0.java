package o8;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class r0 extends c0 {
    public static final Object[] r;
    public static final r0 s;
    public final transient Object[] d;
    public final transient int e;
    public final transient Object[] f;
    public final transient int h;
    public final transient int n;

    static {
        Object[] objArr = new Object[0];
        r = objArr;
        s = new r0(0, 0, 0, objArr, objArr);
    }

    public r0(int i9, int i10, int i11, Object[] objArr, Object[] objArr2) {
        this.d = objArr;
        this.e = i9;
        this.f = objArr2;
        this.h = i10;
        this.n = i11;
    }

    @Override // o8.u, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f;
            if (objArr.length != 0) {
                int p6 = l.p(obj);
                while (true) {
                    int i9 = p6 & this.h;
                    Object obj2 = objArr[i9];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    p6 = i9 + 1;
                }
            }
        }
        return false;
    }

    @Override // o8.c0, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.e;
    }

    @Override // o8.u
    public final int n(int i9, Object[] objArr) {
        Object[] objArr2 = this.d;
        int i10 = this.n;
        System.arraycopy(objArr2, 0, objArr, i9, i10);
        return i9 + i10;
    }

    @Override // o8.u
    public final Object[] o() {
        return this.d;
    }

    @Override // o8.u
    public final int p() {
        return this.n;
    }

    @Override // o8.u
    public final int q() {
        return 0;
    }

    @Override // o8.u
    public final boolean r() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.n;
    }

    @Override // o8.c0
    public final z v() {
        return z.s(this.n, this.d);
    }

    @Override // o8.c0
    /* renamed from: w */
    public final x0 iterator() {
        return i().listIterator(0);
    }
}
