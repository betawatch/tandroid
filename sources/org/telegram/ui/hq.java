package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hq implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ pq b;

    public /* synthetic */ hq(pq pqVar, int i10) {
        this.a = i10;
        this.b = pqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        pq pqVar = this.b;
        int i11 = 1;
        switch (i10) {
            case 0:
                TLRPC.User user = pqVar.v;
                mq mqVar = pqVar.X0;
                if (mqVar != null) {
                    mqVar.b(0, pqVar.K ? pqVar.M : null, null, pqVar.S);
                }
                Bundle i12 = a4.a.i("scrollToTopOnResume", true);
                i12.putLong("chat_id", pqVar.w.id);
                if (!pqVar.getMessagesController().checkCanOpenChat(i12, pqVar)) {
                    pqVar.t0(false);
                    break;
                } else {
                    bo boVar = new bo(i12);
                    pqVar.presentFragment(boVar, true);
                    if (org.telegram.ui.Components.vc.a(boVar)) {
                        boolean z10 = pqVar.Z0;
                        if (!z10 || !pqVar.K) {
                            if (!z10 && !pqVar.L && pqVar.K) {
                                org.telegram.ui.Components.vc.C(boVar, user.first_name).j();
                                break;
                            }
                        } else {
                            String str = user.first_name;
                            org.telegram.ui.Components.wb wbVar = new org.telegram.ui.Components.wb(boVar.getParentActivity(), boVar.ea);
                            wbVar.d(R.raw.ic_admin, "Shield");
                            wbVar.b.setText(AndroidUtilities.replaceTags(LocaleController.formatString("UserAddedAsAdminHint", R.string.UserAddedAsAdminHint, str)));
                            org.telegram.ui.Components.oc.g(boVar, wbVar, 1500).j();
                            break;
                        }
                    }
                }
                break;
            case 1:
                pqVar.r0(false);
                break;
            default:
                if (pqVar.r) {
                    long j3 = pqVar.n;
                    org.telegram.ui.ActionBar.b2[] b2VarArr = {new org.telegram.ui.ActionBar.b2(pqVar.getParentActivity(), 3, null)};
                    pqVar.getMessagesController().toggleChatJoinRequest(pqVar.s, j3, true, false, true, new xg(b2VarArr, 2), new xg(b2VarArr, 3));
                    b2VarArr[0].q(300L);
                }
                mq mqVar2 = pqVar.X0;
                if (mqVar2 != null) {
                    TLRPC.TL_chatAdminRights tL_chatAdminRights = pqVar.M;
                    if (!tL_chatAdminRights.change_info && !tL_chatAdminRights.post_messages && !tL_chatAdminRights.manage_direct_messages && !tL_chatAdminRights.manage_welcome_messages && !tL_chatAdminRights.edit_messages && !tL_chatAdminRights.delete_messages && !tL_chatAdminRights.ban_users && !tL_chatAdminRights.invite_users && ((!pqVar.G || !tL_chatAdminRights.manage_topics) && !tL_chatAdminRights.pin_messages && !tL_chatAdminRights.manage_ranks && !tL_chatAdminRights.add_admins && !tL_chatAdminRights.anonymous && !tL_chatAdminRights.manage_call && ((!pqVar.E || (!tL_chatAdminRights.post_stories && !tL_chatAdminRights.edit_stories && !tL_chatAdminRights.delete_stories)) && !tL_chatAdminRights.other))) {
                        i11 = 0;
                    }
                    mqVar2.b(i11, tL_chatAdminRights, pqVar.O, pqVar.S);
                    pqVar.finishFragment();
                    break;
                }
                break;
        }
    }
}
