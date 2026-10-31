package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.a80;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class o9 implements j20 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ x9 b;
    public final /* synthetic */ u9 c;
    public final /* synthetic */ Object d;

    public /* synthetic */ o9(x9 x9Var, u9 u9Var, a80 a80Var) {
        this.b = x9Var;
        this.c = u9Var;
        this.d = a80Var;
    }

    @Override // org.telegram.messenger.j20
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                x9 x9Var = this.b;
                u9 u9Var = this.c;
                a80 a80Var = (a80) this.d;
                TLRPC.payments_PaymentResult payments_paymentresult = (TLRPC.payments_PaymentResult) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                u9Var.f = false;
                if (!(payments_paymentresult instanceof TLRPC.TL_payments_paymentResult)) {
                    if (tL_error == null) {
                        a80Var.a(Boolean.FALSE, null);
                        break;
                    } else {
                        a80Var.a(Boolean.FALSE, tL_error.text);
                        break;
                    }
                } else {
                    Utilities.d.c(new e4(4, x9Var, (TLRPC.TL_payments_paymentResult) payments_paymentresult));
                    a80Var.a(Boolean.TRUE, null);
                    break;
                }
            default:
                x9 x9Var2 = this.b;
                q20 q20Var = (q20) this.d;
                u9 u9Var2 = this.c;
                TL_payments.TL_StarGiftAuctionAcquiredGifts tL_StarGiftAuctionAcquiredGifts = (TL_payments.TL_StarGiftAuctionAcquiredGifts) obj;
                if (tL_StarGiftAuctionAcquiredGifts != null) {
                    x9Var2.getMessagesController().V3(tL_StarGiftAuctionAcquiredGifts.users, false);
                    x9Var2.getMessagesController().P3(tL_StarGiftAuctionAcquiredGifts.chats, false);
                    ArrayList<TL_stars.TL_StarGiftAuctionAcquiredGift> arrayList = tL_StarGiftAuctionAcquiredGifts.gifts;
                    u9Var2.g = arrayList;
                    q20Var.a(arrayList);
                    break;
                } else {
                    x9Var2.getClass();
                    q20Var.a(null);
                    break;
                }
        }
    }

    public /* synthetic */ o9(x9 x9Var, q20 q20Var, u9 u9Var) {
        this.b = x9Var;
        this.d = q20Var;
        this.c = u9Var;
    }
}
