package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes.dex */
public final /* synthetic */ class cj implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ SendMessagesHelper b;
    public final /* synthetic */ TLRPC.Updates c;

    public /* synthetic */ cj(SendMessagesHelper sendMessagesHelper, TLRPC.Updates updates, int i10) {
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
