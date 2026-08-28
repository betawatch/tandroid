package h7;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class w extends s {
    public static final w e = new w(0, new Object[0]);
    public final transient Object[] c;
    public final transient int d;

    public w(int i9, Object[] objArr) {
        this.c = objArr;
        this.d = i9;
    }

    @Override // java.util.List
    public final Object get(int i9) {
        f7.b8.a(i9, this.d);
        Object obj = this.c[i9];
        obj.getClass();
        return obj;
    }

    @Override // h7.s, h7.o
    public final int i(Object[] objArr) {
        Object[] objArr2 = this.c;
        int i9 = this.d;
        System.arraycopy(objArr2, 0, objArr, 0, i9);
        return i9;
    }

    @Override // h7.o
    public final int n() {
        return this.d;
    }

    @Override // h7.o
    public final int o() {
        return 0;
    }

    @Override // h7.o
    public final Object[] p() {
        return this.c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
