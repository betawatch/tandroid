package ai;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final /* synthetic */ class i4 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ k7 b;

    public /* synthetic */ i4(k7 k7Var, int i10) {
        this.a = i10;
        this.b = k7Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        TLRPC.Message message;
        switch (this.a) {
            case 0:
                k7 k7Var = this.b;
                k7Var.getClass();
                if (((Boolean) obj).booleanValue()) {
                    k7Var.skipDismissAnimation();
                }
                k7Var.dismiss();
                break;
            case 1:
                this.b.dismiss(((Boolean) obj).booleanValue());
                break;
            case 2:
                TL_stars.starGiftUpgradePreview stargiftupgradepreview = (TL_stars.starGiftUpgradePreview) obj;
                k7 k7Var2 = this.b;
                k7Var2.getClass();
                if (stargiftupgradepreview != null) {
                    k7Var2.o1 = stargiftupgradepreview.sample_attributes;
                    k7Var2.p1 = stargiftupgradepreview.prices;
                    k7Var2.q1 = stargiftupgradepreview.next_prices;
                    k7Var2.u2();
                    break;
                }
                break;
            default:
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                k7 k7Var3 = this.b;
                k7Var3.N0 = false;
                k7Var3.O0 = true;
                if (savedStarGift != null) {
                    k7Var3.m1 = Boolean.valueOf(savedStarGift.unsaved);
                    MessageObject messageObject = k7Var3.H0;
                    if (messageObject != null && (message = messageObject.messageOwner) != null) {
                        TLRPC.MessageAction messageAction = message.action;
                        if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                            TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
                            boolean z10 = tL_messageActionStarGiftUnique.saved;
                            boolean z11 = !savedStarGift.unsaved;
                            if (z10 != z11) {
                                tL_messageActionStarGiftUnique.saved = z11;
                            }
                        } else if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                            TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                            boolean z12 = tL_messageActionStarGift.saved;
                            boolean z13 = !savedStarGift.unsaved;
                            if (z12 != z13) {
                                tL_messageActionStarGift.saved = z13;
                            }
                        }
                        k7Var3.E2(messageObject, null);
                        break;
                    }
                }
                break;
        }
    }
}
