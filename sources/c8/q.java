package c8;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class q extends i {
    public final transient Object[] c;
    public final transient int d;
    public final transient int e = 1;

    public q(int i7, Object[] objArr) {
        this.c = objArr;
        this.d = i7;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        a8.f8.a(i7, this.e);
        Object obj = this.c[i7 + i7 + this.d];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.e;
    }
}
