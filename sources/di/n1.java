package di;

import org.telegram.messenger.gj;
import org.telegram.messenger.z10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class n1 implements z10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ c6 b;

    public /* synthetic */ n1(c6 c6Var, int i7) {
        this.a = i7;
        this.b = c6Var;
    }

    @Override // org.telegram.messenger.z10
    public final void a(Object obj) {
        TLRPC.Message message;
        switch (this.a) {
            case 0:
                ((Boolean) obj).booleanValue();
                this.b.dismiss();
                break;
            case 1:
                c6 c6Var = this.b;
                c6Var.getClass();
                if (((Boolean) obj).booleanValue()) {
                    c6Var.O0 = true;
                }
                c6Var.dismiss();
                break;
            case 2:
                TL_stars.starGiftUpgradePreview stargiftupgradepreview = (TL_stars.starGiftUpgradePreview) obj;
                c6 c6Var2 = this.b;
                c6Var2.getClass();
                if (stargiftupgradepreview != null) {
                    c6Var2.k3 = stargiftupgradepreview.sample_attributes;
                    c6Var2.l3 = stargiftupgradepreview.prices;
                    c6Var2.m3 = stargiftupgradepreview.next_prices;
                    c6Var2.b2();
                    break;
                }
                break;
            default:
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                c6 c6Var3 = this.b;
                c6Var3.J2 = false;
                c6Var3.K2 = true;
                if (savedStarGift != null) {
                    c6Var3.i3 = Boolean.valueOf(savedStarGift.unsaved);
                    gj gjVar = c6Var3.D2;
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
                        c6Var3.j2(gjVar, null);
                        break;
                    }
                }
                break;
        }
    }
}
