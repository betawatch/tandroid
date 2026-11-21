package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final /* synthetic */ class l9 implements q10 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ u9 b;
    public final /* synthetic */ r9 c;
    public final /* synthetic */ Object d;

    public /* synthetic */ l9(u9 u9Var, r9 r9Var, bi.n nVar) {
        this.b = u9Var;
        this.c = r9Var;
        this.d = nVar;
    }

    @Override // org.telegram.messenger.q10
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                u9 u9Var = this.b;
                r9 r9Var = this.c;
                bi.n nVar = (bi.n) this.d;
                TLRPC.payments_PaymentResult payments_paymentresult = (TLRPC.payments_PaymentResult) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                r9Var.f = false;
                if (!(payments_paymentresult instanceof TLRPC.TL_payments_paymentResult)) {
                    if (tL_error == null) {
                        nVar.a(Boolean.FALSE, null);
                        break;
                    } else {
                        nVar.a(Boolean.FALSE, tL_error.text);
                        break;
                    }
                } else {
                    Utilities.d.c(new w3(4, u9Var, (TLRPC.TL_payments_paymentResult) payments_paymentresult));
                    nVar.a(Boolean.TRUE, null);
                    break;
                }
            default:
                u9 u9Var2 = this.b;
                x10 x10Var = (x10) this.d;
                r9 r9Var2 = this.c;
                TL_payments.TL_StarGiftAuctionAcquiredGifts tL_StarGiftAuctionAcquiredGifts = (TL_payments.TL_StarGiftAuctionAcquiredGifts) obj;
                if (tL_StarGiftAuctionAcquiredGifts != null) {
                    u9Var2.getMessagesController().f4(tL_StarGiftAuctionAcquiredGifts.users, false);
                    u9Var2.getMessagesController().Z3(tL_StarGiftAuctionAcquiredGifts.chats, false);
                    ArrayList<TL_stars.TL_StarGiftAuctionAcquiredGift> arrayList = tL_StarGiftAuctionAcquiredGifts.gifts;
                    r9Var2.g = arrayList;
                    x10Var.a(arrayList);
                    break;
                } else {
                    u9Var2.getClass();
                    x10Var.a(null);
                    break;
                }
        }
    }

    public /* synthetic */ l9(u9 u9Var, x10 x10Var, r9 r9Var) {
        this.b = u9Var;
        this.d = x10Var;
        this.c = r9Var;
    }
}
