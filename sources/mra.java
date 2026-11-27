// default package

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class mra implements pcc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wua b;

    public /* synthetic */ mra(wua wuaVar, byte b) {
        this.a = b;
        this.b = wuaVar;
    }

    @Override // pcc
    public final void a(Object obj) {
        TLRPC.Message message;
        byte b = this.a;
        wua wuaVar = this.b;
        switch (b) {
            case 0:
                ((Boolean) obj).booleanValue();
                wuaVar.dismiss();
                break;
            case 1:
                if (((Boolean) obj).booleanValue()) {
                    wuaVar.O0 = true;
                }
                wuaVar.dismiss();
                break;
            case 2:
                TL_stars.starGiftUpgradePreview stargiftupgradepreview = (TL_stars.starGiftUpgradePreview) obj;
                if (stargiftupgradepreview != null) {
                    wuaVar.m3 = stargiftupgradepreview.sample_attributes;
                    wuaVar.n3 = stargiftupgradepreview.prices;
                    wuaVar.o3 = stargiftupgradepreview.next_prices;
                    wuaVar.f2();
                    break;
                } else {
                    wuaVar.getClass();
                    break;
                }
            default:
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                wuaVar.I2 = false;
                wuaVar.J2 = true;
                if (savedStarGift != null) {
                    wuaVar.k3 = Boolean.valueOf(savedStarGift.unsaved);
                    r47 r47Var = wuaVar.C2;
                    if (r47Var != null && (message = r47Var.k) != null) {
                        TLRPC.MessageAction messageAction = message.action;
                        if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                            TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
                            boolean z = tL_messageActionStarGiftUnique.saved;
                            boolean z2 = !savedStarGift.unsaved;
                            if (z != z2) {
                                tL_messageActionStarGiftUnique.saved = z2;
                            }
                        } else if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                            TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                            boolean z3 = tL_messageActionStarGift.saved;
                            boolean z4 = !savedStarGift.unsaved;
                            if (z3 != z4) {
                                tL_messageActionStarGift.saved = z4;
                            }
                        }
                        wuaVar.m2(r47Var, null);
                        break;
                    }
                }
                break;
        }
    }
}
