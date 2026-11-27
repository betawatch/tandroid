// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
