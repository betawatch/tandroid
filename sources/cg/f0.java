package cg;

import nh.u6;
import nh.v6;
import nh.w6;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.b90;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f0 implements f5.d {
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

    @Override // f5.d
    public final void accept(Object obj) {
        TLRPC.ChatFull t12;
        switch (this.a) {
            case 0:
                v0 v0Var = (v0) this.b;
                b90 b90Var = (b90) this.c;
                TL_stories.TL_premium_myBoosts tL_premium_myBoosts = (TL_stories.TL_premium_myBoosts) this.d;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                v0Var.getClass();
                b90Var.setLoading(false);
                if (tL_premium_boostsStatus != null) {
                    v0Var.X.boosts++;
                    if (v0Var.d0 == 32 && (t12 = v0Var.t1()) != null) {
                        t12.boosts_applied++;
                    }
                    v0Var.z1();
                    v0Var.F1(tL_premium_boostsStatus, v0Var.a0);
                    ChannelBoostsController.CanApplyBoost canApplyBoost = v0Var.Y;
                    canApplyBoost.isMaxLvl = v0Var.X.next_level_boosts <= 0;
                    canApplyBoost.boostedNow = true;
                    canApplyBoost.setMyBoosts(tL_premium_myBoosts);
                    v0Var.B1();
                    break;
                }
                break;
            case 1:
                u6 u6Var = (u6) this.b;
                MessagesController messagesController = (MessagesController) this.c;
                String str = (String) this.d;
                Long l10 = (Long) obj;
                if (l10 != null) {
                    TLObject userOrChat = messagesController.getUserOrChat(l10.longValue());
                    if (!(userOrChat instanceof TLRPC.User)) {
                        if (userOrChat instanceof TLRPC.Chat) {
                            u6Var.run(new w6(str, (TLRPC.Chat) userOrChat));
                            break;
                        }
                    } else {
                        u6Var.run(new v6(str, (TLRPC.User) userOrChat));
                        break;
                    }
                } else {
                    u6Var.run(null);
                    break;
                }
                break;
            default:
                org.telegram.ui.ActionBar.c2 c2Var = (org.telegram.ui.ActionBar.c2) this.b;
                Utilities.Callback callback = (Utilities.Callback) this.c;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) this.d;
                c2Var.dismiss();
                if (((Boolean) obj).booleanValue() && callback != null) {
                    callback.run(inputPeer);
                    break;
                }
                break;
        }
    }
}
