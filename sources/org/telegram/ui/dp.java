package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class dp implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ mp b;

    public /* synthetic */ dp(mp mpVar, int i7) {
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
                jp jpVar = mpVar.Y0;
                if (jpVar != null) {
                    jpVar.b(0, mpVar.L ? mpVar.N : null, null, mpVar.T);
                }
                Bundle k10 = a8.p0.k("scrollToTopOnResume", true);
                k10.putLong("chat_id", mpVar.x.id);
                if (!mpVar.getMessagesController().E(k10, mpVar, null, null)) {
                    mpVar.y0(false);
                    break;
                } else {
                    an anVar = new an(k10);
                    mpVar.presentFragment(anVar, true);
                    if (org.telegram.ui.Components.cc.a(anVar)) {
                        boolean z10 = mpVar.a1;
                        if (!z10 || !mpVar.L) {
                            if (!z10 && !mpVar.M && mpVar.L) {
                                org.telegram.ui.Components.cc.C(user.first_name, anVar).j();
                                break;
                            }
                        } else {
                            String str = user.first_name;
                            org.telegram.ui.Components.fb fbVar = new org.telegram.ui.Components.fb(anVar.getParentActivity(), anVar.Aa);
                            fbVar.d(R.raw.ic_admin, "Shield");
                            org.telegram.messenger.k5.q("UserAddedAsAdminHint", null, 2131743768, new Object[]{str}, fbVar.b);
                            org.telegram.ui.Components.xb.g(anVar, fbVar, 1500).j();
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
                    org.telegram.ui.ActionBar.t1[] t1VarArr = {new org.telegram.ui.ActionBar.t1(3, mpVar.getParentActivity(), null)};
                    mpVar.getMessagesController().d5(mpVar.s, j3, true, false, true, new xf(t1VarArr, 2), new xf(t1VarArr, 3));
                    t1VarArr[0].r(300L);
                }
                jp jpVar2 = mpVar.Y0;
                if (jpVar2 != null) {
                    TLRPC.TL_chatAdminRights tL_chatAdminRights = mpVar.N;
                    if (!tL_chatAdminRights.change_info && !tL_chatAdminRights.post_messages && !tL_chatAdminRights.manage_direct_messages && !tL_chatAdminRights.manage_welcome_messages && !tL_chatAdminRights.edit_messages && !tL_chatAdminRights.delete_messages && !tL_chatAdminRights.ban_users && !tL_chatAdminRights.invite_users && ((!mpVar.H || !tL_chatAdminRights.manage_topics) && !tL_chatAdminRights.pin_messages && !tL_chatAdminRights.manage_ranks && !tL_chatAdminRights.add_admins && !tL_chatAdminRights.anonymous && !tL_chatAdminRights.manage_call && ((!mpVar.F || (!tL_chatAdminRights.post_stories && !tL_chatAdminRights.edit_stories && !tL_chatAdminRights.delete_stories)) && !tL_chatAdminRights.other))) {
                        i10 = 0;
                    }
                    jpVar2.b(i10, tL_chatAdminRights, mpVar.P, mpVar.T);
                    mpVar.finishFragment();
                    break;
                }
                break;
        }
    }
}
