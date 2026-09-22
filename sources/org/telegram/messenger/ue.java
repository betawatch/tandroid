package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public final /* synthetic */ class ue implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesStorage b;
    public final /* synthetic */ TLRPC.Message c;
    public final /* synthetic */ long d;

    public /* synthetic */ ue(int i10, long j3, MessagesStorage messagesStorage, TLRPC.Message message) {
        this.a = i10;
        this.b = messagesStorage;
        this.c = message;
        this.d = j3;
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
