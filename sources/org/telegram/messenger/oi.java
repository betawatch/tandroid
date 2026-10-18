package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public final /* synthetic */ class oi implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ SendMessagesHelper b;
    public final /* synthetic */ TLRPC.Message c;
    public final /* synthetic */ int d;

    public /* synthetic */ oi(SendMessagesHelper sendMessagesHelper, TLRPC.Message message, int i10, int i11) {
        this.a = i11;
        this.b = sendMessagesHelper;
        this.c = message;
        this.d = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$performSendMessageRequest$105(this.c, this.d);
                break;
            default:
                this.b.lambda$sendMessage$18(this.c, this.d);
                break;
        }
    }
}
