package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes.dex */
public final /* synthetic */ class e4 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Utilities.Callback b;

    public /* synthetic */ e4(int i10, Utilities.Callback callback) {
        this.a = i10;
        this.b = callback;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                GiftAuctionController.lambda$requestAuctionUpgrades$5(this.b, (TL_stars.starGiftUpgradeAttributes) obj, (TLRPC.TL_error) obj2);
                break;
            default:
                MediaDataController.lambda$searchStickerSets$250(this.b, (TLRPC.messages_FoundStickerSets) obj, (TLRPC.TL_error) obj2);
                break;
        }
    }
}
