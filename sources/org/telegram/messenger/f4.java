package org.telegram.messenger;

import java.util.function.ToIntFunction;
import org.telegram.messenger.GiftAuctionController;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public final /* synthetic */ class f4 implements ToIntFunction {
    public final /* synthetic */ int a;

    public /* synthetic */ f4(int i10) {
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
