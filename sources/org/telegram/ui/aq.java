package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
                TLRPC.User user = iqVar.w;
                fq fqVar = iqVar.X0;
                if (fqVar != null) {
                    fqVar.b(0, iqVar.K ? iqVar.M : null, null, iqVar.S);
                }
                Bundle g10 = a1.g.g("scrollToTopOnResume", true);
                g10.putLong("chat_id", iqVar.x.id);
                if (!iqVar.getMessagesController().E(g10, iqVar, null, null)) {
                    iqVar.x0(false);
                    break;
                } else {
                    un unVar = new un(g10);
                    iqVar.presentFragment(unVar, true);
                    if (org.telegram.ui.Components.cc.a(unVar)) {
                        boolean z10 = iqVar.Z0;
                        if (!z10 || !iqVar.K) {
                            if (!z10 && !iqVar.L && iqVar.K) {
                                org.telegram.ui.Components.cc.C(user.first_name, unVar).j();
                                break;
                            }
                        } else {
                            String str = user.first_name;
                            org.telegram.ui.Components.eb ebVar = new org.telegram.ui.Components.eb(unVar.getParentActivity(), unVar.xa);
                            ebVar.d(R.raw.ic_admin, "Shield");
                            org.telegram.messenger.m5.q("UserAddedAsAdminHint", null, 2131743794, new Object[]{str}, ebVar.b);
                            org.telegram.ui.Components.wb.g(unVar, ebVar, 1500).j();
                            break;
                        }
                    }
                }
                break;
            case 1:
                iqVar.v0(false);
                break;
            default:
                if (iqVar.r) {
                    long j10 = iqVar.n;
                    org.telegram.ui.ActionBar.x1[] x1VarArr = {new org.telegram.ui.ActionBar.x1(3, iqVar.getParentActivity(), null)};
                    iqVar.getMessagesController().Z4(iqVar.s, j10, true, false, true, new pg(x1VarArr, 2), new pg(x1VarArr, 3));
                    x1VarArr[0].r(300L);
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
