package org.telegram.messenger;

import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class y3 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ BaseController b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ y3(BaseController baseController, Object obj, Object obj2, Object obj3, int i9) {
        this.a = i9;
        this.b = baseController;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((GiftAuctionController) this.b).lambda$sendBid$9((Utilities.Callback2) this.c, (GiftAuctionController.AuctionInternal) this.d, (TLRPC.TL_payments_getPaymentForm) this.e, (TLRPC.PaymentForm) obj, (TLRPC.TL_error) obj2);
                break;
            case 1:
                ((MediaDataController) this.b).lambda$searchStickers$247((MediaDataController.SearchStickersKey) this.c, (MediaDataController.SearchStickersResult) this.d, (Utilities.Callback) this.e, (TLRPC.messages_FoundStickers) obj, (TLRPC.TL_error) obj2);
                break;
            default:
                ((MediaDataController) this.b).lambda$getStickerSet$38((String) this.c, (Utilities.Callback) this.d, (TLRPC.InputStickerSet) this.e, (Boolean) obj, (TLRPC.TL_messages_stickerSet) obj2);
                break;
        }
    }
}
