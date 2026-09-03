package org.telegram.messenger;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final /* synthetic */ class qc implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ MessagesController b;
    public final /* synthetic */ long c;
    public final /* synthetic */ TLObject d;

    public /* synthetic */ qc(MessagesController messagesController, long j10, TLObject tLObject) {
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

    public /* synthetic */ qc(MessagesController messagesController, TLObject tLObject, long j10) {
        this.b = messagesController;
        this.d = tLObject;
        this.c = j10;
    }
}
