// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class cw8 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ gw8 b;

    public /* synthetic */ cw8(gw8 gw8Var, byte b) {
        this.a = b;
        this.b = gw8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        gw8 gw8Var = this.b;
        switch (b) {
            case 0:
                if (gw8Var.h == null && gw8Var.d != null && !gw8Var.isFinished && gw8Var.getParentActivity() != null) {
                    gw8Var.f0(gw8Var.d.H0(), 0.0f, true);
                    gw8Var.h.setVisibility(4);
                    sx3 sx3Var = gw8Var.y;
                    if (sx3Var != null) {
                        sx3Var.setVisibility(4);
                        break;
                    }
                }
                break;
            case 1:
                sx3 sx3Var2 = gw8Var.y;
                if (sx3Var2 != null) {
                    sx3Var2.invalidate();
                }
                gw8Var.l0();
                break;
            default:
                gw8Var.j0();
                break;
        }
    }
}
