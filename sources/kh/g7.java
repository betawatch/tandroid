package kh;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.o80;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class g7 implements d5.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ g7(Object obj, Object obj2, Object obj3, int i9) {
        this.a = i9;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // d5.d
    public final void accept(Object obj) {
        TLRPC.ChatFull t12;
        switch (this.a) {
            case 0:
                f7 f7Var = (f7) this.b;
                MessagesController messagesController = (MessagesController) this.c;
                String str = (String) this.d;
                Long l10 = (Long) obj;
                if (l10 != null) {
                    TLObject userOrChat = messagesController.getUserOrChat(l10.longValue());
                    if (!(userOrChat instanceof TLRPC.User)) {
                        if (userOrChat instanceof TLRPC.Chat) {
                            f7Var.run(new i7(str, (TLRPC.Chat) userOrChat));
                            break;
                        }
                    } else {
                        f7Var.run(new h7(str, (TLRPC.User) userOrChat));
                        break;
                    }
                } else {
                    f7Var.run(null);
                    break;
                }
                break;
            case 1:
                org.telegram.ui.ActionBar.c2 c2Var = (org.telegram.ui.ActionBar.c2) this.b;
                Utilities.Callback callback = (Utilities.Callback) this.c;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) this.d;
                c2Var.dismiss();
                if (((Boolean) obj).booleanValue() && callback != null) {
                    callback.run(inputPeer);
                    break;
                }
                break;
            default:
                zf.j0 j0Var = (zf.j0) this.b;
                o80 o80Var = (o80) this.c;
                TL_stories.TL_premium_myBoosts tL_premium_myBoosts = (TL_stories.TL_premium_myBoosts) this.d;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                j0Var.getClass();
                o80Var.setLoading(false);
                if (tL_premium_boostsStatus != null) {
                    j0Var.X.boosts++;
                    if (j0Var.d0 == 32 && (t12 = j0Var.t1()) != null) {
                        t12.boosts_applied++;
                    }
                    j0Var.z1();
                    j0Var.F1(tL_premium_boostsStatus, j0Var.a0);
                    ChannelBoostsController.CanApplyBoost canApplyBoost = j0Var.Y;
                    canApplyBoost.isMaxLvl = j0Var.X.next_level_boosts <= 0;
                    canApplyBoost.boostedNow = true;
                    canApplyBoost.setMyBoosts(tL_premium_myBoosts);
                    j0Var.B1();
                    break;
                }
                break;
        }
    }
}
