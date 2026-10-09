package org.telegram.messenger;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final /* synthetic */ class dc implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ MessagesController b;
    public final /* synthetic */ TLObject c;
    public final /* synthetic */ long d;

    public /* synthetic */ dc(MessagesController messagesController, long j3, TLObject tLObject) {
        this.b = messagesController;
        this.d = j3;
        this.c = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$loadPeerSettings$78(this.d, this.c);
                break;
            default:
                this.b.lambda$deleteUserPhoto$113(this.c, this.d);
                break;
        }
    }

    public /* synthetic */ dc(MessagesController messagesController, TLObject tLObject, long j3) {
        this.b = messagesController;
        this.c = tLObject;
        this.d = j3;
    }
}
