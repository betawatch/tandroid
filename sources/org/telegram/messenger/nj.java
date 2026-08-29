package org.telegram.messenger;

import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class nj implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ SendMessagesHelper b;
    public final /* synthetic */ TLObject c;
    public final /* synthetic */ TLRPC.InputMedia d;
    public final /* synthetic */ SendMessagesHelper.DelayedMessage e;

    public /* synthetic */ nj(SendMessagesHelper sendMessagesHelper, TLObject tLObject, TLRPC.InputMedia inputMedia, SendMessagesHelper.DelayedMessage delayedMessage, int i10) {
        this.a = i10;
        this.b = sendMessagesHelper;
        this.c = tLObject;
        this.d = inputMedia;
        this.e = delayedMessage;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$uploadMultiMedia$59(this.c, this.d, this.e);
                break;
            default:
                this.b.lambda$performSendDelayedMessage$51(this.c, this.d, this.e);
                break;
        }
    }
}
