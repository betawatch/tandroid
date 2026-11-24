// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gnc implements yr3 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lnc b;

    public /* synthetic */ gnc(lnc lncVar, byte b) {
        this.a = b;
        this.b = lncVar;
    }

    @Override // yr3
    public final void a(yla ylaVar, float f, float f2) {
        byte b = this.a;
        lnc lncVar = this.b;
        switch (b) {
            case 0:
                lncVar.c.setScaleX(f);
                lncVar.c.setScaleY(f);
                break;
            default:
                lncVar.Q = f2;
                break;
        }
    }
}
