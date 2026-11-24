// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class ew0 implements qac {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qu3 b;

    public /* synthetic */ ew0(qu3 qu3Var, byte b) {
        this.a = b;
        this.b = qu3Var;
    }

    @Override // qac
    public final void a(Object obj) {
        byte b = this.a;
        qu3 qu3Var = this.b;
        switch (b) {
            case 0:
                gm.t1(qu3Var);
                gm.d3((Runnable) obj, 80L);
                break;
            default:
                qu3Var.H(((Integer) obj).intValue());
                break;
        }
    }
}
