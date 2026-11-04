package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ap implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ip b;

    public /* synthetic */ ap(ip ipVar, int i3) {
        this.a = i3;
        this.b = ipVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3 = this.a;
        ip ipVar = this.b;
        int i10 = 1;
        switch (i3) {
            case 0:
                TLRPC.User user = ipVar.w;
                fp fpVar = ipVar.Y0;
                if (fpVar != null) {
                    fpVar.b(0, ipVar.L ? ipVar.N : null, null, ipVar.T);
                }
                Bundle k10 = a1.g.k("scrollToTopOnResume", true);
                k10.putLong("chat_id", ipVar.x.id);
                if (!ipVar.getMessagesController().E(k10, ipVar, null, null)) {
                    ipVar.y0(false);
                    break;
                } else {
                    wm wmVar = new wm(k10);
                    ipVar.presentFragment(wmVar, true);
                    if (org.telegram.ui.Components.fc.a(wmVar)) {
                        boolean z10 = ipVar.a1;
                        if (!z10 || !ipVar.L) {
                            if (!z10 && !ipVar.M && ipVar.L) {
                                org.telegram.ui.Components.fc.C(user.first_name, wmVar).j();
                                break;
                            }
                        } else {
                            String str = user.first_name;
                            org.telegram.ui.Components.ib ibVar = new org.telegram.ui.Components.ib(wmVar.getParentActivity(), wmVar.ya);
                            ibVar.d(R.raw.ic_admin, "Shield");
                            org.telegram.messenger.k5.r("UserAddedAsAdminHint", null, 2131743778, new Object[]{str}, ibVar.b);
                            org.telegram.ui.Components.ac.g(wmVar, ibVar, 1500).j();
                            break;
                        }
                    }
                }
                break;
            case 1:
                ipVar.w0(false);
                break;
            default:
                if (ipVar.r) {
                    long j10 = ipVar.n;
                    org.telegram.ui.ActionBar.s1[] s1VarArr = {new org.telegram.ui.ActionBar.s1(3, ipVar.getParentActivity(), null)};
                    ipVar.getMessagesController().c5(ipVar.s, j10, true, false, true, new yf(s1VarArr, 2), new yf(s1VarArr, 3));
                    s1VarArr[0].r(300L);
                }
                fp fpVar2 = ipVar.Y0;
                if (fpVar2 != null) {
                    TLRPC.TL_chatAdminRights tL_chatAdminRights = ipVar.N;
                    if (!tL_chatAdminRights.change_info && !tL_chatAdminRights.post_messages && !tL_chatAdminRights.manage_direct_messages && !tL_chatAdminRights.manage_welcome_messages && !tL_chatAdminRights.edit_messages && !tL_chatAdminRights.delete_messages && !tL_chatAdminRights.ban_users && !tL_chatAdminRights.invite_users && ((!ipVar.H || !tL_chatAdminRights.manage_topics) && !tL_chatAdminRights.pin_messages && !tL_chatAdminRights.manage_ranks && !tL_chatAdminRights.add_admins && !tL_chatAdminRights.anonymous && !tL_chatAdminRights.manage_call && ((!ipVar.F || (!tL_chatAdminRights.post_stories && !tL_chatAdminRights.edit_stories && !tL_chatAdminRights.delete_stories)) && !tL_chatAdminRights.other))) {
                        i10 = 0;
                    }
                    fpVar2.b(i10, tL_chatAdminRights, ipVar.P, ipVar.T);
                    ipVar.finishFragment();
                    break;
                }
                break;
        }
    }
}
