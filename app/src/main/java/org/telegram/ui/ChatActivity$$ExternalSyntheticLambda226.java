package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;
/* loaded from: classes3.dex */
public final /* synthetic */ class ChatActivity$$ExternalSyntheticLambda226 implements RequestDelegate {
    public final /* synthetic */ ChatActivity f$0;
    public final /* synthetic */ TLObject f$1;

    public /* synthetic */ ChatActivity$$ExternalSyntheticLambda226(ChatActivity chatActivity, TLObject tLObject) {
        this.f$0 = chatActivity;
        this.f$1 = tLObject;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        this.f$0.lambda$createView$19(this.f$1, tLObject, tLRPC$TL_error);
    }
}
