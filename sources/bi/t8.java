package bi;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.p90;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class t8 implements e2.h {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ t8(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // e2.h
    public final void accept(Object obj) {
        TLRPC.ChatFull t12;
        switch (this.a) {
            case 0:
                s8 s8Var = (s8) this.b;
                MessagesController messagesController = (MessagesController) this.c;
                String str = (String) this.d;
                Long l4 = (Long) obj;
                if (l4 != null) {
                    TLObject userOrChat = messagesController.getUserOrChat(l4.longValue());
                    if (!(userOrChat instanceof TLRPC.User)) {
                        if (userOrChat instanceof TLRPC.Chat) {
                            s8Var.run(new v8(str, (TLRPC.Chat) userOrChat));
                            break;
                        }
                    } else {
                        s8Var.run(new u8(str, (TLRPC.User) userOrChat));
                        break;
                    }
                } else {
                    s8Var.run(null);
                    break;
                }
                break;
            case 1:
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) this.b;
                Utilities.Callback callback = (Utilities.Callback) this.c;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) this.d;
                d2Var.dismiss();
                if (((Boolean) obj).booleanValue() && callback != null) {
                    callback.run(inputPeer);
                    break;
                }
                break;
            case 2:
                qg.k0 k0Var = (qg.k0) this.b;
                p90 p90Var = (p90) this.c;
                TL_stories.TL_premium_myBoosts tL_premium_myBoosts = (TL_stories.TL_premium_myBoosts) this.d;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                k0Var.getClass();
                p90Var.setLoading(false);
                if (tL_premium_boostsStatus != null) {
                    k0Var.b0.boosts++;
                    if (k0Var.h0 == 32 && (t12 = k0Var.t1()) != null) {
                        t12.boosts_applied++;
                    }
                    k0Var.z1();
                    k0Var.F1(tL_premium_boostsStatus, k0Var.e0);
                    ChannelBoostsController.CanApplyBoost canApplyBoost = k0Var.c0;
                    canApplyBoost.isMaxLvl = k0Var.b0.next_level_boosts <= 0;
                    canApplyBoost.boostedNow = true;
                    canApplyBoost.setMyBoosts(tL_premium_myBoosts);
                    k0Var.B1();
                    break;
                }
                break;
            default:
                ((u2.m0) obj).c(((a5.a) this.b).b, (u2.g0) this.c, (u2.c0) this.d);
                break;
        }
    }
}
