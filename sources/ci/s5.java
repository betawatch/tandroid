package ci;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class s5 implements qg.v1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ qg.w2 b;
    public final /* synthetic */ float c;

    public /* synthetic */ s5(qg.w2 w2Var, float f7, int i10) {
        this.a = i10;
        this.b = w2Var;
        this.c = f7;
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

    @Override // qg.v1
    public final void q0(float f7) {
        switch (this.a) {
            case 0:
                qg.w2 w2Var = this.b;
                w2Var.z0 = true;
                w2Var.setBaseFontSize((int) (this.c * f7));
                break;
            default:
                qg.w2 w2Var2 = this.b;
                w2Var2.z0 = true;
                w2Var2.setBaseFontSize((int) (this.c * f7));
                break;
        }
    }
}
