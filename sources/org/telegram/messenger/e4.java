package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
                MediaDataController.lambda$searchStickerSets$249(this.b, (TLRPC.messages_FoundStickerSets) obj, (TLRPC.TL_error) obj2);
                break;
        }
    }
}
