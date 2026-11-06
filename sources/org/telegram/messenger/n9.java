package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final /* synthetic */ class n9 implements v10 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ w9 b;
    public final /* synthetic */ t9 c;
    public final /* synthetic */ Object d;

    public /* synthetic */ n9(w9 w9Var, t9 t9Var, ii.g0 g0Var) {
        this.b = w9Var;
        this.c = t9Var;
        this.d = g0Var;
    }

    @Override // org.telegram.messenger.v10
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                w9 w9Var = this.b;
                t9 t9Var = this.c;
                ii.g0 g0Var = (ii.g0) this.d;
                TLRPC.payments_PaymentResult payments_paymentresult = (TLRPC.payments_PaymentResult) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                t9Var.f = false;
                if (!(payments_paymentresult instanceof TLRPC.TL_payments_paymentResult)) {
                    if (tL_error == null) {
                        g0Var.a(Boolean.FALSE, null);
                        break;
                    } else {
                        g0Var.a(Boolean.FALSE, tL_error.text);
                        break;
                    }
                } else {
                    Utilities.d.c(new b4(4, w9Var, (TLRPC.TL_payments_paymentResult) payments_paymentresult));
                    g0Var.a(Boolean.TRUE, null);
                    break;
                }
            default:
                w9 w9Var2 = this.b;
                c20 c20Var = (c20) this.d;
                t9 t9Var2 = this.c;
                TL_payments.TL_StarGiftAuctionAcquiredGifts tL_StarGiftAuctionAcquiredGifts = (TL_payments.TL_StarGiftAuctionAcquiredGifts) obj;
                if (tL_StarGiftAuctionAcquiredGifts != null) {
                    w9Var2.getMessagesController().Y3(tL_StarGiftAuctionAcquiredGifts.users, false);
                    w9Var2.getMessagesController().S3(tL_StarGiftAuctionAcquiredGifts.chats, false);
                    ArrayList<TL_stars.TL_StarGiftAuctionAcquiredGift> arrayList = tL_StarGiftAuctionAcquiredGifts.gifts;
                    t9Var2.g = arrayList;
                    c20Var.a(arrayList);
                    break;
                } else {
                    w9Var2.getClass();
                    c20Var.a(null);
                    break;
                }
        }
    }

    public /* synthetic */ n9(w9 w9Var, c20 c20Var, t9 t9Var) {
        this.b = w9Var;
        this.d = c20Var;
        this.c = t9Var;
    }
}
