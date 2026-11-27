// default package

import android.os.Bundle;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class id2 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pd2 b;

    public /* synthetic */ id2(pd2 pd2Var, byte b) {
        this.a = b;
        this.b = pd2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        pd2 pd2Var = this.b;
        int i = 1;
        switch (b) {
            case 0:
                TLRPC.User user = pd2Var.w;
                md2 md2Var = pd2Var.Y0;
                if (md2Var != null) {
                    md2Var.b(0, pd2Var.L ? pd2Var.N : null, null, pd2Var.T);
                }
                Bundle l = bs2.l("scrollToTopOnResume", true);
                l.putLong("chat_id", pd2Var.x.id);
                if (!pd2Var.getMessagesController().C(l, pd2Var, null, null)) {
                    pd2Var.p0(false);
                    break;
                } else {
                    zu1 zu1Var = new zu1(l);
                    pd2Var.presentFragment(zu1Var, true);
                    if (d31.a(zu1Var)) {
                        if (!pd2Var.a1) {
                            if (!pd2Var.M && pd2Var.L) {
                                d31.C(user.first_name, zu1Var).j();
                                break;
                            }
                        } else if (pd2Var.L) {
                            String str = user.first_name;
                            c21 c21Var = new c21(zu1Var.getParentActivity(), zu1Var.Ba);
                            c21Var.h(R.raw.ic_admin, "Shield");
                            uh9.r("UserAddedAsAdminHint", null, 2131743423, new Object[]{str}, c21Var.b);
                            v21.g(zu1Var, c21Var, 1500).j();
                            break;
                        }
                    }
                }
                break;
            case 1:
                pd2Var.n0(false);
                break;
            default:
                if (pd2Var.r) {
                    long j = pd2Var.n;
                    id[] idVarArr = {new id(3, null, pd2Var.getParentActivity())};
                    pd2Var.getMessagesController().q5(pd2Var.s, j, true, false, true, new xh0(idVarArr, (byte) 4), new xh0(idVarArr, (byte) 5));
                    idVarArr[0].q(300L);
                }
                md2 md2Var2 = pd2Var.Y0;
                if (md2Var2 != null) {
                    TLRPC.TL_chatAdminRights tL_chatAdminRights = pd2Var.N;
                    if (!tL_chatAdminRights.change_info && !tL_chatAdminRights.post_messages && !tL_chatAdminRights.manage_direct_messages && !tL_chatAdminRights.manage_welcome_messages && !tL_chatAdminRights.edit_messages && !tL_chatAdminRights.delete_messages && !tL_chatAdminRights.ban_users && !tL_chatAdminRights.invite_users && ((!pd2Var.H || !tL_chatAdminRights.manage_topics) && !tL_chatAdminRights.pin_messages && !tL_chatAdminRights.manage_ranks && !tL_chatAdminRights.add_admins && !tL_chatAdminRights.anonymous && !tL_chatAdminRights.manage_call && ((!pd2Var.F || (!tL_chatAdminRights.post_stories && !tL_chatAdminRights.edit_stories && !tL_chatAdminRights.delete_stories)) && !tL_chatAdminRights.other))) {
                        i = 0;
                    }
                    md2Var2.b(i, tL_chatAdminRights, pd2Var.P, pd2Var.T);
                    pd2Var.finishFragment();
                    break;
                }
                break;
        }
    }
}
