package bi;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class y3 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ h7 b;

    public /* synthetic */ y3(h7 h7Var, int i10) {
        this.a = i10;
        this.b = h7Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        TLRPC.Message message;
        switch (this.a) {
            case 0:
                h7 h7Var = this.b;
                h7Var.getClass();
                if (((Boolean) obj).booleanValue()) {
                    h7Var.skipDismissAnimation();
                }
                h7Var.dismiss();
                break;
            case 1:
                this.b.dismiss(((Boolean) obj).booleanValue());
                break;
            case 2:
                TL_stars.starGiftUpgradePreview stargiftupgradepreview = (TL_stars.starGiftUpgradePreview) obj;
                h7 h7Var2 = this.b;
                h7Var2.getClass();
                if (stargiftupgradepreview != null) {
                    h7Var2.o1 = stargiftupgradepreview.sample_attributes;
                    h7Var2.p1 = stargiftupgradepreview.prices;
                    h7Var2.q1 = stargiftupgradepreview.next_prices;
                    h7Var2.A2();
                    break;
                }
                break;
            default:
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                h7 h7Var3 = this.b;
                h7Var3.N0 = false;
                h7Var3.O0 = true;
                if (savedStarGift != null) {
                    h7Var3.m1 = Boolean.valueOf(savedStarGift.unsaved);
                    MessageObject messageObject = h7Var3.H0;
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
                        h7Var3.K2(messageObject, null);
                        break;
                    }
                }
                break;
        }
    }
}
