package jg;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class c0 implements c2 {
    public final /* synthetic */ int a;
    public final Object b;
    public final float c;

    public /* synthetic */ c0(Object obj, float f7, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = f7;
    }

    @Override // jg.c2
    public void G(float f7) {
        switch (this.a) {
            case 0:
                g3 g3Var = (g3) this.b;
                g3Var.z0 = true;
                g3Var.setBaseFontSize((int) (this.c * f7));
                break;
            default:
                g3 g3Var2 = (g3) this.b;
                g3Var2.z0 = true;
                g3Var2.setBaseFontSize((int) (this.c * f7));
                break;
        }
    }

    @Override // jg.c2
    public float get() {
        float baseFontSize;
        float f7;
        switch (this.a) {
            case 0:
                baseFontSize = ((g3) this.b).getBaseFontSize();
                f7 = this.c;
                break;
            default:
                baseFontSize = ((g3) this.b).getBaseFontSize();
                f7 = this.c;
                break;
        }
        return baseFontSize / f7;
    }
}
