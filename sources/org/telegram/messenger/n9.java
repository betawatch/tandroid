package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.a80;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class n9 implements j20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ f1 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ n9(f1 f1Var, Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = f1Var;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // org.telegram.messenger.j20
    public final void a(Object obj, Object obj2) {
        int i10 = this.a;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        f1 f1Var = this.b;
        switch (i10) {
            case 0:
                x9 x9Var = (x9) f1Var;
                a80 a80Var = (a80) obj5;
                u9 u9Var = (u9) obj4;
                TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = (TLRPC.TL_payments_getPaymentForm) obj3;
                TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error == null) {
                    if (!(paymentForm instanceof TLRPC.TL_payments_paymentFormStarGift)) {
                        a80Var.a(Boolean.FALSE, "NO_PAYMENT_FORM");
                        u9Var.f = false;
                        break;
                    } else {
                        TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
                        tL_payments_sendStarsForm.form_id = ((TLRPC.TL_payments_paymentFormStarGift) paymentForm).form_id;
                        tL_payments_sendStarsForm.invoice = tL_payments_getPaymentForm.invoice;
                        x9Var.getConnectionsManager().sendRequestTyped(tL_payments_sendStarsForm, new a3.b(1), new o9(x9Var, u9Var, a80Var));
                        break;
                    }
                } else {
                    a80Var.a(Boolean.FALSE, tL_error.text);
                    u9Var.f = false;
                    break;
                }
            case 1:
                ui uiVar = (ui) f1Var;
                si siVar = (si) obj5;
                ti tiVar = (ti) obj4;
                q20 q20Var = (q20) obj3;
                TLRPC.messages_FoundStickers messages_foundstickers = (TLRPC.messages_FoundStickers) obj;
                uiVar.P1.remove(siVar);
                if (tiVar == null) {
                    tiVar = new ti();
                }
                ArrayList arrayList = tiVar.a;
                if (messages_foundstickers instanceof TLRPC.TL_messages_foundStickers) {
                    TLRPC.TL_messages_foundStickers tL_messages_foundStickers = (TLRPC.TL_messages_foundStickers) messages_foundstickers;
                    arrayList.addAll(tL_messages_foundStickers.stickers);
                    tiVar.b = (tL_messages_foundStickers.flags & 1) != 0 ? Integer.valueOf(tL_messages_foundStickers.next_offset) : null;
                }
                uiVar.Q1.put(siVar, tiVar);
                q20Var.a(arrayList);
                break;
            default:
                ui uiVar2 = (ui) f1Var;
                q20 q20Var2 = (q20) obj4;
                TLRPC.InputStickerSet inputStickerSet = (TLRPC.InputStickerSet) obj3;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj2;
                uiVar2.I0.remove((String) obj5);
                if (q20Var2 != null) {
                    q20Var2.a(tL_messages_stickerSet);
                }
                if (tL_messages_stickerSet != null) {
                    TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                    if (stickerSet != null) {
                        uiVar2.I.k(tL_messages_stickerSet, stickerSet.id);
                        uiVar2.N.put(tL_messages_stickerSet.set.short_name.toLowerCase(), tL_messages_stickerSet);
                        boolean z10 = inputStickerSet instanceof TLRPC.TL_inputStickerSetEmojiDefaultStatuses;
                        if (z10) {
                            uiVar2.O = tL_messages_stickerSet;
                        }
                        if (z10) {
                            uiVar2.P = tL_messages_stickerSet;
                        }
                    }
                    uiVar2.U1(tL_messages_stickerSet);
                    uiVar2.getNotificationCenter().k(64, Long.valueOf(tL_messages_stickerSet.set.id), tL_messages_stickerSet);
                    break;
                }
                break;
        }
    }
}
