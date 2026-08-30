package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bq implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ jq b;

    public /* synthetic */ bq(jq jqVar, int i10) {
        this.a = i10;
        this.b = jqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        jq jqVar = this.b;
        int i11 = 1;
        switch (i10) {
            case 0:
                TLRPC.User user = jqVar.v;
                gq gqVar = jqVar.U0;
                if (gqVar != null) {
                    gqVar.b(0, jqVar.H ? jqVar.J : null, null, jqVar.P);
                }
                Bundle i12 = android.support.v4.media.a.i("scrollToTopOnResume", true);
                i12.putLong("chat_id", jqVar.w.id);
                if (!jqVar.getMessagesController().checkCanOpenChat(i12, jqVar)) {
                    jqVar.t0(false);
                    break;
                } else {
                    xn xnVar = new xn(i12);
                    jqVar.presentFragment(xnVar, true);
                    if (org.telegram.ui.Components.qc.a(xnVar)) {
                        boolean z4 = jqVar.W0;
                        if (!z4 || !jqVar.H) {
                            if (!z4 && !jqVar.I && jqVar.H) {
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
                jqVar.r0(false);
                break;
            default:
                if (jqVar.r) {
                    long j10 = jqVar.n;
                    org.telegram.ui.ActionBar.d2[] d2VarArr = {new org.telegram.ui.ActionBar.d2(jqVar.getParentActivity(), 3, null)};
                    jqVar.getMessagesController().toggleChatJoinRequest(jqVar.s, j10, true, false, true, new qg(d2VarArr, 2), new qg(d2VarArr, 3));
                    d2VarArr[0].q(300L);
                }
                gq gqVar2 = jqVar.U0;
                if (gqVar2 != null) {
                    TLRPC.TL_chatAdminRights tL_chatAdminRights = jqVar.J;
                    if (!tL_chatAdminRights.change_info && !tL_chatAdminRights.post_messages && !tL_chatAdminRights.manage_direct_messages && !tL_chatAdminRights.manage_welcome_messages && !tL_chatAdminRights.edit_messages && !tL_chatAdminRights.delete_messages && !tL_chatAdminRights.ban_users && !tL_chatAdminRights.invite_users && ((!jqVar.D || !tL_chatAdminRights.manage_topics) && !tL_chatAdminRights.pin_messages && !tL_chatAdminRights.manage_ranks && !tL_chatAdminRights.add_admins && !tL_chatAdminRights.anonymous && !tL_chatAdminRights.manage_call && ((!jqVar.B || (!tL_chatAdminRights.post_stories && !tL_chatAdminRights.edit_stories && !tL_chatAdminRights.delete_stories)) && !tL_chatAdminRights.other))) {
                        i11 = 0;
                    }
                    gqVar2.b(i11, tL_chatAdminRights, jqVar.L, jqVar.P);
                    jqVar.finishFragment();
                    break;
                }
                break;
        }
    }
}
