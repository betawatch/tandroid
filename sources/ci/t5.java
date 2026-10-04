package ci;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes4.dex */
public final class t5 implements qg.v1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ qg.v2 b;
    public final /* synthetic */ float c;

    public /* synthetic */ t5(qg.v2 v2Var, float f7, int i10) {
        this.a = i10;
        this.b = v2Var;
        this.c = f7;
    }

    @Override // qg.v1
    public final void E(float f7) {
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
