package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class nb implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesController b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ long d;

    public /* synthetic */ nb(MessagesController messagesController, TLRPC.TL_error tL_error, long j10, int i10) {
        this.a = i10;
        this.b = messagesController;
        this.c = tL_error;
        this.d = j10;
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
