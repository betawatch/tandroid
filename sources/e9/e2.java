package e9;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes.dex */
public final class e2 extends y0 {
    public static final Object[] r;
    public static final e2 s;
    public final transient Object[] d;
    public final transient int e;
    public final transient Object[] f;
    public final transient int h;
    public final transient int n;

    static {
        Object[] objArr = new Object[0];
        r = objArr;
        s = new e2(0, 0, 0, objArr, objArr);
    }

    public e2(int i10, int i11, int i12, Object[] objArr, Object[] objArr2) {
        this.d = objArr;
        this.e = i10;
        this.f = objArr2;
        this.h = i11;
        this.n = i12;
    }

    @Override // e9.i0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f;
            if (objArr.length != 0) {
                int u10 = s.u(obj);
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

    @Override // e9.y0, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.e;
    }

    @Override // e9.i0
    public final int m(int i10, Object[] objArr) {
        Object[] objArr2 = this.d;
        int i11 = this.n;
        System.arraycopy(objArr2, 0, objArr, i10, i11);
        return i10 + i11;
    }

    @Override // e9.i0
    public final Object[] n() {
        return this.d;
    }

    @Override // e9.i0
    public final int o() {
        return this.n;
    }

    @Override // e9.i0
    public final int p() {
        return 0;
    }

    @Override // e9.i0
    public final boolean q() {
        return false;
    }

    @Override // e9.i0
    /* renamed from: r */
    public final m2 iterator() {
        return h().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.n;
    }

    @Override // e9.y0
    public final n0 v() {
        return n0.s(this.n, this.d);
    }
}
