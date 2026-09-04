package org.telegram.messenger;

import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final /* synthetic */ class y3 implements Utilities.Callback2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ GiftAuctionController b;
    public final /* synthetic */ GiftAuctionController.AuctionInternal c;
    public final /* synthetic */ Object d;

    public /* synthetic */ y3(GiftAuctionController giftAuctionController, GiftAuctionController.AuctionInternal auctionInternal, Utilities.Callback2 callback2) {
        this.b = giftAuctionController;
        this.c = auctionInternal;
        this.d = callback2;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                this.b.lambda$sendBid$8(this.c, (Utilities.Callback2) this.d, (TLRPC.payments_PaymentResult) obj, (TLRPC.TL_error) obj2);
                break;
            default:
                this.b.lambda$getOrRequestAcquiredGifts$11((Utilities.Callback) this.d, this.c, (TL_payments.TL_StarGiftAuctionAcquiredGifts) obj, (TLRPC.TL_error) obj2);
                break;
        }
    }

    public /* synthetic */ y3(GiftAuctionController giftAuctionController, Utilities.Callback callback, GiftAuctionController.AuctionInternal auctionInternal) {
        this.b = giftAuctionController;
        this.d = callback;
        this.c = auctionInternal;
    }
}
