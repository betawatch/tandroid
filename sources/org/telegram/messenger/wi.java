package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final /* synthetic */ class wi implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ SendMessagesHelper b;
    public final /* synthetic */ TL_update.TL_updateNewMessage c;

    public /* synthetic */ wi(SendMessagesHelper sendMessagesHelper, TL_update.TL_updateNewMessage tL_updateNewMessage, int i10) {
        this.a = i10;
        this.b = sendMessagesHelper;
        this.c = tL_updateNewMessage;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$performSendMessageRequest$94(this.c);
                break;
            case 1:
                this.b.lambda$performSendMessageRequestMulti$69(this.c);
                break;
            default:
                this.b.lambda$completeSendingGramTransfer$5(this.c);
                break;
        }
    }
}
