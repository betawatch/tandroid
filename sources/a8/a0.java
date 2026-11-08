package a8;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class a0 extends u {
    public static final a0 e = new a0(0, new Object[0]);
    public final transient Object[] c;
    public final transient int d;

    public a0(int i7, Object[] objArr) {
        this.c = objArr;
        this.d = i7;
    }

    @Override // a8.u, a8.p
    public final int f(Object[] objArr) {
        Object[] objArr2 = this.c;
        int i7 = this.d;
        System.arraycopy(objArr2, 0, objArr, 0, i7);
        return i7;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        x0.a(i7, this.d);
        Object obj = this.c[i7];
        obj.getClass();
        return obj;
    }

    @Override // a8.p
    public final int i() {
        return this.d;
    }

    @Override // a8.p
    public final int j() {
        return 0;
    }

    @Override // a8.p
    public final Object[] k() {
        return this.c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
