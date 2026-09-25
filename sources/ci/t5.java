package ci;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes4.dex */
public final class t5 implements qg.w1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ qg.v2 b;
    public final /* synthetic */ float c;

    public /* synthetic */ t5(qg.v2 v2Var, float f7, int i10) {
        this.a = i10;
        this.b = v2Var;
        this.c = f7;
    }

    @Override // qg.w1
    public final void K(float f7) {
        switch (this.a) {
            case 0:
                qg.v2 v2Var = this.b;
                v2Var.z0 = true;
                v2Var.setBaseFontSize((int) (this.c * f7));
                break;
            default:
                qg.v2 v2Var2 = this.b;
                v2Var2.z0 = true;
                v2Var2.setBaseFontSize((int) (this.c * f7));
                break;
        }
    }

    @Override // qg.w1
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
