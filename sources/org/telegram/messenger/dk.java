package org.telegram.messenger;

import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes.dex */
public final /* synthetic */ class dk implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ SendMessagesHelper b;
    public final /* synthetic */ TLRPC.InputMedia c;
    public final /* synthetic */ SendMessagesHelper.DelayedMessage d;

    public /* synthetic */ dk(SendMessagesHelper sendMessagesHelper, TLRPC.InputMedia inputMedia, SendMessagesHelper.DelayedMessage delayedMessage, int i10) {
        this.a = i10;
        this.b = sendMessagesHelper;
        this.c = inputMedia;
        this.d = delayedMessage;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                this.b.lambda$uploadMultiMedia$60(this.c, this.d, tLObject, tL_error);
                break;
            default:
                this.b.lambda$performSendDelayedMessage$52(this.c, this.d, tLObject, tL_error);
                break;
        }
    }
}
