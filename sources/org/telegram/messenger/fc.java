package org.telegram.messenger;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes.dex */
public final /* synthetic */ class fc implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ MessagesController b;
    public final /* synthetic */ TLObject c;
    public final /* synthetic */ long d;

    public /* synthetic */ fc(MessagesController messagesController, long j10, TLObject tLObject) {
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

    public /* synthetic */ fc(MessagesController messagesController, TLObject tLObject, long j10) {
        this.b = messagesController;
        this.c = tLObject;
        this.d = j10;
    }
}
