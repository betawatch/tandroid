package ci;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes4.dex */
public final class u5 implements qg.v1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ qg.u2 b;
    public final /* synthetic */ float c;

    public /* synthetic */ u5(qg.u2 u2Var, float f7, int i10) {
        this.a = i10;
        this.b = u2Var;
        this.c = f7;
    }

    @Override // qg.v1
    public final void K(float f7) {
        switch (this.a) {
            case 0:
                qg.u2 u2Var = this.b;
                u2Var.z0 = true;
                u2Var.setBaseFontSize((int) (this.c * f7));
                break;
            default:
                qg.u2 u2Var2 = this.b;
                u2Var2.z0 = true;
                u2Var2.setBaseFontSize((int) (this.c * f7));
                break;
        }
    }

    @Override // qg.v1
    public final float get() {
        float baseFontSize;
        float f7;
        switch (this.a) {
            case 0:
                baseFontSize = this.b.getBaseFontSize();
                f7 = this.c;
                break;
            default:
                baseFontSize = this.b.getBaseFontSize();
                f7 = this.c;
                break;
        }
        return baseFontSize / f7;
    }
}
