// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class fu1 extends l01 {
    public final /* synthetic */ wb2 d;
    public final /* synthetic */ ju1 e;

    public fu1(ju1 ju1Var, wb2 wb2Var) {
        this.e = ju1Var;
        this.d = wb2Var;
    }

    @Override // l01
    public final void c(boolean z) {
        if (z) {
            return;
        }
        hl.d3(new zo1(this.e.a, (byte) 7), 250L);
    }

    @Override // l01
    public final void d() {
        zu1 zu1Var = this.e.a;
        wb2 wb2Var = this.d;
        zu1Var.lc = wb2Var.getMessageObject().e1();
        zu1Var.mc = 2;
        zu1Var.nc = null;
        wb2Var.invalidate();
    }
}
