package ci;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final class u5 implements qg.y1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ qg.x2 b;
    public final /* synthetic */ float c;

    public /* synthetic */ u5(qg.x2 x2Var, float f7, int i10) {
        this.a = i10;
        this.b = x2Var;
        this.c = f7;
    }

    @Override // qg.y1
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

    @Override // qg.y1
    public final void l(float f7) {
        switch (this.a) {
            case 0:
                qg.x2 x2Var = this.b;
                x2Var.z0 = true;
                x2Var.setBaseFontSize((int) (this.c * f7));
                break;
            default:
                qg.x2 x2Var2 = this.b;
                x2Var2.z0 = true;
                x2Var2.setBaseFontSize((int) (this.c * f7));
                break;
        }
    }
}
