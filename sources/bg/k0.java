package bg;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class k0 implements v2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ f4 b;
    public final /* synthetic */ float c;

    public /* synthetic */ k0(f4 f4Var, float f9, int i10) {
        this.a = i10;
        this.b = f4Var;
        this.c = f9;
    }

    @Override // bg.v2
    public final void K(float f9) {
        switch (this.a) {
            case 0:
                f4 f4Var = this.b;
                f4Var.v0 = true;
                f4Var.setBaseFontSize((int) (this.c * f9));
                break;
            default:
                f4 f4Var2 = this.b;
                f4Var2.v0 = true;
                f4Var2.setBaseFontSize((int) (this.c * f9));
                break;
        }
    }

    @Override // bg.v2
    public final float get() {
        float baseFontSize;
        float f9;
        switch (this.a) {
            case 0:
                baseFontSize = this.b.getBaseFontSize();
                f9 = this.c;
                break;
            default:
                baseFontSize = this.b.getBaseFontSize();
                f9 = this.c;
                break;
        }
        return baseFontSize / f9;
    }
}
