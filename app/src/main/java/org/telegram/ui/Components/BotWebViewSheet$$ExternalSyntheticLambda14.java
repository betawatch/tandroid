package org.telegram.ui.Components;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;
/* loaded from: classes3.dex */
public final /* synthetic */ class BotWebViewSheet$$ExternalSyntheticLambda14 implements RequestDelegate {
    public final /* synthetic */ BotWebViewSheet f$0;

    public /* synthetic */ BotWebViewSheet$$ExternalSyntheticLambda14(BotWebViewSheet botWebViewSheet) {
        this.f$0 = botWebViewSheet;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        this.f$0.lambda$new$3(tLObject, tLRPC$TL_error);
    }
}
