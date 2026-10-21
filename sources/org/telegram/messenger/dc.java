package org.telegram.messenger;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes.dex */
public final /* synthetic */ class dc implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ MessagesController b;
    public final /* synthetic */ TLObject c;
    public final /* synthetic */ long d;

    public /* synthetic */ dc(MessagesController messagesController, long j10, TLObject tLObject) {
        this.b = messagesController;
        this.d = j10;
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

    public /* synthetic */ dc(MessagesController messagesController, TLObject tLObject, long j10) {
        this.b = messagesController;
        this.c = tLObject;
        this.d = j10;
    }
}
