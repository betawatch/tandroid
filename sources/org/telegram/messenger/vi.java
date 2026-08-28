package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class vi implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ SendMessagesHelper b;
    public final /* synthetic */ TLRPC.Message c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ vi(SendMessagesHelper sendMessagesHelper, TLRPC.Message message, boolean z10, int i9) {
        this.a = i9;
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
