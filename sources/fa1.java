// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
