package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final /* synthetic */ class mi implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ SendMessagesHelper b;
    public final /* synthetic */ TLRPC.Updates c;
    public final /* synthetic */ TLRPC.Message d;
    public final /* synthetic */ boolean e;

    public /* synthetic */ mi(SendMessagesHelper sendMessagesHelper, TLRPC.Updates updates, TLRPC.Message message, boolean z4, int i10) {
        this.a = i10;
        this.b = sendMessagesHelper;
        this.c = updates;
        this.d = message;
        this.e = z4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$performSendMessageRequest$88(this.c, this.d, this.e);
                break;
            default:
                this.b.lambda$performSendMessageRequest$85(this.c, this.d, this.e);
                break;
        }
    }
}
