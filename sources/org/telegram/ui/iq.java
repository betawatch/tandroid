package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final /* synthetic */ class iq implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qq b;

    public /* synthetic */ iq(qq qqVar, int i10) {
        this.a = i10;
        this.b = qqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        qq qqVar = this.b;
        int i11 = 1;
        switch (i10) {
            case 0:
                TLRPC.User user = qqVar.v;
                nq nqVar = qqVar.X0;
                if (nqVar != null) {
                    nqVar.b(0, qqVar.K ? qqVar.M : null, null, qqVar.S);
                }
                Bundle i12 = a4.a.i("scrollToTopOnResume", true);
                i12.putLong("chat_id", qqVar.w.id);
                if (!qqVar.getMessagesController().checkCanOpenChat(i12, qqVar)) {
                    qqVar.t0(false);
                    break;
                } else {
                    co coVar = new co(i12);
                    qqVar.presentFragment(coVar, true);
                    if (org.telegram.ui.Components.yc.a(coVar)) {
                        boolean z10 = qqVar.Z0;
                        if (!z10 || !qqVar.K) {
                            if (!z10 && !qqVar.L && qqVar.K) {
                                org.telegram.ui.Components.yc.C(coVar, user.first_name).j();
                                break;
                            }
                        } else {
                            String str = user.first_name;
                            org.telegram.ui.Components.yb ybVar = new org.telegram.ui.Components.yb(coVar.getParentActivity(), coVar.ea);
                            ybVar.d(R.raw.ic_admin, "Shield");
                            ybVar.b.setText(AndroidUtilities.replaceTags(LocaleController.formatString("UserAddedAsAdminHint", R.string.UserAddedAsAdminHint, str)));
                            org.telegram.ui.Components.qc.g(coVar, ybVar, 1500).j();
                            break;
                        }
                    }
                }
                break;
            case 1:
                qqVar.r0(false);
                break;
            default:
                if (qqVar.r) {
                    long j3 = qqVar.n;
                    org.telegram.ui.ActionBar.b2[] b2VarArr = {new org.telegram.ui.ActionBar.b2(qqVar.getParentActivity(), 3, null)};
                    qqVar.getMessagesController().toggleChatJoinRequest(qqVar.s, j3, true, false, true, new xg(b2VarArr, 2), new xg(b2VarArr, 3));
                    b2VarArr[0].q(300L);
                }
                nq nqVar2 = qqVar.X0;
                if (nqVar2 != null) {
                    TLRPC.TL_chatAdminRights tL_chatAdminRights = qqVar.M;
                    if (!tL_chatAdminRights.change_info && !tL_chatAdminRights.post_messages && !tL_chatAdminRights.manage_direct_messages && !tL_chatAdminRights.manage_welcome_messages && !tL_chatAdminRights.edit_messages && !tL_chatAdminRights.delete_messages && !tL_chatAdminRights.ban_users && !tL_chatAdminRights.invite_users && ((!qqVar.G || !tL_chatAdminRights.manage_topics) && !tL_chatAdminRights.pin_messages && !tL_chatAdminRights.manage_ranks && !tL_chatAdminRights.add_admins && !tL_chatAdminRights.anonymous && !tL_chatAdminRights.manage_call && ((!qqVar.E || (!tL_chatAdminRights.post_stories && !tL_chatAdminRights.edit_stories && !tL_chatAdminRights.delete_stories)) && !tL_chatAdminRights.other))) {
                        i11 = 0;
                    }
                    nqVar2.b(i11, tL_chatAdminRights, qqVar.O, qqVar.S);
                    qqVar.finishFragment();
                    break;
                }
                break;
        }
    }
}
