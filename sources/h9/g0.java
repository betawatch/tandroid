package h9;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class g0 extends a {
    public final i0 c;

    public g0(i0 i0Var, int i7) {
        super(i0Var.size(), i7);
        this.c = i0Var;
    }

    @Override // h9.a
    public final Object a(int i7) {
        return this.c.get(i7);
    }
}
