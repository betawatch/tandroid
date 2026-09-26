package org.telegram.messenger;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes.dex */
public final /* synthetic */ class oc implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ MessagesController b;
    public final /* synthetic */ long c;
    public final /* synthetic */ TLObject d;

    public /* synthetic */ oc(MessagesController messagesController, long j3, TLObject tLObject) {
        this.b = messagesController;
        this.c = j3;
        this.d = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$deleteUserPhoto$114(this.d, this.c);
                break;
            default:
                this.b.lambda$loadPeerSettings$79(this.c, this.d);
                break;
        }
    }

    public /* synthetic */ oc(MessagesController messagesController, TLObject tLObject, long j3) {
        this.b = messagesController;
        this.d = tLObject;
        this.c = j3;
    }
}
