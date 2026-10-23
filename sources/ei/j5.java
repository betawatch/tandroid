package ei;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes4.dex */
public final class j5 implements rg.w1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ rg.w2 b;
    public final /* synthetic */ float c;

    public /* synthetic */ j5(rg.w2 w2Var, float f7, int i10) {
        this.a = i10;
        this.b = w2Var;
        this.c = f7;
    }

    @Override // rg.w1
    public final void U(float f7) {
        switch (this.a) {
            case 0:
                rg.w2 w2Var = this.b;
                w2Var.z0 = true;
                w2Var.setBaseFontSize((int) (this.c * f7));
                break;
            default:
                rg.w2 w2Var2 = this.b;
                w2Var2.z0 = true;
                w2Var2.setBaseFontSize((int) (this.c * f7));
                break;
        }
    }

    @Override // rg.w1
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
