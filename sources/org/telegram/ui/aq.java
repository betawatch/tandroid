package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class aq implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ iq b;

    public /* synthetic */ aq(iq iqVar, int i10) {
        this.a = i10;
        this.b = iqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        iq iqVar = this.b;
        int i11 = 1;
        switch (i10) {
            case 0:
                TLRPC.User user = iqVar.v;
                fq fqVar = iqVar.X0;
                if (fqVar != null) {
                    fqVar.b(0, iqVar.K ? iqVar.M : null, null, iqVar.S);
                }
                Bundle i12 = a1.g.i("scrollToTopOnResume", true);
                i12.putLong("chat_id", iqVar.w.id);
                if (!iqVar.getMessagesController().checkCanOpenChat(i12, iqVar)) {
                    iqVar.u0(false);
                    break;
                } else {
                    wn wnVar = new wn(i12);
                    iqVar.presentFragment(wnVar, true);
                    if (org.telegram.ui.Components.wc.a(wnVar)) {
                        boolean z10 = iqVar.Z0;
                        if (!z10 || !iqVar.K) {
                            if (!z10 && !iqVar.L && iqVar.K) {
                                org.telegram.ui.Components.wc.C(wnVar, user.first_name).j();
                                break;
                            }
                        } else {
                            String str = user.first_name;
                            org.telegram.ui.Components.yb ybVar = new org.telegram.ui.Components.yb(wnVar.getParentActivity(), wnVar.ua);
                            ybVar.d(R.raw.ic_admin, "Shield");
                            ybVar.b.setText(AndroidUtilities.replaceTags(LocaleController.formatString("UserAddedAsAdminHint", R.string.UserAddedAsAdminHint, str)));
                            org.telegram.ui.Components.qc.g(wnVar, ybVar, 1500).j();
                            break;
                        }
                    }
                }
                break;
            case 1:
                iqVar.s0(false);
                break;
            default:
                if (iqVar.r) {
                    long j10 = iqVar.n;
                    org.telegram.ui.ActionBar.e2[] e2VarArr = {new org.telegram.ui.ActionBar.e2(iqVar.getParentActivity(), 3, null)};
                    iqVar.getMessagesController().toggleChatJoinRequest(iqVar.s, j10, true, false, true, new og(e2VarArr, 2), new og(e2VarArr, 3));
                    e2VarArr[0].r(300L);
                }
                fq fqVar2 = iqVar.X0;
                if (fqVar2 != null) {
                    TLRPC.TL_chatAdminRights tL_chatAdminRights = iqVar.M;
                    if (!tL_chatAdminRights.change_info && !tL_chatAdminRights.post_messages && !tL_chatAdminRights.manage_direct_messages && !tL_chatAdminRights.manage_welcome_messages && !tL_chatAdminRights.edit_messages && !tL_chatAdminRights.delete_messages && !tL_chatAdminRights.ban_users && !tL_chatAdminRights.invite_users && ((!iqVar.G || !tL_chatAdminRights.manage_topics) && !tL_chatAdminRights.pin_messages && !tL_chatAdminRights.manage_ranks && !tL_chatAdminRights.add_admins && !tL_chatAdminRights.anonymous && !tL_chatAdminRights.manage_call && ((!iqVar.E || (!tL_chatAdminRights.post_stories && !tL_chatAdminRights.edit_stories && !tL_chatAdminRights.delete_stories)) && !tL_chatAdminRights.other))) {
                        i11 = 0;
                    }
                    fqVar2.b(i11, tL_chatAdminRights, iqVar.O, iqVar.S);
                    iqVar.finishFragment();
                    break;
                }
                break;
        }
    }
}
