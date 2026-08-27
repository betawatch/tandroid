package lh;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class j5 implements zf.v1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ zf.v2 b;
    public final /* synthetic */ float c;

    public /* synthetic */ j5(zf.v2 v2Var, float f10, int i10) {
        this.a = i10;
        this.b = v2Var;
        this.c = f10;
    }

    @Override // zf.v1
    public final void c0(float f10) {
        switch (this.a) {
            case 0:
                zf.v2 v2Var = this.b;
                v2Var.v0 = true;
                v2Var.setBaseFontSize((int) (this.c * f10));
                break;
            default:
                zf.v2 v2Var2 = this.b;
                v2Var2.v0 = true;
                v2Var2.setBaseFontSize((int) (this.c * f10));
                break;
        }
    }

    @Override // zf.v1
    public final float get() {
        float baseFontSize;
        float f10;
        switch (this.a) {
            case 0:
                baseFontSize = this.b.getBaseFontSize();
                f10 = this.c;
                break;
            default:
                baseFontSize = this.b.getBaseFontSize();
                f10 = this.c;
                break;
        }
        return baseFontSize / f10;
    }
}
