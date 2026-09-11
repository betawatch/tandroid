package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final /* synthetic */ class aj implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ SendMessagesHelper b;
    public final /* synthetic */ TLRPC.Updates c;

    public /* synthetic */ aj(SendMessagesHelper sendMessagesHelper, TLRPC.Updates updates, int i10) {
        this.a = i10;
        this.b = sendMessagesHelper;
        this.c = updates;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$performSendMessageRequest$94(this.c);
                break;
            default:
                this.b.lambda$performSendMessageRequestMulti$72(this.c);
                break;
        }
    }
}
