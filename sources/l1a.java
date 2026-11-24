// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class l1a implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ z3a b;
    public final /* synthetic */ TLRPC.Updates c;

    public /* synthetic */ l1a(z3a z3aVar, TLRPC.Updates updates, byte b) {
        this.a = b;
        this.b = z3aVar;
        this.c = updates;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        TLRPC.Updates updates = this.c;
        z3a z3aVar = this.b;
        switch (b) {
            case 0:
                z3aVar.getMessagesController().Q3(updates, false);
                break;
            default:
                z3aVar.getMessagesController().Q3(updates, false);
                break;
        }
    }
}
