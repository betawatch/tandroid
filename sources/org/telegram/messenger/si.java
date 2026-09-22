package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public final /* synthetic */ class si implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ SendMessagesHelper b;
    public final /* synthetic */ TLRPC.Message c;
    public final /* synthetic */ int d;

    public /* synthetic */ si(SendMessagesHelper sendMessagesHelper, TLRPC.Message message, int i10, int i11) {
        this.a = i11;
        this.b = sendMessagesHelper;
        this.c = message;
        this.d = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$performSendMessageRequest$102(this.c, this.d);
                break;
            default:
                this.b.lambda$sendMessage$15(this.c, this.d);
                break;
        }
    }
}
