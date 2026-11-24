// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class eb1 implements it3 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lb1 b;

    public /* synthetic */ eb1(lb1 lb1Var, byte b) {
        this.a = b;
        this.b = lb1Var;
    }

    @Override // it3
    public final void a(zna znaVar, float f, float f2) {
        byte b = this.a;
        lb1 lb1Var = this.b;
        switch (b) {
            case 0:
                lb1Var.F = f / 500.0f;
                lb1Var.fragmentView.invalidate();
                break;
            default:
                lb1Var.c0 = lb1Var.O ? f / 500.0f : 1.0f - (f / 500.0f);
                lb1Var.fragmentView.invalidate();
                break;
        }
    }
}
