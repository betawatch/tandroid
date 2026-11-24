// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
