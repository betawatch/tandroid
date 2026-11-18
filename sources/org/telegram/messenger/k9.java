package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final /* synthetic */ class k9 implements q10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ c1 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ k9(c1 c1Var, Object obj, Object obj2, Object obj3, int i7) {
        this.a = i7;
        this.b = c1Var;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // org.telegram.messenger.q10
    public final void a(Object obj, Object obj2) {
        int i7 = this.a;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        c1 c1Var = this.b;
        switch (i7) {
            case 0:
                u9 u9Var = (u9) c1Var;
                bi.n nVar = (bi.n) obj5;
                r9 r9Var = (r9) obj4;
                TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = (TLRPC.TL_payments_getPaymentForm) obj3;
                TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error == null) {
                    if (!(paymentForm instanceof TLRPC.TL_payments_paymentFormStarGift)) {
                        nVar.a(Boolean.FALSE, "NO_PAYMENT_FORM");
                        r9Var.f = false;
                        break;
                    } else {
                        TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
                        tL_payments_sendStarsForm.form_id = ((TLRPC.TL_payments_paymentFormStarGift) paymentForm).form_id;
                        tL_payments_sendStarsForm.invoice = tL_payments_getPaymentForm.invoice;
                        u9Var.getConnectionsManager().sendRequestTyped(tL_payments_sendStarsForm, new d3.b(1), new l9(u9Var, r9Var, nVar));
                        break;
                    }
                } else {
                    nVar.a(Boolean.FALSE, tL_error.text);
                    r9Var.f = false;
                    break;
                }
            case 1:
                ri riVar = (ri) c1Var;
                pi piVar = (pi) obj5;
                qi qiVar = (qi) obj4;
                x10 x10Var = (x10) obj3;
                TLRPC.messages_FoundStickers messages_foundstickers = (TLRPC.messages_FoundStickers) obj;
                riVar.S1.remove(piVar);
                if (qiVar == null) {
                    qiVar = new qi();
                }
                ArrayList arrayList = qiVar.a;
                if (messages_foundstickers instanceof TLRPC.TL_messages_foundStickers) {
                    TLRPC.TL_messages_foundStickers tL_messages_foundStickers = (TLRPC.TL_messages_foundStickers) messages_foundstickers;
                    arrayList.addAll(tL_messages_foundStickers.stickers);
                    qiVar.b = (tL_messages_foundStickers.flags & 1) != 0 ? Integer.valueOf(tL_messages_foundStickers.next_offset) : null;
                }
                riVar.T1.put(piVar, qiVar);
                x10Var.a(arrayList);
                break;
            default:
                ri riVar2 = (ri) c1Var;
                x10 x10Var2 = (x10) obj4;
                TLRPC.InputStickerSet inputStickerSet = (TLRPC.InputStickerSet) obj3;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj2;
                riVar2.J0.remove((String) obj5);
                if (x10Var2 != null) {
                    x10Var2.a(tL_messages_stickerSet);
                }
                if (tL_messages_stickerSet != null) {
                    TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                    if (stickerSet != null) {
                        riVar2.J.k(tL_messages_stickerSet, stickerSet.id);
                        riVar2.O.put(tL_messages_stickerSet.set.short_name.toLowerCase(), tL_messages_stickerSet);
                        boolean z10 = inputStickerSet instanceof TLRPC.TL_inputStickerSetEmojiDefaultStatuses;
                        if (z10) {
                            riVar2.P = tL_messages_stickerSet;
                        }
                        if (z10) {
                            riVar2.Q = tL_messages_stickerSet;
                        }
                    }
                    riVar2.Z1(tL_messages_stickerSet);
                    riVar2.getNotificationCenter().k(64, Long.valueOf(tL_messages_stickerSet.set.id), tL_messages_stickerSet);
                    break;
                }
                break;
        }
    }
}
