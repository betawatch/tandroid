package org.telegram.messenger;

import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes.dex */
public final /* synthetic */ class ei implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ SendMessagesHelper b;
    public final /* synthetic */ TLRPC.InputMedia c;
    public final /* synthetic */ SendMessagesHelper.DelayedMessage d;

    public /* synthetic */ ei(SendMessagesHelper sendMessagesHelper, TLRPC.InputMedia inputMedia, SendMessagesHelper.DelayedMessage delayedMessage, int i10) {
        this.a = i10;
        this.b = sendMessagesHelper;
        this.c = inputMedia;
        this.d = delayedMessage;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                this.b.lambda$performSendDelayedMessage$55(this.c, this.d, tLObject, tL_error);
                break;
            default:
                this.b.lambda$uploadMultiMedia$63(this.c, this.d, tLObject, tL_error);
                break;
        }
    }
}
