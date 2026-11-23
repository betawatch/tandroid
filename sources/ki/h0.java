package ki;

import org.telegram.messenger.gd;
import org.telegram.messenger.n10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.kc;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public abstract class h0 {
    public static void a(org.telegram.ui.ActionBar.g2 g2Var, int i7, TLRPC.User user) {
        if (g2Var == null || user == null) {
            return;
        }
        String q10 = n10.q(user);
        if (!user.bot || !user.bot_can_edit) {
            kc.b0(g2Var).t(org.telegram.messenger.g0.W2(gd.a0(null, null, 2131753049, q10)), null).j();
            return;
        }
        String N0 = gd.N0(2131753048, null);
        String N02 = gd.N0(2131748981, null);
        hi.a4 a4Var = new hi.a4(i7, user, 3);
        bi.f2 f2Var = bi.f2.t2;
        bi.b2 b2Var = new bi.b2();
        b2Var.a = N0;
        b2Var.b = N02;
        b2Var.c = a4Var;
        bi.f2.k1(g2Var, false, null, b2Var);
    }
}
