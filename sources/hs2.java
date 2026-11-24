// default package

import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class hs2 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ConnectionsManager b;
    public final /* synthetic */ int c;

    public /* synthetic */ hs2(ConnectionsManager connectionsManager, int i, byte b) {
        this.a = b;
        this.b = connectionsManager;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        int i = this.c;
        ConnectionsManager connectionsManager = this.b;
        switch (b) {
            case 0:
                connectionsManager.lambda$failNotRunningRequest$1(i);
                break;
            default:
                connectionsManager.lambda$cancelRequestsForGuid$11(i);
                break;
        }
    }
}
