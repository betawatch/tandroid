package h9;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
