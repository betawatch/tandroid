package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class jq implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ rq b;

    public /* synthetic */ jq(rq rqVar, int i10) {
        this.a = i10;
        this.b = rqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        rq rqVar = this.b;
        int i11 = 1;
        switch (i10) {
            case 0:
                TLRPC.User user = rqVar.v;
                oq oqVar = rqVar.X0;
                if (oqVar != null) {
                    oqVar.b(0, rqVar.K ? rqVar.M : null, null, rqVar.S);
                }
                Bundle i12 = a4.a.i("scrollToTopOnResume", true);
                i12.putLong("chat_id", rqVar.w.id);
                if (!rqVar.getMessagesController().checkCanOpenChat(i12, rqVar)) {
                    rqVar.t0(false);
                    break;
                } else {
                    eo eoVar = new eo(i12);
                    rqVar.presentFragment(eoVar, true);
                    if (org.telegram.ui.Components.wc.a(eoVar)) {
                        boolean z10 = rqVar.Z0;
                        if (!z10 || !rqVar.K) {
                            if (!z10 && !rqVar.L && rqVar.K) {
                                org.telegram.ui.Components.wc.C(eoVar, user.first_name).j();
                                break;
                            }
                        } else {
                            String str = user.first_name;
                            org.telegram.ui.Components.xb xbVar = new org.telegram.ui.Components.xb(eoVar.getParentActivity(), eoVar.ea);
                            xbVar.d(R.raw.ic_admin, "Shield");
                            xbVar.b.setText(AndroidUtilities.replaceTags(LocaleController.formatString("UserAddedAsAdminHint", R.string.UserAddedAsAdminHint, str)));
                            org.telegram.ui.Components.pc.g(eoVar, xbVar, 1500).j();
                            break;
                        }
                    }
                }
                break;
            case 1:
                rqVar.r0(false);
                break;
            default:
                if (rqVar.r) {
                    long j3 = rqVar.n;
                    org.telegram.ui.ActionBar.d2[] d2VarArr = {new org.telegram.ui.ActionBar.d2(rqVar.getParentActivity(), 3, null)};
                    rqVar.getMessagesController().toggleChatJoinRequest(rqVar.s, j3, true, false, true, new yg(d2VarArr, 2), new yg(d2VarArr, 3));
                    d2VarArr[0].q(300L);
                }
                oq oqVar2 = rqVar.X0;
                if (oqVar2 != null) {
                    TLRPC.TL_chatAdminRights tL_chatAdminRights = rqVar.M;
                    if (!tL_chatAdminRights.change_info && !tL_chatAdminRights.post_messages && !tL_chatAdminRights.manage_direct_messages && !tL_chatAdminRights.manage_welcome_messages && !tL_chatAdminRights.edit_messages && !tL_chatAdminRights.delete_messages && !tL_chatAdminRights.ban_users && !tL_chatAdminRights.invite_users && ((!rqVar.G || !tL_chatAdminRights.manage_topics) && !tL_chatAdminRights.pin_messages && !tL_chatAdminRights.manage_ranks && !tL_chatAdminRights.add_admins && !tL_chatAdminRights.anonymous && !tL_chatAdminRights.manage_call && ((!rqVar.E || (!tL_chatAdminRights.post_stories && !tL_chatAdminRights.edit_stories && !tL_chatAdminRights.delete_stories)) && !tL_chatAdminRights.other))) {
                        i11 = 0;
                    }
                    oqVar2.b(i11, tL_chatAdminRights, rqVar.O, rqVar.S);
                    rqVar.finishFragment();
                    break;
                }
                break;
        }
    }
}
