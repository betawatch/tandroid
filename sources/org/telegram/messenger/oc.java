package org.telegram.messenger;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
