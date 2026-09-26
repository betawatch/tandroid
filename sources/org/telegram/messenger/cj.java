package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes.dex */
public final /* synthetic */ class cj implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ SendMessagesHelper b;
    public final /* synthetic */ TLRPC.Message c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ cj(SendMessagesHelper sendMessagesHelper, TLRPC.Message message, boolean z10, int i10) {
        this.a = i10;
        this.b = sendMessagesHelper;
        this.c = message;
        this.d = z10;
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
