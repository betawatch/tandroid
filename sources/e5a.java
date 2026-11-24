// default package

import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class e5a implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ a6a b;
    public final /* synthetic */ TL_update.TL_updateNewChannelMessage c;

    public /* synthetic */ e5a(a6a a6aVar, TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage, byte b) {
        this.a = b;
        this.b = a6aVar;
        this.c = tL_updateNewChannelMessage;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage = this.c;
        a6a a6aVar = this.b;
        switch (b) {
            case 0:
                a6aVar.getMessagesController().Q3(tL_updateNewChannelMessage.pts, tL_updateNewChannelMessage.pts_count, tL_updateNewChannelMessage.message.peer_id.channel_id);
                break;
            default:
                a6aVar.getMessagesController().Q3(tL_updateNewChannelMessage.pts, tL_updateNewChannelMessage.pts_count, tL_updateNewChannelMessage.message.peer_id.channel_id);
                break;
        }
    }
}
