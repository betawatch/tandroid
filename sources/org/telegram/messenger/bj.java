package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes.dex */
public final /* synthetic */ class bj implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ SendMessagesHelper b;
    public final /* synthetic */ TLRPC.Updates c;

    public /* synthetic */ bj(SendMessagesHelper sendMessagesHelper, TLRPC.Updates updates, int i10) {
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
