// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final /* synthetic */ class kmc implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mmc b;

    public /* synthetic */ kmc(mmc mmcVar, byte b) {
        this.a = b;
        this.b = mmcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        mmc mmcVar = this.b;
        switch (b) {
            case 0:
                mmcVar.performClick();
                break;
            default:
                mmcVar.h.invalidate();
                mmcVar.n.invalidate();
                mmcVar.e.invalidate();
                break;
        }
    }
}
