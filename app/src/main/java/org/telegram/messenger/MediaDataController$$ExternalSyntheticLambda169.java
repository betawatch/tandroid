package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;
/* loaded from: classes.dex */
public final /* synthetic */ class MediaDataController$$ExternalSyntheticLambda169 implements RequestDelegate {
    public final /* synthetic */ MediaDataController f$0;
    public final /* synthetic */ String f$1;

    public /* synthetic */ MediaDataController$$ExternalSyntheticLambda169(MediaDataController mediaDataController, String str) {
        this.f$0 = mediaDataController;
        this.f$1 = str;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        this.f$0.lambda$verifyAnimatedStickerMessageInternal$54(this.f$1, tLObject, tLRPC$TL_error);
    }
}
