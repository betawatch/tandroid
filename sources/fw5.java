// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class fw5 implements yt7 {
    public final /* synthetic */ byte a;
    public final Object b;
    public final float c;

    public /* synthetic */ fw5(Object obj, float f, byte b) {
        this.a = b;
        this.b = obj;
        this.c = f;
    }

    @Override // yt7
    public final void M(float f) {
        byte b = this.a;
        float f2 = this.c;
        Object obj = this.b;
        switch (b) {
            case 0:
                vhb vhbVar = (vhb) obj;
                vhbVar.B0 = true;
                vhbVar.setBaseFontSize((int) (f2 * f));
                break;
            default:
                vhb vhbVar2 = (vhb) obj;
                vhbVar2.B0 = true;
                vhbVar2.setBaseFontSize((int) (f2 * f));
                break;
        }
    }

    @Override // yt7
    public final float get() {
        float baseFontSize;
        float f;
        switch (this.a) {
            case 0:
                baseFontSize = ((vhb) this.b).getBaseFontSize();
                f = this.c;
                break;
            default:
                baseFontSize = ((vhb) this.b).getBaseFontSize();
                f = this.c;
                break;
        }
        return baseFontSize / f;
    }
}
