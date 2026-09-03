package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final /* synthetic */ class kc implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesController b;
    public final /* synthetic */ TL_update.TL_updatePeerBlocked c;

    public /* synthetic */ kc(MessagesController messagesController, TL_update.TL_updatePeerBlocked tL_updatePeerBlocked, int i10) {
        this.a = i10;
        this.b = messagesController;
        this.c = tL_updatePeerBlocked;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$processUpdateArray$391(this.c);
                break;
            default:
                this.b.lambda$processUpdateArray$390(this.c);
                break;
        }
    }
}
