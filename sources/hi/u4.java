package hi;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final class u4 implements tg.l1 {
    public final /* synthetic */ int a;
    public final Object b;
    public final float c;

    public /* synthetic */ u4(Object obj, float f10, int i7) {
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
                baseFontSize = ((tg.m2) this.b).getBaseFontSize();
                f10 = this.c;
                break;
            default:
                baseFontSize = ((tg.m2) this.b).getBaseFontSize();
                f10 = this.c;
                break;
        }
        return baseFontSize / f10;
    }

    @Override // tg.l1
    public void y1(float f10) {
        switch (this.a) {
            case 0:
                tg.m2 m2Var = (tg.m2) this.b;
                m2Var.A0 = true;
                m2Var.setBaseFontSize((int) (this.c * f10));
                break;
            default:
                tg.m2 m2Var2 = (tg.m2) this.b;
                m2Var2.A0 = true;
                m2Var2.setBaseFontSize((int) (this.c * f10));
                break;
        }
    }
}
