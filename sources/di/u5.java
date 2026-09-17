package di;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes4.dex */
public final class u5 implements rg.x1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ rg.x2 b;
    public final /* synthetic */ float c;

    public /* synthetic */ u5(rg.x2 x2Var, float f7, int i10) {
        this.a = i10;
        this.b = x2Var;
        this.c = f7;
    }

    @Override // rg.x1
    public final void H(float f7) {
        switch (this.a) {
            case 0:
                rg.x2 x2Var = this.b;
                x2Var.z0 = true;
                x2Var.setBaseFontSize((int) (this.c * f7));
                break;
            default:
                rg.x2 x2Var2 = this.b;
                x2Var2.z0 = true;
                x2Var2.setBaseFontSize((int) (this.c * f7));
                break;
        }
    }

    @Override // rg.x1
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
