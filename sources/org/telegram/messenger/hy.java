package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final /* synthetic */ class hy implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ gz b;
    public final /* synthetic */ TL_update.TL_updateNewMessage c;

    public /* synthetic */ hy(gz gzVar, TL_update.TL_updateNewMessage tL_updateNewMessage, int i7) {
        this.a = i7;
        this.b = gzVar;
        this.c = tL_updateNewMessage;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                qp messagesController = this.b.getMessagesController();
                TL_update.TL_updateNewMessage tL_updateNewMessage = this.c;
                messagesController.M3(tL_updateNewMessage.pts, -1, tL_updateNewMessage.pts_count);
                break;
            case 1:
                qp messagesController2 = this.b.getMessagesController();
                TL_update.TL_updateNewMessage tL_updateNewMessage2 = this.c;
                messagesController2.M3(tL_updateNewMessage2.pts, -1, tL_updateNewMessage2.pts_count);
                break;
            default:
                qp messagesController3 = this.b.getMessagesController();
                TL_update.TL_updateNewMessage tL_updateNewMessage3 = this.c;
                messagesController3.M3(tL_updateNewMessage3.pts, -1, tL_updateNewMessage3.pts_count);
                break;
        }
    }
}
