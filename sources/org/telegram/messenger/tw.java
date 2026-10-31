package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class tw implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qz b;
    public final /* synthetic */ TL_update.TL_updateNewChannelMessage c;

    public /* synthetic */ tw(qz qzVar, TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage, int i10) {
        this.a = i10;
        this.b = qzVar;
        this.c = tL_updateNewChannelMessage;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                vp messagesController = this.b.getMessagesController();
                TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage = this.c;
                messagesController.I3(tL_updateNewChannelMessage.pts, tL_updateNewChannelMessage.pts_count, tL_updateNewChannelMessage.message.peer_id.channel_id);
                break;
            default:
                vp messagesController2 = this.b.getMessagesController();
                TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage2 = this.c;
                messagesController2.I3(tL_updateNewChannelMessage2.pts, tL_updateNewChannelMessage2.pts_count, tL_updateNewChannelMessage2.message.peer_id.channel_id);
                break;
        }
    }
}
