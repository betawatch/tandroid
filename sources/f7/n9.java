package f7;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class n9 extends l9 {
    public static final n9 e = new n9(0, new Object[0]);
    public final transient Object[] c;
    public final transient int d;

    public n9(int i9, Object[] objArr) {
        this.c = objArr;
        this.d = i9;
    }

    @Override // java.util.List
    public final Object get(int i9) {
        a7.a(i9, this.d);
        Object obj = this.c[i9];
        obj.getClass();
        return obj;
    }

    @Override // f7.l9, f7.i9
    public final int i(Object[] objArr) {
        Object[] objArr2 = this.c;
        int i9 = this.d;
        System.arraycopy(objArr2, 0, objArr, 0, i9);
        return i9;
    }

    @Override // f7.i9
    public final int n() {
        return this.d;
    }

    @Override // f7.i9
    public final int o() {
        return 0;
    }

    @Override // f7.i9
    public final Object[] p() {
        return this.c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
