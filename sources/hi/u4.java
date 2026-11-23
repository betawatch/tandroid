package hi;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public final class u4 implements tg.m1 {
    public final /* synthetic */ int a;
    public final Object b;
    public final float c;

    public /* synthetic */ u4(Object obj, float f10, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = f10;
    }

    @Override // tg.m1
    public float get() {
        float baseFontSize;
        float f10;
        switch (this.a) {
            case 0:
                baseFontSize = ((tg.n2) this.b).getBaseFontSize();
                f10 = this.c;
                break;
            default:
                baseFontSize = ((tg.n2) this.b).getBaseFontSize();
                f10 = this.c;
                break;
        }
        return baseFontSize / f10;
    }

    @Override // tg.m1
    public void y1(float f10) {
        switch (this.a) {
            case 0:
                tg.n2 n2Var = (tg.n2) this.b;
                n2Var.A0 = true;
                n2Var.setBaseFontSize((int) (this.c * f10));
                break;
            default:
                tg.n2 n2Var2 = (tg.n2) this.b;
                n2Var2.A0 = true;
                n2Var2.setBaseFontSize((int) (this.c * f10));
                break;
        }
    }
}
