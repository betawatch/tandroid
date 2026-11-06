package h9;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class a2 extends t0 {
    public static final Object[] r;
    public static final a2 s;
    public final transient Object[] d;
    public final transient int e;
    public final transient Object[] f;
    public final transient int h;
    public final transient int n;

    static {
        Object[] objArr = new Object[0];
        r = objArr;
        s = new a2(0, 0, 0, objArr, objArr);
    }

    public a2(int i7, int i10, int i11, Object[] objArr, Object[] objArr2) {
        this.d = objArr;
        this.e = i7;
        this.f = objArr2;
        this.h = i10;
        this.n = i11;
    }

    @Override // h9.d0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f;
            if (objArr.length != 0) {
                int v = o.v(obj);
                while (true) {
                    int i7 = v & this.h;
                    Object obj2 = objArr[i7];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    v = i7 + 1;
                }
            }
        }
        return false;
    }

    @Override // h9.t0, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.e;
    }

    @Override // h9.d0
    public final int i(int i7, Object[] objArr) {
        Object[] objArr2 = this.d;
        int i10 = this.n;
        System.arraycopy(objArr2, 0, objArr, i7, i10);
        return i7 + i10;
    }

    @Override // h9.d0
    public final Object[] j() {
        return this.d;
    }

    @Override // h9.d0
    public final int k() {
        return this.n;
    }

    @Override // h9.d0
    public final int l() {
        return 0;
    }

    @Override // h9.d0
    public final boolean m() {
        return false;
    }

    @Override // h9.d0
    /* renamed from: n */
    public final h2 iterator() {
        return f().listIterator(0);
    }

    @Override // h9.t0
    public final i0 r() {
        return i0.o(this.n, this.d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.n;
    }
}
