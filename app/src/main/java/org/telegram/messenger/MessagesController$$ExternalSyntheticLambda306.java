package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.tgnet.TLRPC$TL_messages_getMessagesViews;
/* loaded from: classes.dex */
public final /* synthetic */ class MessagesController$$ExternalSyntheticLambda306 implements RequestDelegate {
    public final /* synthetic */ MessagesController f$0;
    public final /* synthetic */ long f$1;
    public final /* synthetic */ TLRPC$TL_messages_getMessagesViews f$2;

    public /* synthetic */ MessagesController$$ExternalSyntheticLambda306(MessagesController messagesController, long j, TLRPC$TL_messages_getMessagesViews tLRPC$TL_messages_getMessagesViews) {
        this.f$0 = messagesController;
        this.f$1 = j;
        this.f$2 = tLRPC$TL_messages_getMessagesViews;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        this.f$0.lambda$updateTimerProc$125(this.f$1, this.f$2, tLObject, tLRPC$TL_error);
    }
}
