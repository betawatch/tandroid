// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class cr1 extends k11 {
    public final /* synthetic */ byte d;
    public final /* synthetic */ int e;
    public final /* synthetic */ rc2 f;
    public final /* synthetic */ yv1 g;

    public /* synthetic */ cr1(yv1 yv1Var, int i, rc2 rc2Var, byte b) {
        this.d = b;
        this.g = yv1Var;
        this.e = i;
        this.f = rc2Var;
    }

    @Override // k11
    public final void c(boolean z) {
        switch (this.d) {
            case 0:
                if (!z) {
                    gm.d3(new eh((Object) this, this.e, (byte) 16), 240L);
                    break;
                }
                break;
            case 1:
                if (!z) {
                    gm.d3(new eh((Object) this, this.e, (byte) 18), 240L);
                    break;
                }
                break;
            default:
                if (!z) {
                    gm.d3(new eh((Object) this, this.e, (byte) 19), 240L);
                    break;
                }
                break;
        }
    }

    @Override // k11
    public final void d() {
        byte b = this.d;
        rc2 rc2Var = this.f;
        int i = this.e;
        yv1 yv1Var = this.g;
        switch (b) {
            case 0:
                yv1Var.kc = i;
                yv1Var.lc = 6;
                rc2Var.invalidate();
                break;
            case 1:
                yv1Var.kc = i;
                yv1Var.lc = 5;
                yv1Var.nc = null;
                rc2Var.invalidate();
                break;
            default:
                yv1Var.kc = i;
                yv1Var.lc = 7;
                rc2Var.invalidate();
                break;
        }
    }
}
