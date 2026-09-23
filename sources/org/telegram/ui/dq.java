package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class dq implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ lq b;

    public /* synthetic */ dq(lq lqVar, int i10) {
        this.a = i10;
        this.b = lqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        lq lqVar = this.b;
        int i11 = 1;
        switch (i10) {
            case 0:
                TLRPC.User user = lqVar.v;
                iq iqVar = lqVar.X0;
                if (iqVar != null) {
                    iqVar.b(0, lqVar.K ? lqVar.M : null, null, lqVar.S);
                }
                Bundle i12 = a4.a.i("scrollToTopOnResume", true);
                i12.putLong("chat_id", lqVar.w.id);
                if (!lqVar.getMessagesController().checkCanOpenChat(i12, lqVar)) {
                    lqVar.t0(false);
                    break;
                } else {
                    xn xnVar = new xn(i12);
                    lqVar.presentFragment(xnVar, true);
                    if (org.telegram.ui.Components.xc.a(xnVar)) {
                        boolean z10 = lqVar.Z0;
                        if (!z10 || !lqVar.K) {
                            if (!z10 && !lqVar.L && lqVar.K) {
                                org.telegram.ui.Components.xc.C(xnVar, user.first_name).j();
                                break;
                            }
                        } else {
                            String str = user.first_name;
                            org.telegram.ui.Components.yb ybVar = new org.telegram.ui.Components.yb(xnVar.getParentActivity(), xnVar.ea);
                            ybVar.d(R.raw.ic_admin, "Shield");
                            ybVar.b.setText(AndroidUtilities.replaceTags(LocaleController.formatString("UserAddedAsAdminHint", R.string.UserAddedAsAdminHint, str)));
                            org.telegram.ui.Components.qc.g(xnVar, ybVar, 1500).j();
                            break;
                        }
                    }
                }
                break;
            case 1:
                lqVar.r0(false);
                break;
            default:
                if (lqVar.r) {
                    long j3 = lqVar.n;
                    org.telegram.ui.ActionBar.b2[] b2VarArr = {new org.telegram.ui.ActionBar.b2(lqVar.getParentActivity(), 3, null)};
                    lqVar.getMessagesController().toggleChatJoinRequest(lqVar.s, j3, true, false, true, new vg(b2VarArr, 2), new vg(b2VarArr, 3));
                    b2VarArr[0].q(300L);
                }
                iq iqVar2 = lqVar.X0;
                if (iqVar2 != null) {
                    TLRPC.TL_chatAdminRights tL_chatAdminRights = lqVar.M;
                    if (!tL_chatAdminRights.change_info && !tL_chatAdminRights.post_messages && !tL_chatAdminRights.manage_direct_messages && !tL_chatAdminRights.manage_welcome_messages && !tL_chatAdminRights.edit_messages && !tL_chatAdminRights.delete_messages && !tL_chatAdminRights.ban_users && !tL_chatAdminRights.invite_users && ((!lqVar.G || !tL_chatAdminRights.manage_topics) && !tL_chatAdminRights.pin_messages && !tL_chatAdminRights.manage_ranks && !tL_chatAdminRights.add_admins && !tL_chatAdminRights.anonymous && !tL_chatAdminRights.manage_call && ((!lqVar.E || (!tL_chatAdminRights.post_stories && !tL_chatAdminRights.edit_stories && !tL_chatAdminRights.delete_stories)) && !tL_chatAdminRights.other))) {
                        i11 = 0;
                    }
                    iqVar2.b(i11, tL_chatAdminRights, lqVar.O, lqVar.S);
                    lqVar.finishFragment();
                    break;
                }
                break;
        }
    }
}
