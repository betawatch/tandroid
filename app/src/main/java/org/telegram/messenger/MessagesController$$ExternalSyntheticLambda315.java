package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;
/* loaded from: classes.dex */
public final /* synthetic */ class MessagesController$$ExternalSyntheticLambda315 implements RequestDelegate {
    public final /* synthetic */ MessagesController f$0;
    public final /* synthetic */ Runnable f$1;
    public final /* synthetic */ Runnable f$2;

    public /* synthetic */ MessagesController$$ExternalSyntheticLambda315(MessagesController messagesController, Runnable runnable, Runnable runnable2) {
        this.f$0 = messagesController;
        this.f$1 = runnable;
        this.f$2 = runnable2;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        this.f$0.lambda$toggleChatJoinRequest$231(this.f$1, this.f$2, tLObject, tLRPC$TL_error);
    }
}
