package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final /* synthetic */ class ve implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesStorage b;
    public final /* synthetic */ TLRPC.Message c;
    public final /* synthetic */ long d;

    public /* synthetic */ ve(int i10, long j10, MessagesStorage messagesStorage, TLRPC.Message message) {
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
