package gi;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class w4 implements ug.k1 {
    public final /* synthetic */ int a;
    public final Object b;
    public final float c;

    public /* synthetic */ w4(Object obj, float f10, int i3) {
        this.a = i3;
        this.b = obj;
        this.c = f10;
    }

    @Override // ug.k1
    public float get() {
        float baseFontSize;
        float f10;
        switch (this.a) {
            case 0:
                baseFontSize = ((ug.l2) this.b).getBaseFontSize();
                f10 = this.c;
                break;
            default:
                baseFontSize = ((ug.l2) this.b).getBaseFontSize();
                f10 = this.c;
                break;
        }
        return baseFontSize / f10;
    }

    @Override // ug.k1
    public void s(float f10) {
        switch (this.a) {
            case 0:
                ug.l2 l2Var = (ug.l2) this.b;
                l2Var.A0 = true;
                l2Var.setBaseFontSize((int) (this.c * f10));
                break;
            default:
                ug.l2 l2Var2 = (ug.l2) this.b;
                l2Var2.A0 = true;
                l2Var2.setBaseFontSize((int) (this.c * f10));
                break;
        }
    }
}
