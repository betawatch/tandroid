package hi;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class w4 implements tg.l1 {
    public final /* synthetic */ int a;
    public final Object b;
    public final float c;

    public /* synthetic */ w4(Object obj, float f10, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = f10;
    }

    @Override // tg.l1
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

    @Override // tg.l1
    public void r0(float f10) {
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
