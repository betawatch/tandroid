package di;

import org.telegram.messenger.gj;
import org.telegram.messenger.y10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n1 implements y10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ f6 b;

    public /* synthetic */ n1(f6 f6Var, int i7) {
        this.a = i7;
        this.b = f6Var;
    }

    @Override // org.telegram.messenger.y10
    public final void a(Object obj) {
        TLRPC.Message message;
        switch (this.a) {
            case 0:
                ((Boolean) obj).booleanValue();
                this.b.dismiss();
                break;
            case 1:
                f6 f6Var = this.b;
                f6Var.getClass();
                if (((Boolean) obj).booleanValue()) {
                    f6Var.O0 = true;
                }
                f6Var.dismiss();
                break;
            case 2:
                TL_stars.starGiftUpgradePreview stargiftupgradepreview = (TL_stars.starGiftUpgradePreview) obj;
                f6 f6Var2 = this.b;
                f6Var2.getClass();
                if (stargiftupgradepreview != null) {
                    f6Var2.n3 = stargiftupgradepreview.sample_attributes;
                    f6Var2.o3 = stargiftupgradepreview.prices;
                    f6Var2.p3 = stargiftupgradepreview.next_prices;
                    f6Var2.n2();
                    break;
                }
                break;
            default:
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                f6 f6Var3 = this.b;
                f6Var3.J2 = false;
                f6Var3.K2 = true;
                if (savedStarGift != null) {
                    f6Var3.l3 = Boolean.valueOf(savedStarGift.unsaved);
                    gj gjVar = f6Var3.D2;
                    if (gjVar != null && (message = gjVar.k) != null) {
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
                        f6Var3.v2(gjVar, null);
                        break;
                    }
                }
                break;
        }
    }
}
