package org.telegram.messenger;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
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
