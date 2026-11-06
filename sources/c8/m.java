package c8;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class m extends i {
    public static final m e = new m(0, new Object[0]);
    public final transient Object[] c;
    public final transient int d;

    public m(int i7, Object[] objArr) {
        this.c = objArr;
        this.d = i7;
    }

    @Override // c8.i, c8.e
    public final int f(Object[] objArr) {
        Object[] objArr2 = this.c;
        int i7 = this.d;
        System.arraycopy(objArr2, 0, objArr, 0, i7);
        return i7;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        a8.f8.a(i7, this.d);
        Object obj = this.c[i7];
        obj.getClass();
        return obj;
    }

    @Override // c8.e
    public final int i() {
        return this.d;
    }

    @Override // c8.e
    public final int j() {
        return 0;
    }

    @Override // c8.e
    public final Object[] k() {
        return this.c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
