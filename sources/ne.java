// default package

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final /* synthetic */ class ne implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ TLRPC.Updates c;

    public /* synthetic */ ne(int i, TLRPC.Updates updates, byte b) {
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
                uc7.s1(i).Y3(updates, false);
                break;
            case 1:
                ConnectionsManager.lambda$onUnparsedMessageReceived$12(i, updates);
                break;
            default:
                uc7.s1(i).Y3(updates, false);
                break;
        }
    }
}
