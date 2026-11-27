// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class dq1 extends l01 {
    public final /* synthetic */ byte d;
    public final /* synthetic */ int e;
    public final /* synthetic */ wb2 f;
    public final /* synthetic */ zu1 g;

    public /* synthetic */ dq1(zu1 zu1Var, int i, wb2 wb2Var, byte b) {
        this.d = b;
        this.g = zu1Var;
        this.e = i;
        this.f = wb2Var;
    }

    @Override // l01
    public final void c(boolean z) {
        switch (this.d) {
            case 0:
                if (!z) {
                    hl.d3(new zd((Object) this, this.e, (byte) 16), 240L);
                    break;
                }
                break;
            case 1:
                if (!z) {
                    hl.d3(new zd((Object) this, this.e, (byte) 18), 240L);
                    break;
                }
                break;
            default:
                if (!z) {
                    hl.d3(new zd((Object) this, this.e, (byte) 19), 240L);
                    break;
                }
                break;
        }
    }

    @Override // l01
    public final void d() {
        byte b = this.d;
        wb2 wb2Var = this.f;
        int i = this.e;
        zu1 zu1Var = this.g;
        switch (b) {
            case 0:
                zu1Var.lc = i;
                zu1Var.mc = 6;
                wb2Var.invalidate();
                break;
            case 1:
                zu1Var.lc = i;
                zu1Var.mc = 5;
                zu1Var.oc = null;
                wb2Var.invalidate();
                break;
            default:
                zu1Var.lc = i;
                zu1Var.mc = 7;
                wb2Var.invalidate();
                break;
        }
    }
}
