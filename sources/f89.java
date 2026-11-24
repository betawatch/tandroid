// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class f89 extends yo5 {
    public static final Object[] r;
    public static final f89 s;
    public final transient Object[] d;
    public final transient int e;
    public final transient Object[] f;
    public final transient int h;
    public final transient int n;

    static {
        Object[] objArr = new Object[0];
        r = objArr;
        s = new f89(0, 0, 0, objArr, objArr);
    }

    public f89(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        this.d = objArr;
        this.e = i;
        this.f = objArr2;
        this.h = i2;
        this.n = i3;
    }

    @Override // go5, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f;
            if (objArr.length != 0) {
                int b = dle.b(obj);
                while (true) {
                    int i = b & this.h;
                    Object obj2 = objArr[i];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    b = i + 1;
                }
            }
        }
        return false;
    }

    @Override // yo5, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.e;
    }

    @Override // go5
    public final int i(int i, Object[] objArr) {
        Object[] objArr2 = this.d;
        int i2 = this.n;
        System.arraycopy(objArr2, 0, objArr, i, i2);
        return i + i2;
    }

    @Override // go5
    public final Object[] j() {
        return this.d;
    }

    @Override // go5
    public final int k() {
        return this.n;
    }

    @Override // go5
    public final int l() {
        return 0;
    }

    @Override // go5
    public final boolean m() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: n */
    public final v7c iterator() {
        return h().listIterator(0);
    }

    @Override // yo5
    public final mo5 r() {
        return mo5.o(this.n, this.d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.n;
    }
}
