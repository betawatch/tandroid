// default package

import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class b3a implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ z3a b;
    public final /* synthetic */ TL_update.TL_updateNewMessage c;

    public /* synthetic */ b3a(z3a z3aVar, TL_update.TL_updateNewMessage tL_updateNewMessage, byte b) {
        this.a = b;
        this.b = z3aVar;
        this.c = tL_updateNewMessage;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        TL_update.TL_updateNewMessage tL_updateNewMessage = this.c;
        z3a z3aVar = this.b;
        switch (b) {
            case 0:
                z3aVar.getMessagesController().P3(tL_updateNewMessage.pts, -1, tL_updateNewMessage.pts_count);
                break;
            case 1:
                z3aVar.getMessagesController().P3(tL_updateNewMessage.pts, -1, tL_updateNewMessage.pts_count);
                break;
            default:
                z3aVar.getMessagesController().P3(tL_updateNewMessage.pts, -1, tL_updateNewMessage.pts_count);
                break;
        }
    }
}
