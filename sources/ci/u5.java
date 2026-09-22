package ci;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes4.dex */
public final class u5 implements qg.w1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ qg.v2 b;
    public final /* synthetic */ float c;

    public /* synthetic */ u5(qg.v2 v2Var, float f7, int i10) {
        this.a = i10;
        this.b = v2Var;
        this.c = f7;
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

    @Override // qg.w1
    public final void m(float f7) {
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
}
