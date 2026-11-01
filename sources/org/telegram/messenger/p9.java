package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.z70;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class p9 implements k20 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ y9 b;
    public final /* synthetic */ v9 c;
    public final /* synthetic */ Object d;

    public /* synthetic */ p9(y9 y9Var, v9 v9Var, z70 z70Var) {
        this.b = y9Var;
        this.c = v9Var;
        this.d = z70Var;
    }

    @Override // org.telegram.messenger.k20
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                y9 y9Var = this.b;
                v9 v9Var = this.c;
                z70 z70Var = (z70) this.d;
                TLRPC.payments_PaymentResult payments_paymentresult = (TLRPC.payments_PaymentResult) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                v9Var.f = false;
                if (!(payments_paymentresult instanceof TLRPC.TL_payments_paymentResult)) {
                    if (tL_error == null) {
                        z70Var.a(Boolean.FALSE, null);
                        break;
                    } else {
                        z70Var.a(Boolean.FALSE, tL_error.text);
                        break;
                    }
                } else {
                    Utilities.d.c(new e4(4, y9Var, (TLRPC.TL_payments_paymentResult) payments_paymentresult));
                    z70Var.a(Boolean.TRUE, null);
                    break;
                }
            default:
                y9 y9Var2 = this.b;
                r20 r20Var = (r20) this.d;
                v9 v9Var2 = this.c;
                TL_payments.TL_StarGiftAuctionAcquiredGifts tL_StarGiftAuctionAcquiredGifts = (TL_payments.TL_StarGiftAuctionAcquiredGifts) obj;
                if (tL_StarGiftAuctionAcquiredGifts != null) {
                    y9Var2.getMessagesController().V3(tL_StarGiftAuctionAcquiredGifts.users, false);
                    y9Var2.getMessagesController().P3(tL_StarGiftAuctionAcquiredGifts.chats, false);
                    ArrayList<TL_stars.TL_StarGiftAuctionAcquiredGift> arrayList = tL_StarGiftAuctionAcquiredGifts.gifts;
                    v9Var2.g = arrayList;
                    r20Var.a(arrayList);
                    break;
                } else {
                    y9Var2.getClass();
                    r20Var.a(null);
                    break;
                }
        }
    }

    public /* synthetic */ p9(y9 y9Var, r20 r20Var, v9 v9Var) {
        this.b = y9Var;
        this.d = r20Var;
        this.c = v9Var;
    }
}
