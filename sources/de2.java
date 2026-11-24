// default package

import android.os.Bundle;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class de2 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ke2 b;

    public /* synthetic */ de2(ke2 ke2Var, byte b) {
        this.a = b;
        this.b = ke2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        ke2 ke2Var = this.b;
        int i = 1;
        switch (b) {
            case 0:
                TLRPC.User user = ke2Var.w;
                he2 he2Var = ke2Var.Y0;
                if (he2Var != null) {
                    he2Var.b(0, ke2Var.L ? ke2Var.N : null, null, ke2Var.T);
                }
                Bundle l = ts2.l("scrollToTopOnResume", true);
                l.putLong("chat_id", ke2Var.x.id);
                if (!ke2Var.getMessagesController().A(l, ke2Var, null, null)) {
                    ke2Var.q0(false);
                    break;
                } else {
                    yv1 yv1Var = new yv1(l);
                    ke2Var.presentFragment(yv1Var, true);
                    if (c41.a(yv1Var)) {
                        if (!ke2Var.a1) {
                            if (!ke2Var.M && ke2Var.L) {
                                c41.C(user.first_name, yv1Var).j();
                                break;
                            }
                        } else if (ke2Var.L) {
                            String str = user.first_name;
                            b31 b31Var = new b31(yv1Var.getParentActivity(), yv1Var.Ba);
                            b31Var.d(R.raw.ic_admin, "Shield");
                            hg9.q("UserAddedAsAdminHint", null, 2131743455, new Object[]{str}, b31Var.b);
                            u31.g(yv1Var, b31Var, 1500).j();
                            break;
                        }
                    }
                }
                break;
            case 1:
                ke2Var.o0(false);
                break;
            default:
                if (ke2Var.r) {
                    long j = ke2Var.n;
                    he[] heVarArr = {new he(3, null, ke2Var.getParentActivity())};
                    ke2Var.getMessagesController().k5(ke2Var.s, j, true, false, true, new wi0(heVarArr, (byte) 4), new wi0(heVarArr, (byte) 5));
                    heVarArr[0].q(300L);
                }
                he2 he2Var2 = ke2Var.Y0;
                if (he2Var2 != null) {
                    TLRPC.TL_chatAdminRights tL_chatAdminRights = ke2Var.N;
                    if (!tL_chatAdminRights.change_info && !tL_chatAdminRights.post_messages && !tL_chatAdminRights.manage_direct_messages && !tL_chatAdminRights.manage_welcome_messages && !tL_chatAdminRights.edit_messages && !tL_chatAdminRights.delete_messages && !tL_chatAdminRights.ban_users && !tL_chatAdminRights.invite_users && ((!ke2Var.H || !tL_chatAdminRights.manage_topics) && !tL_chatAdminRights.pin_messages && !tL_chatAdminRights.manage_ranks && !tL_chatAdminRights.add_admins && !tL_chatAdminRights.anonymous && !tL_chatAdminRights.manage_call && ((!ke2Var.F || (!tL_chatAdminRights.post_stories && !tL_chatAdminRights.edit_stories && !tL_chatAdminRights.delete_stories)) && !tL_chatAdminRights.other))) {
                        i = 0;
                    }
                    he2Var2.b(i, tL_chatAdminRights, ke2Var.P, ke2Var.T);
                    ke2Var.finishFragment();
                    break;
                }
                break;
        }
    }
}
