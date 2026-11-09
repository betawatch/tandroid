package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class ep implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ mp b;

    public /* synthetic */ ep(mp mpVar, int i7) {
        this.a = i7;
        this.b = mpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        mp mpVar = this.b;
        int i10 = 1;
        switch (i7) {
            case 0:
                TLRPC.User user = mpVar.w;
                jp jpVar = mpVar.X0;
                if (jpVar != null) {
                    jpVar.b(0, mpVar.K ? mpVar.M : null, null, mpVar.S);
                }
                Bundle k10 = a8.p0.k("scrollToTopOnResume", true);
                k10.putLong("chat_id", mpVar.x.id);
                if (!mpVar.getMessagesController().E(k10, mpVar, null, null)) {
                    mpVar.y0(false);
                    break;
                } else {
                    cn cnVar = new cn(k10);
                    mpVar.presentFragment(cnVar, true);
                    if (org.telegram.ui.Components.hc.a(cnVar)) {
                        boolean z9 = mpVar.Z0;
                        if (!z9 || !mpVar.K) {
                            if (!z9 && !mpVar.L && mpVar.K) {
                                org.telegram.ui.Components.hc.C(user.first_name, cnVar).j();
                                break;
                            }
                        } else {
                            String str = user.first_name;
                            org.telegram.ui.Components.kb kbVar = new org.telegram.ui.Components.kb(cnVar.getParentActivity(), cnVar.za);
                            kbVar.d(R.raw.ic_admin, "Shield");
                            org.telegram.messenger.k5.r("UserAddedAsAdminHint", null, 2131743768, new Object[]{str}, kbVar.b);
                            org.telegram.ui.Components.cc.g(cnVar, kbVar, 1500).j();
                            break;
                        }
                    }
                }
                break;
            case 1:
                mpVar.w0(false);
                break;
            default:
                if (mpVar.r) {
                    long j3 = mpVar.n;
                    org.telegram.ui.ActionBar.u1[] u1VarArr = {new org.telegram.ui.ActionBar.u1(3, mpVar.getParentActivity(), null)};
                    mpVar.getMessagesController().c5(mpVar.s, j3, true, false, true, new ag(u1VarArr, 2), new ag(u1VarArr, 3));
                    u1VarArr[0].r(300L);
                }
                jp jpVar2 = mpVar.X0;
                if (jpVar2 != null) {
                    TLRPC.TL_chatAdminRights tL_chatAdminRights = mpVar.M;
                    if (!tL_chatAdminRights.change_info && !tL_chatAdminRights.post_messages && !tL_chatAdminRights.manage_direct_messages && !tL_chatAdminRights.manage_welcome_messages && !tL_chatAdminRights.edit_messages && !tL_chatAdminRights.delete_messages && !tL_chatAdminRights.ban_users && !tL_chatAdminRights.invite_users && ((!mpVar.G || !tL_chatAdminRights.manage_topics) && !tL_chatAdminRights.pin_messages && !tL_chatAdminRights.manage_ranks && !tL_chatAdminRights.add_admins && !tL_chatAdminRights.anonymous && !tL_chatAdminRights.manage_call && ((!mpVar.E || (!tL_chatAdminRights.post_stories && !tL_chatAdminRights.edit_stories && !tL_chatAdminRights.delete_stories)) && !tL_chatAdminRights.other))) {
                        i10 = 0;
                    }
                    jpVar2.b(i10, tL_chatAdminRights, mpVar.O, mpVar.S);
                    mpVar.finishFragment();
                    break;
                }
                break;
        }
    }
}
