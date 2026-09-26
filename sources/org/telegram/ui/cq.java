package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
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
                hq hqVar = kqVar.X0;
                if (hqVar != null) {
                    hqVar.b(0, kqVar.K ? kqVar.M : null, null, kqVar.S);
                }
                Bundle i12 = a4.a.i("scrollToTopOnResume", true);
                i12.putLong("chat_id", kqVar.w.id);
                if (!kqVar.getMessagesController().checkCanOpenChat(i12, kqVar)) {
                    kqVar.t0(false);
                    break;
                } else {
                    wn wnVar = new wn(i12);
                    kqVar.presentFragment(wnVar, true);
                    if (org.telegram.ui.Components.xc.a(wnVar)) {
                        boolean z10 = kqVar.Z0;
                        if (!z10 || !kqVar.K) {
                            if (!z10 && !kqVar.L && kqVar.K) {
                                org.telegram.ui.Components.xc.C(wnVar, user.first_name).j();
                                break;
                            }
                        } else {
                            String str = user.first_name;
                            org.telegram.ui.Components.yb ybVar = new org.telegram.ui.Components.yb(wnVar.getParentActivity(), wnVar.ea);
                            ybVar.d(R.raw.ic_admin, "Shield");
                            ybVar.b.setText(AndroidUtilities.replaceTags(LocaleController.formatString("UserAddedAsAdminHint", R.string.UserAddedAsAdminHint, str)));
                            org.telegram.ui.Components.qc.g(wnVar, ybVar, 1500).j();
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
                    long j3 = kqVar.n;
                    org.telegram.ui.ActionBar.a2[] a2VarArr = {new org.telegram.ui.ActionBar.a2(kqVar.getParentActivity(), 3, null)};
                    kqVar.getMessagesController().toggleChatJoinRequest(kqVar.s, j3, true, false, true, new ug(a2VarArr, 2), new ug(a2VarArr, 3));
                    a2VarArr[0].q(300L);
                }
                hq hqVar2 = kqVar.X0;
                if (hqVar2 != null) {
                    TLRPC.TL_chatAdminRights tL_chatAdminRights = kqVar.M;
                    if (!tL_chatAdminRights.change_info && !tL_chatAdminRights.post_messages && !tL_chatAdminRights.manage_direct_messages && !tL_chatAdminRights.manage_welcome_messages && !tL_chatAdminRights.edit_messages && !tL_chatAdminRights.delete_messages && !tL_chatAdminRights.ban_users && !tL_chatAdminRights.invite_users && ((!kqVar.G || !tL_chatAdminRights.manage_topics) && !tL_chatAdminRights.pin_messages && !tL_chatAdminRights.manage_ranks && !tL_chatAdminRights.add_admins && !tL_chatAdminRights.anonymous && !tL_chatAdminRights.manage_call && ((!kqVar.E || (!tL_chatAdminRights.post_stories && !tL_chatAdminRights.edit_stories && !tL_chatAdminRights.delete_stories)) && !tL_chatAdminRights.other))) {
                        i11 = 0;
                    }
                    hqVar2.b(i11, tL_chatAdminRights, kqVar.O, kqVar.S);
                    kqVar.finishFragment();
                    break;
                }
                break;
        }
    }
}
