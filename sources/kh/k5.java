package kh;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class k5 implements yf.v1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ yf.v2 b;
    public final /* synthetic */ float c;

    public /* synthetic */ k5(yf.v2 v2Var, float f10, int i9) {
        this.a = i9;
        this.b = v2Var;
        this.c = f10;
    }

    @Override // yf.v1
    public final void g0(float f10) {
        switch (this.a) {
            case 0:
                yf.v2 v2Var = this.b;
                v2Var.v0 = true;
                v2Var.setBaseFontSize((int) (this.c * f10));
                break;
            default:
                yf.v2 v2Var2 = this.b;
                v2Var2.v0 = true;
                v2Var2.setBaseFontSize((int) (this.c * f10));
                break;
        }
    }

    @Override // yf.v1
    public final float get() {
        float baseFontSize;
        float f10;
        switch (this.a) {
            case 0:
                baseFontSize = this.b.getBaseFontSize();
                f10 = this.c;
                break;
            default:
                baseFontSize = this.b.getBaseFontSize();
                f10 = this.c;
                break;
        }
        return baseFontSize / f10;
    }
}
