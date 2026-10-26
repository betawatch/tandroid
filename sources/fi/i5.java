package fi;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class i5 implements sg.x1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ sg.x2 b;
    public final /* synthetic */ float c;

    public /* synthetic */ i5(sg.x2 x2Var, float f7, int i10) {
        this.a = i10;
        this.b = x2Var;
        this.c = f7;
    }

    @Override // sg.x1
    public final void V(float f7) {
        switch (this.a) {
            case 0:
                sg.x2 x2Var = this.b;
                x2Var.z0 = true;
                x2Var.setBaseFontSize((int) (this.c * f7));
                break;
            default:
                sg.x2 x2Var2 = this.b;
                x2Var2.z0 = true;
                x2Var2.setBaseFontSize((int) (this.c * f7));
                break;
        }
    }

    @Override // sg.x1
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
