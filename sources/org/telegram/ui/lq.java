package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class lq implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ tq b;

    public /* synthetic */ lq(tq tqVar, int i10) {
        this.a = i10;
        this.b = tqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        tq tqVar = this.b;
        int i11 = 1;
        switch (i10) {
            case 0:
                TLRPC.User user = tqVar.v;
                qq qqVar = tqVar.X0;
                if (qqVar != null) {
                    qqVar.b(0, tqVar.K ? tqVar.M : null, null, tqVar.S);
                }
                Bundle h = a1.g.h("scrollToTopOnResume", true);
                h.putLong("chat_id", tqVar.w.id);
                if (!tqVar.getMessagesController().checkCanOpenChat(h, tqVar)) {
                    tqVar.t0(false);
                    break;
                } else {
                    fo foVar = new fo(h);
                    tqVar.presentFragment(foVar, true);
                    if (org.telegram.ui.Components.zc.a(foVar)) {
                        boolean z10 = tqVar.Z0;
                        if (!z10 || !tqVar.K) {
                            if (!z10 && !tqVar.L && tqVar.K) {
                                org.telegram.ui.Components.zc.C(foVar, user.first_name).j();
                                break;
                            }
                        } else {
                            String str = user.first_name;
                            org.telegram.ui.Components.ac acVar = new org.telegram.ui.Components.ac(foVar.getParentActivity(), foVar.ea);
                            acVar.d(R.raw.ic_admin, "Shield");
                            acVar.b.setText(AndroidUtilities.replaceTags(LocaleController.formatString("UserAddedAsAdminHint", R.string.UserAddedAsAdminHint, str)));
                            org.telegram.ui.Components.sc.g(foVar, acVar, 1500).j();
                            break;
                        }
                    }
                }
                break;
            case 1:
                tqVar.r0(false);
                break;
            default:
                if (tqVar.r) {
                    long j10 = tqVar.n;
                    org.telegram.ui.ActionBar.a2[] a2VarArr = {new org.telegram.ui.ActionBar.a2(tqVar.getParentActivity(), 3, null)};
                    tqVar.getMessagesController().toggleChatJoinRequest(tqVar.s, j10, true, false, true, new ah(a2VarArr, 2), new ah(a2VarArr, 3));
                    a2VarArr[0].q(300L);
                }
                qq qqVar2 = tqVar.X0;
                if (qqVar2 != null) {
                    TLRPC.TL_chatAdminRights tL_chatAdminRights = tqVar.M;
                    if (!tL_chatAdminRights.change_info && !tL_chatAdminRights.post_messages && !tL_chatAdminRights.manage_direct_messages && !tL_chatAdminRights.manage_welcome_messages && !tL_chatAdminRights.edit_messages && !tL_chatAdminRights.delete_messages && !tL_chatAdminRights.ban_users && !tL_chatAdminRights.invite_users && ((!tqVar.G || !tL_chatAdminRights.manage_topics) && !tL_chatAdminRights.pin_messages && !tL_chatAdminRights.manage_ranks && !tL_chatAdminRights.add_admins && !tL_chatAdminRights.anonymous && !tL_chatAdminRights.manage_call && ((!tqVar.E || (!tL_chatAdminRights.post_stories && !tL_chatAdminRights.edit_stories && !tL_chatAdminRights.delete_stories)) && !tL_chatAdminRights.other))) {
                        i11 = 0;
                    }
                    qqVar2.b(i11, tL_chatAdminRights, tqVar.O, tqVar.S);
                    tqVar.finishFragment();
                    break;
                }
                break;
        }
    }
}
