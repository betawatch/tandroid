// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class dvb implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ evb b;

    public /* synthetic */ dvb(evb evbVar, byte b) {
        this.a = b;
        this.b = evbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        evb evbVar = this.b;
        switch (b) {
            case 0:
                evbVar.F = null;
                if (evbVar.G != -1) {
                    evbVar.H.getNotificationCenter().j(evbVar.G);
                    evbVar.G = -1;
                    break;
                }
                break;
            default:
                evbVar.F = null;
                if (evbVar.G != -1) {
                    evbVar.H.getNotificationCenter().j(evbVar.G);
                    evbVar.G = -1;
                    break;
                }
                break;
        }
    }
}
