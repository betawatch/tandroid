package bi;

import org.telegram.messenger.c20;
import org.telegram.messenger.ij;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y3 implements c20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ k7 b;

    public /* synthetic */ y3(k7 k7Var, int i7) {
        this.a = i7;
        this.b = k7Var;
    }

    @Override // org.telegram.messenger.c20
    public final void a(Object obj) {
        TLRPC.Message message;
        switch (this.a) {
            case 0:
                k7 k7Var = this.b;
                k7Var.getClass();
                if (((Boolean) obj).booleanValue()) {
                    k7Var.N0 = true;
                }
                k7Var.dismiss();
                break;
            case 1:
                ((Boolean) obj).booleanValue();
                this.b.dismiss();
                break;
            case 2:
                TL_stars.starGiftUpgradePreview stargiftupgradepreview = (TL_stars.starGiftUpgradePreview) obj;
                k7 k7Var2 = this.b;
                k7Var2.getClass();
                if (stargiftupgradepreview != null) {
                    k7Var2.g3 = stargiftupgradepreview.sample_attributes;
                    k7Var2.h3 = stargiftupgradepreview.prices;
                    k7Var2.i3 = stargiftupgradepreview.next_prices;
                    k7Var2.a2();
                    break;
                }
                break;
            default:
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                k7 k7Var3 = this.b;
                k7Var3.F2 = false;
                k7Var3.G2 = true;
                if (savedStarGift != null) {
                    k7Var3.e3 = Boolean.valueOf(savedStarGift.unsaved);
                    ij ijVar = k7Var3.z2;
                    if (ijVar != null && (message = ijVar.k) != null) {
                        TLRPC.MessageAction messageAction = message.action;
                        if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                            TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
                            boolean z9 = tL_messageActionStarGiftUnique.saved;
                            boolean z10 = !savedStarGift.unsaved;
                            if (z9 != z10) {
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
                        k7Var3.i2(ijVar, null);
                        break;
                    }
                }
                break;
        }
    }
}
