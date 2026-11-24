// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final /* synthetic */ class inc implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lnc b;

    public /* synthetic */ inc(lnc lncVar, byte b) {
        this.a = b;
        this.b = lncVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        lnc lncVar = this.b;
        switch (b) {
            case 0:
                lncVar.i();
                break;
            default:
                Runnable runnable = lncVar.d0;
                lncVar.d0 = null;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
        }
    }
}
