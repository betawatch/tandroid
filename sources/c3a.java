// default package

import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class c3a implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ z3a b;
    public final /* synthetic */ TL_update.TL_updateNewChannelMessage c;

    public /* synthetic */ c3a(z3a z3aVar, TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage, byte b) {
        this.a = b;
        this.b = z3aVar;
        this.c = tL_updateNewChannelMessage;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage = this.c;
        z3a z3aVar = this.b;
        switch (b) {
            case 0:
                z3aVar.getMessagesController().O3(tL_updateNewChannelMessage.pts, tL_updateNewChannelMessage.pts_count, tL_updateNewChannelMessage.message.peer_id.channel_id);
                break;
            default:
                z3aVar.getMessagesController().O3(tL_updateNewChannelMessage.pts, tL_updateNewChannelMessage.pts_count, tL_updateNewChannelMessage.message.peer_id.channel_id);
                break;
        }
    }
}
