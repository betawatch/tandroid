package ki;

import org.telegram.messenger.gd;
import org.telegram.messenger.o10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.lc;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public abstract class i0 {
    public static void a(org.telegram.ui.ActionBar.h2 h2Var, int i7, TLRPC.User user) {
        if (h2Var == null || user == null) {
            return;
        }
        String q10 = o10.q(user);
        if (!user.bot || !user.bot_can_edit) {
            lc.b0(h2Var).t(org.telegram.messenger.g0.W2(gd.a0(null, null, 2131753050, q10)), null).j();
            return;
        }
        String M0 = gd.M0(2131753049, null);
        String M02 = gd.M0(2131748982, null);
        ai.y1 y1Var = new ai.y1(i7, user, 4);
        bi.a2 a2Var = bi.a2.t2;
        bi.w1 w1Var = new bi.w1();
        w1Var.a = M0;
        w1Var.b = M02;
        w1Var.c = y1Var;
        bi.a2.k1(h2Var, false, null, w1Var);
    }
}
