package gh;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class z2 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ k5 b;

    public /* synthetic */ z2(k5 k5Var, int i9) {
        this.a = i9;
        this.b = k5Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        TLRPC.Message message;
        switch (this.a) {
            case 0:
                k5 k5Var = this.b;
                k5Var.getClass();
                if (((Boolean) obj).booleanValue()) {
                    k5Var.skipDismissAnimation();
                }
                k5Var.dismiss();
                break;
            case 1:
                TL_stars.starGiftUpgradePreview stargiftupgradepreview = (TL_stars.starGiftUpgradePreview) obj;
                k5 k5Var2 = this.b;
                k5Var2.getClass();
                if (stargiftupgradepreview != null) {
                    k5Var2.d1 = stargiftupgradepreview.sample_attributes;
                    k5Var2.e1 = stargiftupgradepreview.prices;
                    k5Var2.f1 = stargiftupgradepreview.next_prices;
                    k5Var2.b2();
                    break;
                }
                break;
            case 2:
                this.b.dismiss(((Boolean) obj).booleanValue());
                break;
            default:
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                k5 k5Var3 = this.b;
                k5Var3.G0 = false;
                k5Var3.H0 = true;
                if (savedStarGift != null) {
                    k5Var3.b1 = Boolean.valueOf(savedStarGift.unsaved);
                    MessageObject messageObject = k5Var3.A0;
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
                        k5Var3.i2(messageObject, null);
                        break;
                    }
                }
                break;
        }
    }
}
