package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes.dex */
public final /* synthetic */ class mb implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesController b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ long d;

    public /* synthetic */ mb(MessagesController messagesController, TLRPC.TL_error tL_error, long j3, int i10) {
        this.a = i10;
        this.b = messagesController;
        this.c = tL_error;
        this.d = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$loadFullChat$68(this.c, this.d);
                break;
            default:
                this.b.lambda$getChannelDifference$348(this.c, this.d);
                break;
        }
    }
}
