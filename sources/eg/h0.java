package eg;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class h0 implements q2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ z3 b;
    public final /* synthetic */ float c;

    public /* synthetic */ h0(z3 z3Var, float f10, int i10) {
        this.a = i10;
        this.b = z3Var;
        this.c = f10;
    }

    @Override // eg.q2
    public final void H(float f10) {
        switch (this.a) {
            case 0:
                z3 z3Var = this.b;
                z3Var.w0 = true;
                z3Var.setBaseFontSize((int) (this.c * f10));
                break;
            default:
                z3 z3Var2 = this.b;
                z3Var2.w0 = true;
                z3Var2.setBaseFontSize((int) (this.c * f10));
                break;
        }
    }

    @Override // eg.q2
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
