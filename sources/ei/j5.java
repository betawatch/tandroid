package ei;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final class j5 implements rg.v1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ rg.u2 b;
    public final /* synthetic */ float c;

    public /* synthetic */ j5(rg.u2 u2Var, float f7, int i10) {
        this.a = i10;
        this.b = u2Var;
        this.c = f7;
    }

    @Override // rg.v1
    public final void U(float f7) {
        switch (this.a) {
            case 0:
                rg.u2 u2Var = this.b;
                u2Var.z0 = true;
                u2Var.setBaseFontSize((int) (this.c * f7));
                break;
            default:
                rg.u2 u2Var2 = this.b;
                u2Var2.z0 = true;
                u2Var2.setBaseFontSize((int) (this.c * f7));
                break;
        }
    }

    @Override // rg.v1
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
