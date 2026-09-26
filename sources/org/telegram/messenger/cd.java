package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes.dex */
public final /* synthetic */ class cd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesController b;
    public final /* synthetic */ TLRPC.TL_help_peerColors c;

    public /* synthetic */ cd(MessagesController messagesController, TLRPC.TL_help_peerColors tL_help_peerColors, int i10) {
        this.a = i10;
        this.b = messagesController;
        this.c = tL_help_peerColors;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$checkPeerColors$492(this.c);
                break;
            default:
                this.b.lambda$checkPeerColors$490(this.c);
                break;
        }
    }
}
