package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.tgnet.TLRPC$TL_messages_requestUrlAuth;
/* loaded from: classes3.dex */
public final /* synthetic */ class ChatActivity$$ExternalSyntheticLambda225 implements RequestDelegate {
    public final /* synthetic */ ChatActivity f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ TLRPC$TL_messages_requestUrlAuth f$2;
    public final /* synthetic */ boolean f$3;

    public /* synthetic */ ChatActivity$$ExternalSyntheticLambda225(ChatActivity chatActivity, String str, TLRPC$TL_messages_requestUrlAuth tLRPC$TL_messages_requestUrlAuth, boolean z) {
        this.f$0 = chatActivity;
        this.f$1 = str;
        this.f$2 = tLRPC$TL_messages_requestUrlAuth;
        this.f$3 = z;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        this.f$0.lambda$showRequestUrlAlert$232(this.f$1, this.f$2, this.f$3, tLObject, tLRPC$TL_error);
    }
}
