package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final /* synthetic */ class jj implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ SendMessagesHelper b;
    public final /* synthetic */ TLRPC.Updates c;

    public /* synthetic */ jj(SendMessagesHelper sendMessagesHelper, TLRPC.Updates updates, int i10) {
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
