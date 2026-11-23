package hi;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class g5 implements tg.q1 {
    public final /* synthetic */ int a;
    public final Object b;
    public final float c;

    public /* synthetic */ g5(Object obj, float f10, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = f10;
    }

    @Override // tg.q1
    public float get() {
        float baseFontSize;
        float f10;
        switch (this.a) {
            case 0:
                baseFontSize = ((tg.q2) this.b).getBaseFontSize();
                f10 = this.c;
                break;
            default:
                baseFontSize = ((tg.q2) this.b).getBaseFontSize();
                f10 = this.c;
                break;
        }
        return baseFontSize / f10;
    }

    @Override // tg.q1
    public void h2(float f10) {
        switch (this.a) {
            case 0:
                tg.q2 q2Var = (tg.q2) this.b;
                q2Var.B0 = true;
                q2Var.setBaseFontSize((int) (this.c * f10));
                break;
            default:
                tg.q2 q2Var2 = (tg.q2) this.b;
                q2Var2.B0 = true;
                q2Var2.setBaseFontSize((int) (this.c * f10));
                break;
        }
    }
}
