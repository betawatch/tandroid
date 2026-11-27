// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class ky5 implements fx7 {
    public final /* synthetic */ byte a;
    public final Object b;
    public final float c;

    public /* synthetic */ ky5(Object obj, float f, byte b) {
        this.a = b;
        this.b = obj;
        this.c = f;
    }

    @Override // fx7
    public final void G(float f) {
        byte b = this.a;
        float f2 = this.c;
        Object obj = this.b;
        switch (b) {
            case 0:
                rlb rlbVar = (rlb) obj;
                rlbVar.B0 = true;
                rlbVar.setBaseFontSize((int) (f2 * f));
                break;
            default:
                rlb rlbVar2 = (rlb) obj;
                rlbVar2.B0 = true;
                rlbVar2.setBaseFontSize((int) (f2 * f));
                break;
        }
    }

    @Override // fx7
    public final float get() {
        float baseFontSize;
        float f;
        switch (this.a) {
            case 0:
                baseFontSize = ((rlb) this.b).getBaseFontSize();
                f = this.c;
                break;
            default:
                baseFontSize = ((rlb) this.b).getBaseFontSize();
                f = this.c;
                break;
        }
        return baseFontSize / f;
    }
}
