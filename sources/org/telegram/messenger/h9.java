package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class h9 implements n10 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ q9 b;
    public final /* synthetic */ n9 c;
    public final /* synthetic */ Object d;

    public /* synthetic */ h9(q9 q9Var, n9 n9Var, ai.r rVar) {
        this.b = q9Var;
        this.c = n9Var;
        this.d = rVar;
    }

    @Override // org.telegram.messenger.n10
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                q9 q9Var = this.b;
                n9 n9Var = this.c;
                ai.r rVar = (ai.r) this.d;
                TLRPC.payments_PaymentResult payments_paymentresult = (TLRPC.payments_PaymentResult) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                n9Var.f = false;
                if (!(payments_paymentresult instanceof TLRPC.TL_payments_paymentResult)) {
                    if (tL_error == null) {
                        rVar.a(Boolean.FALSE, null);
                        break;
                    } else {
                        rVar.a(Boolean.FALSE, tL_error.text);
                        break;
                    }
                } else {
                    Utilities.d.c(new b4(4, q9Var, (TLRPC.TL_payments_paymentResult) payments_paymentresult));
                    rVar.a(Boolean.TRUE, null);
                    break;
                }
            default:
                q9 q9Var2 = this.b;
                u10 u10Var = (u10) this.d;
                n9 n9Var2 = this.c;
                TL_payments.TL_StarGiftAuctionAcquiredGifts tL_StarGiftAuctionAcquiredGifts = (TL_payments.TL_StarGiftAuctionAcquiredGifts) obj;
                if (tL_StarGiftAuctionAcquiredGifts != null) {
                    q9Var2.getMessagesController().Y3(tL_StarGiftAuctionAcquiredGifts.users, false);
                    q9Var2.getMessagesController().S3(tL_StarGiftAuctionAcquiredGifts.chats, false);
                    ArrayList<TL_stars.TL_StarGiftAuctionAcquiredGift> arrayList = tL_StarGiftAuctionAcquiredGifts.gifts;
                    n9Var2.g = arrayList;
                    u10Var.a(arrayList);
                    break;
                } else {
                    q9Var2.getClass();
                    u10Var.a(null);
                    break;
                }
        }
    }

    public /* synthetic */ h9(q9 q9Var, u10 u10Var, n9 n9Var) {
        this.b = q9Var;
        this.d = u10Var;
        this.c = n9Var;
    }
}
