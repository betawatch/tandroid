package d9;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class o implements n, he.a, ib.b {
    public final Object a;

    public /* synthetic */ o(Object obj) {
        this.a = obj;
    }

    public static o b(Object obj) {
        if (obj != null) {
            return new o(obj);
        }
        throw new NullPointerException("instance cannot be null");
    }

    @Override // d9.r
    public Object a() {
        return this.a;
    }

    @Override // fd.a
    public Object get() {
        return this.a;
    }
}
