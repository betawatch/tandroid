package ei;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes4.dex */
public final class j5 implements rg.v1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ rg.v2 b;
    public final /* synthetic */ float c;

    public /* synthetic */ j5(rg.v2 v2Var, float f7, int i10) {
        this.a = i10;
        this.b = v2Var;
        this.c = f7;
    }

    @Override // rg.v1
    public final void U(float f7) {
        switch (this.a) {
            case 0:
                rg.v2 v2Var = this.b;
                v2Var.z0 = true;
                v2Var.setBaseFontSize((int) (this.c * f7));
                break;
            default:
                rg.v2 v2Var2 = this.b;
                v2Var2.z0 = true;
                v2Var2.setBaseFontSize((int) (this.c * f7));
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
