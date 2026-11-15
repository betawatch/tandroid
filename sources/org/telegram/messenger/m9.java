package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final /* synthetic */ class m9 implements s10 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ v9 b;
    public final /* synthetic */ s9 c;
    public final /* synthetic */ Object d;

    public /* synthetic */ m9(v9 v9Var, s9 s9Var, bi.n nVar) {
        this.b = v9Var;
        this.c = s9Var;
        this.d = nVar;
    }

    @Override // org.telegram.messenger.s10
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                v9 v9Var = this.b;
                s9 s9Var = this.c;
                bi.n nVar = (bi.n) this.d;
                TLRPC.payments_PaymentResult payments_paymentresult = (TLRPC.payments_PaymentResult) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                s9Var.f = false;
                if (!(payments_paymentresult instanceof TLRPC.TL_payments_paymentResult)) {
                    if (tL_error == null) {
                        nVar.a(Boolean.FALSE, null);
                        break;
                    } else {
                        nVar.a(Boolean.FALSE, tL_error.text);
                        break;
                    }
                } else {
                    Utilities.d.c(new b4(4, v9Var, (TLRPC.TL_payments_paymentResult) payments_paymentresult));
                    nVar.a(Boolean.TRUE, null);
                    break;
                }
            default:
                v9 v9Var2 = this.b;
                z10 z10Var = (z10) this.d;
                s9 s9Var2 = this.c;
                TL_payments.TL_StarGiftAuctionAcquiredGifts tL_StarGiftAuctionAcquiredGifts = (TL_payments.TL_StarGiftAuctionAcquiredGifts) obj;
                if (tL_StarGiftAuctionAcquiredGifts != null) {
                    v9Var2.getMessagesController().Y3(tL_StarGiftAuctionAcquiredGifts.users, false);
                    v9Var2.getMessagesController().S3(tL_StarGiftAuctionAcquiredGifts.chats, false);
                    ArrayList<TL_stars.TL_StarGiftAuctionAcquiredGift> arrayList = tL_StarGiftAuctionAcquiredGifts.gifts;
                    s9Var2.g = arrayList;
                    z10Var.a(arrayList);
                    break;
                } else {
                    v9Var2.getClass();
                    z10Var.a(null);
                    break;
                }
        }
    }

    public /* synthetic */ m9(v9 v9Var, z10 z10Var, s9 s9Var) {
        this.b = v9Var;
        this.d = z10Var;
        this.c = s9Var;
    }
}
