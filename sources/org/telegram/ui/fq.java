package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final /* synthetic */ class fq implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ nq b;

    public /* synthetic */ fq(nq nqVar, int i10) {
        this.a = i10;
        this.b = nqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        nq nqVar = this.b;
        int i11 = 1;
        switch (i10) {
            case 0:
                TLRPC.User user = nqVar.v;
                kq kqVar = nqVar.X0;
                if (kqVar != null) {
                    kqVar.b(0, nqVar.K ? nqVar.M : null, null, nqVar.S);
                }
                Bundle i12 = a4.a.i("scrollToTopOnResume", true);
                i12.putLong("chat_id", nqVar.w.id);
                if (!nqVar.getMessagesController().checkCanOpenChat(i12, nqVar)) {
                    nqVar.t0(false);
                    break;
                } else {
                    zn znVar = new zn(i12);
                    nqVar.presentFragment(znVar, true);
                    if (org.telegram.ui.Components.xc.a(znVar)) {
                        boolean z10 = nqVar.Z0;
                        if (!z10 || !nqVar.K) {
                            if (!z10 && !nqVar.L && nqVar.K) {
                                org.telegram.ui.Components.xc.C(znVar, user.first_name).j();
                                break;
                            }
                        } else {
                            String str = user.first_name;
                            org.telegram.ui.Components.xb xbVar = new org.telegram.ui.Components.xb(znVar.getParentActivity(), znVar.ea);
                            xbVar.d(R.raw.ic_admin, "Shield");
                            xbVar.b.setText(AndroidUtilities.replaceTags(LocaleController.formatString("UserAddedAsAdminHint", R.string.UserAddedAsAdminHint, str)));
                            org.telegram.ui.Components.pc.g(znVar, xbVar, 1500).j();
                            break;
                        }
                    }
                }
                break;
            case 1:
                nqVar.r0(false);
                break;
            default:
                if (nqVar.r) {
                    long j3 = nqVar.n;
                    org.telegram.ui.ActionBar.b2[] b2VarArr = {new org.telegram.ui.ActionBar.b2(nqVar.getParentActivity(), 3, null)};
                    nqVar.getMessagesController().toggleChatJoinRequest(nqVar.s, j3, true, false, true, new xg(b2VarArr, 2), new xg(b2VarArr, 3));
                    b2VarArr[0].q(300L);
                }
                kq kqVar2 = nqVar.X0;
                if (kqVar2 != null) {
                    TLRPC.TL_chatAdminRights tL_chatAdminRights = nqVar.M;
                    if (!tL_chatAdminRights.change_info && !tL_chatAdminRights.post_messages && !tL_chatAdminRights.manage_direct_messages && !tL_chatAdminRights.manage_welcome_messages && !tL_chatAdminRights.edit_messages && !tL_chatAdminRights.delete_messages && !tL_chatAdminRights.ban_users && !tL_chatAdminRights.invite_users && ((!nqVar.G || !tL_chatAdminRights.manage_topics) && !tL_chatAdminRights.pin_messages && !tL_chatAdminRights.manage_ranks && !tL_chatAdminRights.add_admins && !tL_chatAdminRights.anonymous && !tL_chatAdminRights.manage_call && ((!nqVar.E || (!tL_chatAdminRights.post_stories && !tL_chatAdminRights.edit_stories && !tL_chatAdminRights.delete_stories)) && !tL_chatAdminRights.other))) {
                        i11 = 0;
                    }
                    kqVar2.b(i11, tL_chatAdminRights, nqVar.O, nqVar.S);
                    nqVar.finishFragment();
                    break;
                }
                break;
        }
    }
}
