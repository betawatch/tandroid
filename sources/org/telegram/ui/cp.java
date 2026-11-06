package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cp implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ kp b;

    public /* synthetic */ cp(kp kpVar, int i7) {
        this.a = i7;
        this.b = kpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        kp kpVar = this.b;
        int i10 = 1;
        switch (i7) {
            case 0:
                TLRPC.User user = kpVar.w;
                hp hpVar = kpVar.X0;
                if (hpVar != null) {
                    hpVar.b(0, kpVar.K ? kpVar.M : null, null, kpVar.S);
                }
                Bundle k10 = a8.p0.k("scrollToTopOnResume", true);
                k10.putLong("chat_id", kpVar.x.id);
                if (!kpVar.getMessagesController().E(k10, kpVar, null, null)) {
                    kpVar.y0(false);
                    break;
                } else {
                    an anVar = new an(k10);
                    kpVar.presentFragment(anVar, true);
                    if (org.telegram.ui.Components.hc.a(anVar)) {
                        boolean z9 = kpVar.Z0;
                        if (!z9 || !kpVar.K) {
                            if (!z9 && !kpVar.L && kpVar.K) {
                                org.telegram.ui.Components.hc.C(user.first_name, anVar).j();
                                break;
                            }
                        } else {
                            String str = user.first_name;
                            org.telegram.ui.Components.kb kbVar = new org.telegram.ui.Components.kb(anVar.getParentActivity(), anVar.xa);
                            kbVar.d(R.raw.ic_admin, "Shield");
                            org.telegram.messenger.k5.r("UserAddedAsAdminHint", null, 2131743769, new Object[]{str}, kbVar.b);
                            org.telegram.ui.Components.cc.g(anVar, kbVar, 1500).j();
                            break;
                        }
                    }
                }
                break;
            case 1:
                kpVar.w0(false);
                break;
            default:
                if (kpVar.r) {
                    long j3 = kpVar.n;
                    org.telegram.ui.ActionBar.u1[] u1VarArr = {new org.telegram.ui.ActionBar.u1(3, kpVar.getParentActivity(), null)};
                    kpVar.getMessagesController().c5(kpVar.s, j3, true, false, true, new cg(u1VarArr, 2), new cg(u1VarArr, 3));
                    u1VarArr[0].r(300L);
                }
                hp hpVar2 = kpVar.X0;
                if (hpVar2 != null) {
                    TLRPC.TL_chatAdminRights tL_chatAdminRights = kpVar.M;
                    if (!tL_chatAdminRights.change_info && !tL_chatAdminRights.post_messages && !tL_chatAdminRights.manage_direct_messages && !tL_chatAdminRights.manage_welcome_messages && !tL_chatAdminRights.edit_messages && !tL_chatAdminRights.delete_messages && !tL_chatAdminRights.ban_users && !tL_chatAdminRights.invite_users && ((!kpVar.G || !tL_chatAdminRights.manage_topics) && !tL_chatAdminRights.pin_messages && !tL_chatAdminRights.manage_ranks && !tL_chatAdminRights.add_admins && !tL_chatAdminRights.anonymous && !tL_chatAdminRights.manage_call && ((!kpVar.E || (!tL_chatAdminRights.post_stories && !tL_chatAdminRights.edit_stories && !tL_chatAdminRights.delete_stories)) && !tL_chatAdminRights.other))) {
                        i10 = 0;
                    }
                    hpVar2.b(i10, tL_chatAdminRights, kpVar.O, kpVar.S);
                    kpVar.finishFragment();
                    break;
                }
                break;
        }
    }
}
