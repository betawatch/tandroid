package fi;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class i5 implements sg.w1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ sg.w2 b;
    public final /* synthetic */ float c;

    public /* synthetic */ i5(sg.w2 w2Var, float f7, int i10) {
        this.a = i10;
        this.b = w2Var;
        this.c = f7;
    }

    @Override // sg.w1
    public final void V(float f7) {
        switch (this.a) {
            case 0:
                sg.w2 w2Var = this.b;
                w2Var.z0 = true;
                w2Var.setBaseFontSize((int) (this.c * f7));
                break;
            default:
                sg.w2 w2Var2 = this.b;
                w2Var2.z0 = true;
                w2Var2.setBaseFontSize((int) (this.c * f7));
                break;
        }
    }

    @Override // sg.w1
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
