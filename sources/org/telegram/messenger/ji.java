package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class ji implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ SendMessagesHelper b;
    public final /* synthetic */ TLRPC.Message c;
    public final /* synthetic */ int d;

    public /* synthetic */ ji(SendMessagesHelper sendMessagesHelper, TLRPC.Message message, int i9, int i10) {
        this.a = i10;
        this.b = sendMessagesHelper;
        this.c = message;
        this.d = i9;
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
