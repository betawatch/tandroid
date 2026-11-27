// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dw7 implements ps3 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ dx7 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ dw7(dx7 dx7Var, boolean z, byte b) {
        this.a = b;
        this.b = dx7Var;
        this.c = z;
    }

    @Override // ps3
    public final void a(vpa vpaVar, boolean z, float f, float f2) {
        byte b = this.a;
        boolean z2 = this.c;
        dx7 dx7Var = this.b;
        switch (b) {
            case 0:
                pw7 pw7Var = dx7Var.g1;
                if (vpaVar == dx7Var.m1) {
                    dx7Var.m1 = null;
                    if (!z2) {
                        pw7Var.setVisibility(8);
                        a78.e(dx7Var.p1).g();
                        pw7Var.getAdapter().f();
                        break;
                    }
                }
                break;
            default:
                zv7 zv7Var = dx7Var.W0;
                if (vpaVar == dx7Var.f1) {
                    dx7Var.f1 = null;
                    if (!z2) {
                        zv7Var.setVisibility(8);
                    }
                    zv7Var.setMaskProvider(null);
                    break;
                }
                break;
        }
    }
}
