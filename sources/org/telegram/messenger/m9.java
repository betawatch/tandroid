package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final /* synthetic */ class m9 implements v10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ c1 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ m9(c1 c1Var, Object obj, Object obj2, Object obj3, int i7) {
        this.a = i7;
        this.b = c1Var;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // org.telegram.messenger.v10
    public final void a(Object obj, Object obj2) {
        int i7 = this.a;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        c1 c1Var = this.b;
        switch (i7) {
            case 0:
                w9 w9Var = (w9) c1Var;
                ii.g0 g0Var = (ii.g0) obj5;
                t9 t9Var = (t9) obj4;
                TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = (TLRPC.TL_payments_getPaymentForm) obj3;
                TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error == null) {
                    if (!(paymentForm instanceof TLRPC.TL_payments_paymentFormStarGift)) {
                        g0Var.a(Boolean.FALSE, "NO_PAYMENT_FORM");
                        t9Var.f = false;
                        break;
                    } else {
                        TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
                        tL_payments_sendStarsForm.form_id = ((TLRPC.TL_payments_paymentFormStarGift) paymentForm).form_id;
                        tL_payments_sendStarsForm.invoice = tL_payments_getPaymentForm.invoice;
                        w9Var.getConnectionsManager().sendRequestTyped(tL_payments_sendStarsForm, new d3.b(1), new n9(w9Var, t9Var, g0Var));
                        break;
                    }
                } else {
                    g0Var.a(Boolean.FALSE, tL_error.text);
                    t9Var.f = false;
                    break;
                }
            case 1:
                ui uiVar = (ui) c1Var;
                si siVar = (si) obj5;
                ti tiVar = (ti) obj4;
                c20 c20Var = (c20) obj3;
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
                c20Var.a(arrayList);
                break;
            default:
                ui uiVar2 = (ui) c1Var;
                c20 c20Var2 = (c20) obj4;
                TLRPC.InputStickerSet inputStickerSet = (TLRPC.InputStickerSet) obj3;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj2;
                uiVar2.I0.remove((String) obj5);
                if (c20Var2 != null) {
                    c20Var2.a(tL_messages_stickerSet);
                }
                if (tL_messages_stickerSet != null) {
                    TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                    if (stickerSet != null) {
                        uiVar2.I.k(tL_messages_stickerSet, stickerSet.id);
                        uiVar2.N.put(tL_messages_stickerSet.set.short_name.toLowerCase(), tL_messages_stickerSet);
                        boolean z9 = inputStickerSet instanceof TLRPC.TL_inputStickerSetEmojiDefaultStatuses;
                        if (z9) {
                            uiVar2.O = tL_messages_stickerSet;
                        }
                        if (z9) {
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
