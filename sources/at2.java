// default package

import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final /* synthetic */ class at2 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ConnectionsManager b;
    public final /* synthetic */ int c;

    public /* synthetic */ at2(ConnectionsManager connectionsManager, int i, byte b) {
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
