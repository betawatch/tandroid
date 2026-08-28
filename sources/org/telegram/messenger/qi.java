package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class qi implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ SendMessagesHelper b;
    public final /* synthetic */ TL_update.TL_updateNewChannelMessage c;

    public /* synthetic */ qi(SendMessagesHelper sendMessagesHelper, TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage, int i9) {
        this.a = i9;
        this.b = sendMessagesHelper;
        this.c = tL_updateNewChannelMessage;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$performSendMessageRequest$92(this.c);
                break;
            default:
                this.b.lambda$performSendMessageRequestMulti$67(this.c);
                break;
        }
    }
}
