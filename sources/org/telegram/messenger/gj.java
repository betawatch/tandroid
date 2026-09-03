package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final /* synthetic */ class gj implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ SendMessagesHelper b;
    public final /* synthetic */ TLRPC.Message c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ gj(SendMessagesHelper sendMessagesHelper, TLRPC.Message message, boolean z4, int i10) {
        this.a = i10;
        this.b = sendMessagesHelper;
        this.c = message;
        this.d = z4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$putToSendingMessages$61(this.c, this.d);
                break;
            case 1:
                this.b.lambda$performSendMessageRequest$84(this.c, this.d);
                break;
            default:
                this.b.lambda$performSendMessageRequest$87(this.c, this.d);
                break;
        }
    }
}
