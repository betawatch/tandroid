// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
