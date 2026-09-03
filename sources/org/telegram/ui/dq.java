package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
                iq iqVar = lqVar.U0;
                if (iqVar != null) {
                    iqVar.b(0, lqVar.H ? lqVar.J : null, null, lqVar.P);
                }
                Bundle i12 = android.support.v4.media.a.i("scrollToTopOnResume", true);
                i12.putLong("chat_id", lqVar.w.id);
                if (!lqVar.getMessagesController().checkCanOpenChat(i12, lqVar)) {
                    lqVar.t0(false);
                    break;
                } else {
                    zn znVar = new zn(i12);
                    lqVar.presentFragment(znVar, true);
                    if (org.telegram.ui.Components.qc.a(znVar)) {
                        boolean z4 = lqVar.W0;
                        if (!z4 || !lqVar.H) {
                            if (!z4 && !lqVar.I && lqVar.H) {
                                org.telegram.ui.Components.qc.C(znVar, user.first_name).j();
                                break;
                            }
                        } else {
                            String str = user.first_name;
                            org.telegram.ui.Components.qb qbVar = new org.telegram.ui.Components.qb(znVar.getParentActivity(), znVar.ba);
                            qbVar.d(R.raw.ic_admin, "Shield");
                            qbVar.b.setText(AndroidUtilities.replaceTags(LocaleController.formatString("UserAddedAsAdminHint", R.string.UserAddedAsAdminHint, str)));
                            org.telegram.ui.Components.ic.g(znVar, qbVar, 1500).j();
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
                    long j10 = lqVar.n;
                    org.telegram.ui.ActionBar.d2[] d2VarArr = {new org.telegram.ui.ActionBar.d2(lqVar.getParentActivity(), 3, null)};
                    lqVar.getMessagesController().toggleChatJoinRequest(lqVar.s, j10, true, false, true, new sg(d2VarArr, 2), new sg(d2VarArr, 3));
                    d2VarArr[0].q(300L);
                }
                iq iqVar2 = lqVar.U0;
                if (iqVar2 != null) {
                    TLRPC.TL_chatAdminRights tL_chatAdminRights = lqVar.J;
                    if (!tL_chatAdminRights.change_info && !tL_chatAdminRights.post_messages && !tL_chatAdminRights.manage_direct_messages && !tL_chatAdminRights.manage_welcome_messages && !tL_chatAdminRights.edit_messages && !tL_chatAdminRights.delete_messages && !tL_chatAdminRights.ban_users && !tL_chatAdminRights.invite_users && ((!lqVar.D || !tL_chatAdminRights.manage_topics) && !tL_chatAdminRights.pin_messages && !tL_chatAdminRights.manage_ranks && !tL_chatAdminRights.add_admins && !tL_chatAdminRights.anonymous && !tL_chatAdminRights.manage_call && ((!lqVar.B || (!tL_chatAdminRights.post_stories && !tL_chatAdminRights.edit_stories && !tL_chatAdminRights.delete_stories)) && !tL_chatAdminRights.other))) {
                        i11 = 0;
                    }
                    iqVar2.b(i11, tL_chatAdminRights, lqVar.L, lqVar.P);
                    lqVar.finishFragment();
                    break;
                }
                break;
        }
    }
}
