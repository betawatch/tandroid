package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cq implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ kq b;

    public /* synthetic */ cq(kq kqVar, int i10) {
        this.a = i10;
        this.b = kqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        kq kqVar = this.b;
        int i11 = 1;
        switch (i10) {
            case 0:
                TLRPC.User user = kqVar.v;
                hq hqVar = kqVar.U0;
                if (hqVar != null) {
                    hqVar.b(0, kqVar.H ? kqVar.J : null, null, kqVar.P);
                }
                Bundle i12 = android.support.v4.media.a.i("scrollToTopOnResume", true);
                i12.putLong("chat_id", kqVar.w.id);
                if (!kqVar.getMessagesController().checkCanOpenChat(i12, kqVar)) {
                    kqVar.t0(false);
                    break;
                } else {
                    xn xnVar = new xn(i12);
                    kqVar.presentFragment(xnVar, true);
                    if (org.telegram.ui.Components.qc.a(xnVar)) {
                        boolean z4 = kqVar.W0;
                        if (!z4 || !kqVar.H) {
                            if (!z4 && !kqVar.I && kqVar.H) {
                                org.telegram.ui.Components.qc.C(xnVar, user.first_name).j();
                                break;
                            }
                        } else {
                            String str = user.first_name;
                            org.telegram.ui.Components.qb qbVar = new org.telegram.ui.Components.qb(xnVar.getParentActivity(), xnVar.ba);
                            qbVar.d(R.raw.ic_admin, "Shield");
                            qbVar.b.setText(AndroidUtilities.replaceTags(LocaleController.formatString("UserAddedAsAdminHint", R.string.UserAddedAsAdminHint, str)));
                            org.telegram.ui.Components.ic.g(xnVar, qbVar, 1500).j();
                            break;
                        }
                    }
                }
                break;
            case 1:
                kqVar.r0(false);
                break;
            default:
                if (kqVar.r) {
                    long j10 = kqVar.n;
                    org.telegram.ui.ActionBar.d2[] d2VarArr = {new org.telegram.ui.ActionBar.d2(kqVar.getParentActivity(), 3, null)};
                    kqVar.getMessagesController().toggleChatJoinRequest(kqVar.s, j10, true, false, true, new qg(d2VarArr, 2), new qg(d2VarArr, 3));
                    d2VarArr[0].q(300L);
                }
                hq hqVar2 = kqVar.U0;
                if (hqVar2 != null) {
                    TLRPC.TL_chatAdminRights tL_chatAdminRights = kqVar.J;
                    if (!tL_chatAdminRights.change_info && !tL_chatAdminRights.post_messages && !tL_chatAdminRights.manage_direct_messages && !tL_chatAdminRights.manage_welcome_messages && !tL_chatAdminRights.edit_messages && !tL_chatAdminRights.delete_messages && !tL_chatAdminRights.ban_users && !tL_chatAdminRights.invite_users && ((!kqVar.D || !tL_chatAdminRights.manage_topics) && !tL_chatAdminRights.pin_messages && !tL_chatAdminRights.manage_ranks && !tL_chatAdminRights.add_admins && !tL_chatAdminRights.anonymous && !tL_chatAdminRights.manage_call && ((!kqVar.B || (!tL_chatAdminRights.post_stories && !tL_chatAdminRights.edit_stories && !tL_chatAdminRights.delete_stories)) && !tL_chatAdminRights.other))) {
                        i11 = 0;
                    }
                    hqVar2.b(i11, tL_chatAdminRights, kqVar.L, kqVar.P);
                    kqVar.finishFragment();
                    break;
                }
                break;
        }
    }
}
