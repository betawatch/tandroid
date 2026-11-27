// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class fa1 implements qs3 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ la1 b;

    public /* synthetic */ fa1(la1 la1Var, byte b) {
        this.a = b;
        this.b = la1Var;
    }

    @Override // qs3
    public final void a(vpa vpaVar, float f, float f2) {
        byte b = this.a;
        la1 la1Var = this.b;
        switch (b) {
            case 0:
                la1Var.c0 = la1Var.O ? f / 500.0f : 1.0f - (f / 500.0f);
                la1Var.fragmentView.invalidate();
                break;
            default:
                la1Var.F = f / 500.0f;
                la1Var.fragmentView.invalidate();
                break;
        }
    }
}
