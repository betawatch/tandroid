package org.telegram.messenger;

import java.util.function.ToIntFunction;
import org.telegram.messenger.GiftAuctionController;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final /* synthetic */ class h4 implements ToIntFunction {
    public final /* synthetic */ int a;

    public /* synthetic */ h4(int i10) {
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
