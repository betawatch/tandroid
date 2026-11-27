// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final /* synthetic */ class k5a implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ r7a b;
    public final /* synthetic */ TLRPC.Updates c;

    public /* synthetic */ k5a(r7a r7aVar, TLRPC.Updates updates, byte b) {
        this.a = b;
        this.b = r7aVar;
        this.c = updates;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        TLRPC.Updates updates = this.c;
        r7a r7aVar = this.b;
        switch (b) {
            case 0:
                r7aVar.getMessagesController().Y3(updates, false);
                break;
            default:
                r7aVar.getMessagesController().Y3(updates, false);
                break;
        }
    }
}
