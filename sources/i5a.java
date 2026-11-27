// default package

import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final /* synthetic */ class i5a implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ r7a b;
    public final /* synthetic */ TL_update.TL_updateNewChannelMessage c;

    public /* synthetic */ i5a(r7a r7aVar, TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage, byte b) {
        this.a = b;
        this.b = r7aVar;
        this.c = tL_updateNewChannelMessage;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage = this.c;
        r7a r7aVar = this.b;
        switch (b) {
            case 0:
                r7aVar.getMessagesController().V3(tL_updateNewChannelMessage.pts, tL_updateNewChannelMessage.pts_count, tL_updateNewChannelMessage.message.peer_id.channel_id);
                break;
            default:
                r7aVar.getMessagesController().V3(tL_updateNewChannelMessage.pts, tL_updateNewChannelMessage.pts_count, tL_updateNewChannelMessage.message.peer_id.channel_id);
                break;
        }
    }
}
