package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class ry implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qz b;
    public final /* synthetic */ TL_update.TL_updateNewMessage c;

    public /* synthetic */ ry(qz qzVar, TL_update.TL_updateNewMessage tL_updateNewMessage, int i10) {
        this.a = i10;
        this.b = qzVar;
        this.c = tL_updateNewMessage;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                vp messagesController = this.b.getMessagesController();
                TL_update.TL_updateNewMessage tL_updateNewMessage = this.c;
                messagesController.J3(tL_updateNewMessage.pts, -1, tL_updateNewMessage.pts_count);
                break;
            case 1:
                vp messagesController2 = this.b.getMessagesController();
                TL_update.TL_updateNewMessage tL_updateNewMessage2 = this.c;
                messagesController2.J3(tL_updateNewMessage2.pts, -1, tL_updateNewMessage2.pts_count);
                break;
            default:
                vp messagesController3 = this.b.getMessagesController();
                TL_update.TL_updateNewMessage tL_updateNewMessage3 = this.c;
                messagesController3.J3(tL_updateNewMessage3.pts, -1, tL_updateNewMessage3.pts_count);
                break;
        }
    }
}
