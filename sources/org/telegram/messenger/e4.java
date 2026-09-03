package org.telegram.messenger;

import java.util.function.ToIntFunction;
import org.telegram.messenger.GiftAuctionController;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final /* synthetic */ class e4 implements ToIntFunction {
    public final /* synthetic */ int a;

    public /* synthetic */ e4(int i10) {
        this.a = i10;
    }

    @Override // java.util.function.ToIntFunction
    public final int applyAsInt(Object obj) {
        int lambda$updateActiveAuctions$13;
        switch (this.a) {
            case 0:
                lambda$updateActiveAuctions$13 = GiftAuctionController.lambda$updateActiveAuctions$13((GiftAuctionController.Auction) obj);
                return lambda$updateActiveAuctions$13;
            default:
                return Integer.parseInt((String) obj);
        }
    }
}
