// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class fy5 implements zv7 {
    public final /* synthetic */ byte a;
    public final Object b;
    public final float c;

    public /* synthetic */ fy5(Object obj, float f, byte b) {
        this.a = b;
        this.b = obj;
        this.c = f;
    }

    @Override // zv7
    public final void O(float f) {
        byte b = this.a;
        float f2 = this.c;
        Object obj = this.b;
        switch (b) {
            case 0:
                xjb xjbVar = (xjb) obj;
                xjbVar.B0 = true;
                xjbVar.setBaseFontSize((int) (f2 * f));
                break;
            default:
                xjb xjbVar2 = (xjb) obj;
                xjbVar2.B0 = true;
                xjbVar2.setBaseFontSize((int) (f2 * f));
                break;
        }
    }

    @Override // zv7
    public final float get() {
        float baseFontSize;
        float f;
        switch (this.a) {
            case 0:
                baseFontSize = ((xjb) this.b).getBaseFontSize();
                f = this.c;
                break;
            default:
                baseFontSize = ((xjb) this.b).getBaseFontSize();
                f = this.c;
                break;
        }
        return baseFontSize / f;
    }
}
