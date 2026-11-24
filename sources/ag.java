// default package

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class ag implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ TLRPC.Updates c;

    public /* synthetic */ ag(int i, TLRPC.Updates updates, byte b) {
        this.a = b;
        this.b = i;
        this.c = updates;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        TLRPC.Updates updates = this.c;
        int i = this.b;
        switch (b) {
            case 0:
                oc7.r1(i).T3(updates, false);
                break;
            case 1:
                ConnectionsManager.lambda$onUnparsedMessageReceived$12(i, updates);
                break;
            default:
                oc7.r1(i).T3(updates, false);
                break;
        }
    }
}
