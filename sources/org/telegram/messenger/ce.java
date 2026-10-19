package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes.dex */
public final /* synthetic */ class ce implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesController b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ long d;

    public /* synthetic */ ce(MessagesController messagesController, TLRPC.TL_error tL_error, long j10, int i10) {
        this.a = i10;
        this.b = messagesController;
        this.c = tL_error;
        this.d = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$loadFullChat$67(this.c, this.d);
                break;
            default:
                this.b.lambda$getChannelDifference$347(this.c, this.d);
                break;
        }
    }
}
