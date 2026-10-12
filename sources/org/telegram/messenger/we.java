package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final /* synthetic */ class we implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesStorage b;
    public final /* synthetic */ TLRPC.Message c;
    public final /* synthetic */ long d;

    public /* synthetic */ we(int i10, long j10, MessagesStorage messagesStorage, TLRPC.Message message) {
        this.a = i10;
        this.b = messagesStorage;
        this.c = message;
        this.d = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$updateMessageCustomParams$110(this.c, this.d);
                break;
            default:
                this.b.lambda$markMessageAsSendErrorWithParams$210(this.c, this.d);
                break;
        }
    }
}
