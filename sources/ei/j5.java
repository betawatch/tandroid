package ei;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
