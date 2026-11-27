// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final /* synthetic */ class e5a implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ r7a b;
    public final /* synthetic */ TLRPC.Updates c;
    public final /* synthetic */ TLRPC.Message d;
    public final /* synthetic */ boolean e;

    public /* synthetic */ e5a(r7a r7aVar, TLRPC.Updates updates, TLRPC.Message message, boolean z, byte b) {
        this.a = b;
        this.b = r7aVar;
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
        r7a r7aVar = this.b;
        switch (b) {
            case 0:
                r7aVar.getMessagesController().Y3(updates, false);
                hl.c3(new s5a(r7aVar, message, z, (byte) 1));
                break;
            default:
                r7aVar.getMessagesController().Y3(updates, false);
                hl.c3(new s5a(r7aVar, message, z, (byte) 0));
                break;
        }
    }
}
