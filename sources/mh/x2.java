package mh;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final /* synthetic */ class x2 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ g5 b;

    public /* synthetic */ x2(g5 g5Var, int i10) {
        this.a = i10;
        this.b = g5Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        TLRPC.Message message;
        switch (this.a) {
            case 0:
                g5 g5Var = this.b;
                g5Var.getClass();
                if (((Boolean) obj).booleanValue()) {
                    g5Var.skipDismissAnimation();
                }
                g5Var.dismiss();
                break;
            case 1:
                TL_stars.starGiftUpgradePreview stargiftupgradepreview = (TL_stars.starGiftUpgradePreview) obj;
                g5 g5Var2 = this.b;
                g5Var2.getClass();
                if (stargiftupgradepreview != null) {
                    g5Var2.e1 = stargiftupgradepreview.sample_attributes;
                    g5Var2.f1 = stargiftupgradepreview.prices;
                    g5Var2.g1 = stargiftupgradepreview.next_prices;
                    g5Var2.b2();
                    break;
                }
                break;
            case 2:
                this.b.dismiss(((Boolean) obj).booleanValue());
                break;
            default:
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                g5 g5Var3 = this.b;
                g5Var3.H0 = false;
                g5Var3.I0 = true;
                if (savedStarGift != null) {
                    g5Var3.c1 = Boolean.valueOf(savedStarGift.unsaved);
                    MessageObject messageObject = g5Var3.B0;
                    if (messageObject != null && (message = messageObject.messageOwner) != null) {
                        TLRPC.MessageAction messageAction = message.action;
                        if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                            TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
                            boolean z4 = tL_messageActionStarGiftUnique.saved;
                            boolean z10 = !savedStarGift.unsaved;
                            if (z4 != z10) {
                                tL_messageActionStarGiftUnique.saved = z10;
                            }
                        } else if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                            TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                            boolean z11 = tL_messageActionStarGift.saved;
                            boolean z12 = !savedStarGift.unsaved;
                            if (z11 != z12) {
                                tL_messageActionStarGift.saved = z12;
                            }
                        }
                        g5Var3.i2(messageObject, null);
                        break;
                    }
                }
                break;
        }
    }
}
