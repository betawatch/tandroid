package org.telegram.messenger;

import org.telegram.tgnet.TLRPC$TL_messages_stickerSet;
/* loaded from: classes.dex */
public final /* synthetic */ class MediaDataController$$ExternalSyntheticLambda59 implements Runnable {
    public final /* synthetic */ MediaDataController f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ TLRPC$TL_messages_stickerSet f$2;

    public /* synthetic */ MediaDataController$$ExternalSyntheticLambda59(MediaDataController mediaDataController, String str, TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet) {
        this.f$0 = mediaDataController;
        this.f$1 = str;
        this.f$2 = tLRPC$TL_messages_stickerSet;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f$0.lambda$processLoadedDiceStickers$66(this.f$1, this.f$2);
    }
}
