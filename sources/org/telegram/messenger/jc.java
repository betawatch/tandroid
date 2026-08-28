package org.telegram.messenger;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class jc implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ MessagesController b;
    public final /* synthetic */ long c;
    public final /* synthetic */ TLObject d;

    public /* synthetic */ jc(MessagesController messagesController, long j10, TLObject tLObject) {
        this.b = messagesController;
        this.c = j10;
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

    public /* synthetic */ jc(MessagesController messagesController, TLObject tLObject, long j10) {
        this.b = messagesController;
        this.d = tLObject;
        this.c = j10;
    }
}
