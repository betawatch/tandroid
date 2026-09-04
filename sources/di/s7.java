package di;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.g90;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public final /* synthetic */ class s7 implements e2.h {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ s7(Object obj, Object obj2, Object obj3, int i10) {
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
                r7 r7Var = (r7) this.b;
                MessagesController messagesController = (MessagesController) this.c;
                String str = (String) this.d;
                Long l4 = (Long) obj;
                if (l4 != null) {
                    TLObject userOrChat = messagesController.getUserOrChat(l4.longValue());
                    if (!(userOrChat instanceof TLRPC.User)) {
                        if (userOrChat instanceof TLRPC.Chat) {
                            r7Var.run(new u7(str, (TLRPC.Chat) userOrChat));
                            break;
                        }
                    } else {
                        r7Var.run(new t7(str, (TLRPC.User) userOrChat));
                        break;
                    }
                } else {
                    r7Var.run(null);
                    break;
                }
                break;
            case 1:
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) this.b;
                Utilities.Callback callback = (Utilities.Callback) this.c;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) this.d;
                b2Var.dismiss();
                if (((Boolean) obj).booleanValue() && callback != null) {
                    callback.run(inputPeer);
                    break;
                }
                break;
            case 2:
                sg.k0 k0Var = (sg.k0) this.b;
                g90 g90Var = (g90) this.c;
                TL_stories.TL_premium_myBoosts tL_premium_myBoosts = (TL_stories.TL_premium_myBoosts) this.d;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                k0Var.getClass();
                g90Var.setLoading(false);
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
                ((u2.k0) obj).c(((a5.a) this.b).b, (u2.f0) this.c, (u2.b0) this.d);
                break;
        }
    }
}
