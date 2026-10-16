package org.telegram.messenger;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final /* synthetic */ class gc implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ MessagesController b;
    public final /* synthetic */ TLObject c;
    public final /* synthetic */ long d;

    public /* synthetic */ gc(MessagesController messagesController, long j10, TLObject tLObject) {
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

    public /* synthetic */ gc(MessagesController messagesController, TLObject tLObject, long j10) {
        this.b = messagesController;
        this.c = tLObject;
        this.d = j10;
    }
}
