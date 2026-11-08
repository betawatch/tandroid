package fi;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class y4 implements tg.l1 {
    public final /* synthetic */ int a;
    public final Object b;
    public final float c;

    public /* synthetic */ y4(Object obj, float f10, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = f10;
    }

    @Override // tg.l1
    public void X(float f10) {
        switch (this.a) {
            case 0:
                tg.k2 k2Var = (tg.k2) this.b;
                k2Var.z0 = true;
                k2Var.setBaseFontSize((int) (this.c * f10));
                break;
            default:
                tg.k2 k2Var2 = (tg.k2) this.b;
                k2Var2.z0 = true;
                k2Var2.setBaseFontSize((int) (this.c * f10));
                break;
        }
    }

    @Override // tg.l1
    public float get() {
        float baseFontSize;
        float f10;
        switch (this.a) {
            case 0:
                baseFontSize = ((tg.k2) this.b).getBaseFontSize();
                f10 = this.c;
                break;
            default:
                baseFontSize = ((tg.k2) this.b).getBaseFontSize();
                f10 = this.c;
                break;
        }
        return baseFontSize / f10;
    }
}
