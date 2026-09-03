package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final /* synthetic */ class ej implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ SendMessagesHelper b;
    public final /* synthetic */ TLRPC.Updates c;

    public /* synthetic */ ej(SendMessagesHelper sendMessagesHelper, TLRPC.Updates updates, int i10) {
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
