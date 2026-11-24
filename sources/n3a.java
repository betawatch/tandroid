// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class n3a implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ a6a b;
    public final /* synthetic */ TLRPC.Updates c;

    public /* synthetic */ n3a(a6a a6aVar, TLRPC.Updates updates, byte b) {
        this.a = b;
        this.b = a6aVar;
        this.c = updates;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        TLRPC.Updates updates = this.c;
        a6a a6aVar = this.b;
        switch (b) {
            case 0:
                a6aVar.getMessagesController().T3(updates, false);
                break;
            default:
                a6aVar.getMessagesController().T3(updates, false);
                break;
        }
    }
}
