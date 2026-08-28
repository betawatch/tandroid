package g7;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class xa extends ra {
    public final transient Object[] c;
    public final transient int d;
    public final transient int e = 1;

    public xa(int i9, Object[] objArr) {
        this.c = objArr;
        this.d = i9;
    }

    @Override // java.util.List
    public final Object get(int i9) {
        f7.p7.a(i9, this.e);
        Object obj = this.c[i9 + i9 + this.d];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.e;
    }
}
