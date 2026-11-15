package hi;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
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
                baseFontSize = ((tg.o2) this.b).getBaseFontSize();
                f10 = this.c;
                break;
            default:
                baseFontSize = ((tg.o2) this.b).getBaseFontSize();
                f10 = this.c;
                break;
        }
        return baseFontSize / f10;
    }

    @Override // tg.l1
    public void r0(float f10) {
        switch (this.a) {
            case 0:
                tg.o2 o2Var = (tg.o2) this.b;
                o2Var.A0 = true;
                o2Var.setBaseFontSize((int) (this.c * f10));
                break;
            default:
                tg.o2 o2Var2 = (tg.o2) this.b;
                o2Var2.A0 = true;
                o2Var2.setBaseFontSize((int) (this.c * f10));
                break;
        }
    }
}
