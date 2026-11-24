// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final /* synthetic */ class bmc implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ cmc b;

    public /* synthetic */ bmc(cmc cmcVar, byte b) {
        this.a = b;
        this.b = cmcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        cmc cmcVar = this.b;
        switch (b) {
            case 0:
                gl.c3(new bmc(cmcVar, (byte) 1));
                break;
            default:
                cmcVar.a();
                break;
        }
    }
}
