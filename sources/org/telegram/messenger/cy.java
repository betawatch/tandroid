package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final /* synthetic */ class cy implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ az b;
    public final /* synthetic */ TL_update.TL_updateNewMessage c;

    public /* synthetic */ cy(az azVar, TL_update.TL_updateNewMessage tL_updateNewMessage, int i7) {
        this.a = i7;
        this.b = azVar;
        this.c = tL_updateNewMessage;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                np messagesController = this.b.getMessagesController();
                TL_update.TL_updateNewMessage tL_updateNewMessage = this.c;
                messagesController.T3(tL_updateNewMessage.pts, -1, tL_updateNewMessage.pts_count);
                break;
            case 1:
                np messagesController2 = this.b.getMessagesController();
                TL_update.TL_updateNewMessage tL_updateNewMessage2 = this.c;
                messagesController2.T3(tL_updateNewMessage2.pts, -1, tL_updateNewMessage2.pts_count);
                break;
            default:
                np messagesController3 = this.b.getMessagesController();
                TL_update.TL_updateNewMessage tL_updateNewMessage3 = this.c;
                messagesController3.T3(tL_updateNewMessage3.pts, -1, tL_updateNewMessage3.pts_count);
                break;
        }
    }
}
