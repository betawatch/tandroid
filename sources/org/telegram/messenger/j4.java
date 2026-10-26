package org.telegram.messenger;

import java.util.function.ToIntFunction;
import org.telegram.messenger.GiftAuctionController;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final /* synthetic */ class j4 implements ToIntFunction {
    public final /* synthetic */ int a;

    public /* synthetic */ j4(int i10) {
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
