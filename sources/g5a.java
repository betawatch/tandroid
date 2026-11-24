// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class g5a implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ a6a b;
    public final /* synthetic */ TLRPC.Updates c;
    public final /* synthetic */ TLRPC.Message d;
    public final /* synthetic */ boolean e;

    public /* synthetic */ g5a(a6a a6aVar, TLRPC.Updates updates, TLRPC.Message message, boolean z, byte b) {
        this.a = b;
        this.b = a6aVar;
        this.c = updates;
        this.d = message;
        this.e = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        boolean z = this.e;
        TLRPC.Message message = this.d;
        TLRPC.Updates updates = this.c;
        a6a a6aVar = this.b;
        switch (b) {
            case 0:
                a6aVar.getMessagesController().T3(updates, false);
                gm.c3(new u3a(a6aVar, message, z, (byte) 0));
                break;
            default:
                a6aVar.getMessagesController().T3(updates, false);
                gm.c3(new u3a(a6aVar, message, z, (byte) 1));
                break;
        }
    }
}
