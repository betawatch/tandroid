package fg;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.j90;
import qh.w5;
import qh.x5;
import qh.y5;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f0 implements h5.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ f0(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // h5.d
    public final void accept(Object obj) {
        TLRPC.ChatFull t12;
        switch (this.a) {
            case 0:
                v0 v0Var = (v0) this.b;
                j90 j90Var = (j90) this.c;
                TL_stories.TL_premium_myBoosts tL_premium_myBoosts = (TL_stories.TL_premium_myBoosts) this.d;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                v0Var.getClass();
                j90Var.setLoading(false);
                if (tL_premium_boostsStatus != null) {
                    v0Var.Y.boosts++;
                    if (v0Var.e0 == 32 && (t12 = v0Var.t1()) != null) {
                        t12.boosts_applied++;
                    }
                    v0Var.z1();
                    v0Var.F1(tL_premium_boostsStatus, v0Var.b0);
                    ChannelBoostsController.CanApplyBoost canApplyBoost = v0Var.Z;
                    canApplyBoost.isMaxLvl = v0Var.Y.next_level_boosts <= 0;
                    canApplyBoost.boostedNow = true;
                    canApplyBoost.setMyBoosts(tL_premium_myBoosts);
                    v0Var.B1();
                    break;
                }
                break;
            case 1:
                w5 w5Var = (w5) this.b;
                MessagesController messagesController = (MessagesController) this.c;
                String str = (String) this.d;
                Long l10 = (Long) obj;
                if (l10 != null) {
                    TLObject userOrChat = messagesController.getUserOrChat(l10.longValue());
                    if (!(userOrChat instanceof TLRPC.User)) {
                        if (userOrChat instanceof TLRPC.Chat) {
                            w5Var.run(new y5(str, (TLRPC.Chat) userOrChat));
                            break;
                        }
                    } else {
                        w5Var.run(new x5(str, (TLRPC.User) userOrChat));
                        break;
                    }
                } else {
                    w5Var.run(null);
                    break;
                }
                break;
            default:
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) this.b;
                Utilities.Callback callback = (Utilities.Callback) this.c;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) this.d;
                d2Var.dismiss();
                if (((Boolean) obj).booleanValue() && callback != null) {
                    callback.run(inputPeer);
                    break;
                }
                break;
        }
    }
}
