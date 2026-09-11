package org.telegram.messenger;

import java.util.function.ToIntFunction;
import org.telegram.messenger.GiftAuctionController;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final /* synthetic */ class b4 implements ToIntFunction {
    public final /* synthetic */ int a;

    public /* synthetic */ b4(int i10) {
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
