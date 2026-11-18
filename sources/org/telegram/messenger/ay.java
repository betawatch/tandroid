package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final /* synthetic */ class ay implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zy b;
    public final /* synthetic */ TL_update.TL_updateNewMessage c;

    public /* synthetic */ ay(zy zyVar, TL_update.TL_updateNewMessage tL_updateNewMessage, int i7) {
        this.a = i7;
        this.b = zyVar;
        this.c = tL_updateNewMessage;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                mp messagesController = this.b.getMessagesController();
                TL_update.TL_updateNewMessage tL_updateNewMessage = this.c;
                messagesController.T3(tL_updateNewMessage.pts, -1, tL_updateNewMessage.pts_count);
                break;
            case 1:
                mp messagesController2 = this.b.getMessagesController();
                TL_update.TL_updateNewMessage tL_updateNewMessage2 = this.c;
                messagesController2.T3(tL_updateNewMessage2.pts, -1, tL_updateNewMessage2.pts_count);
                break;
            default:
                mp messagesController3 = this.b.getMessagesController();
                TL_update.TL_updateNewMessage tL_updateNewMessage3 = this.c;
                messagesController3.T3(tL_updateNewMessage3.pts, -1, tL_updateNewMessage3.pts_count);
                break;
        }
    }
}
