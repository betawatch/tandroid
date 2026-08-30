package dg;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class j0 implements s2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ b4 b;
    public final /* synthetic */ float c;

    public /* synthetic */ j0(b4 b4Var, float f10, int i10) {
        this.a = i10;
        this.b = b4Var;
        this.c = f10;
    }

    @Override // dg.s2
    public final void F(float f10) {
        switch (this.a) {
            case 0:
                b4 b4Var = this.b;
                b4Var.w0 = true;
                b4Var.setBaseFontSize((int) (this.c * f10));
                break;
            default:
                b4 b4Var2 = this.b;
                b4Var2.w0 = true;
                b4Var2.setBaseFontSize((int) (this.c * f10));
                break;
        }
    }

    @Override // dg.s2
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
