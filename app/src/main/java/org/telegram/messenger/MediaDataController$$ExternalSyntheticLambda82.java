package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$Document;
/* loaded from: classes.dex */
public final /* synthetic */ class MediaDataController$$ExternalSyntheticLambda82 implements Runnable {
    public final /* synthetic */ MediaDataController f$0;
    public final /* synthetic */ TLObject f$1;
    public final /* synthetic */ TLRPC$Document f$2;

    public /* synthetic */ MediaDataController$$ExternalSyntheticLambda82(MediaDataController mediaDataController, TLObject tLObject, TLRPC$Document tLRPC$Document) {
        this.f$0 = mediaDataController;
        this.f$1 = tLObject;
        this.f$2 = tLRPC$Document;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f$0.lambda$saveToRingtones$163(this.f$1, this.f$2);
    }
}
