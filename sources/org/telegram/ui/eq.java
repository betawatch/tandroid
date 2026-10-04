package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class eq implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ mq b;

    public /* synthetic */ eq(mq mqVar, int i10) {
        this.a = i10;
        this.b = mqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        mq mqVar = this.b;
        int i11 = 1;
        switch (i10) {
            case 0:
                TLRPC.User user = mqVar.v;
                jq jqVar = mqVar.X0;
                if (jqVar != null) {
                    jqVar.b(0, mqVar.K ? mqVar.M : null, null, mqVar.S);
                }
                Bundle i12 = a4.a.i("scrollToTopOnResume", true);
                i12.putLong("chat_id", mqVar.w.id);
                if (!mqVar.getMessagesController().checkCanOpenChat(i12, mqVar)) {
                    mqVar.t0(false);
                    break;
                } else {
                    yn ynVar = new yn(i12);
                    mqVar.presentFragment(ynVar, true);
                    if (org.telegram.ui.Components.yc.a(ynVar)) {
                        boolean z10 = mqVar.Z0;
                        if (!z10 || !mqVar.K) {
                            if (!z10 && !mqVar.L && mqVar.K) {
                                org.telegram.ui.Components.yc.C(ynVar, user.first_name).j();
                                break;
                            }
                        } else {
                            String str = user.first_name;
                            org.telegram.ui.Components.zb zbVar = new org.telegram.ui.Components.zb(ynVar.getParentActivity(), ynVar.ca);
                            zbVar.d(R.raw.ic_admin, "Shield");
                            zbVar.b.setText(AndroidUtilities.replaceTags(LocaleController.formatString("UserAddedAsAdminHint", R.string.UserAddedAsAdminHint, str)));
                            org.telegram.ui.Components.rc.g(ynVar, zbVar, 1500).j();
                            break;
                        }
                    }
                }
                break;
            case 1:
                mqVar.r0(false);
                break;
            default:
                if (mqVar.r) {
                    long j3 = mqVar.n;
                    org.telegram.ui.ActionBar.b2[] b2VarArr = {new org.telegram.ui.ActionBar.b2(mqVar.getParentActivity(), 3, null)};
                    mqVar.getMessagesController().toggleChatJoinRequest(mqVar.s, j3, true, false, true, new xg(b2VarArr, 2), new xg(b2VarArr, 3));
                    b2VarArr[0].q(300L);
                }
                jq jqVar2 = mqVar.X0;
                if (jqVar2 != null) {
                    TLRPC.TL_chatAdminRights tL_chatAdminRights = mqVar.M;
                    if (!tL_chatAdminRights.change_info && !tL_chatAdminRights.post_messages && !tL_chatAdminRights.manage_direct_messages && !tL_chatAdminRights.manage_welcome_messages && !tL_chatAdminRights.edit_messages && !tL_chatAdminRights.delete_messages && !tL_chatAdminRights.ban_users && !tL_chatAdminRights.invite_users && ((!mqVar.G || !tL_chatAdminRights.manage_topics) && !tL_chatAdminRights.pin_messages && !tL_chatAdminRights.manage_ranks && !tL_chatAdminRights.add_admins && !tL_chatAdminRights.anonymous && !tL_chatAdminRights.manage_call && ((!mqVar.E || (!tL_chatAdminRights.post_stories && !tL_chatAdminRights.edit_stories && !tL_chatAdminRights.delete_stories)) && !tL_chatAdminRights.other))) {
                        i11 = 0;
                    }
                    jqVar2.b(i11, tL_chatAdminRights, mqVar.O, mqVar.S);
                    mqVar.finishFragment();
                    break;
                }
                break;
        }
    }
}
