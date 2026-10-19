package org.telegram.messenger;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes.dex */
public final /* synthetic */ class bc implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ MessagesController b;
    public final /* synthetic */ TLObject c;
    public final /* synthetic */ long d;

    public /* synthetic */ bc(MessagesController messagesController, long j10, TLObject tLObject) {
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

    public /* synthetic */ bc(MessagesController messagesController, TLObject tLObject, long j10) {
        this.b = messagesController;
        this.c = tLObject;
        this.d = j10;
    }
}
