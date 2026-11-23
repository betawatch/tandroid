package ki;

import org.telegram.messenger.hd;
import org.telegram.messenger.p10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.lc;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public abstract class h0 {
    public static void a(org.telegram.ui.ActionBar.g2 g2Var, int i7, TLRPC.User user) {
        if (g2Var == null || user == null) {
            return;
        }
        String q10 = p10.q(user);
        if (!user.bot || !user.bot_can_edit) {
            lc.b0(g2Var).t(org.telegram.messenger.g0.W2(hd.a0(null, null, 2131753049, q10)), null).j();
            return;
        }
        String N0 = hd.N0(2131753048, null);
        String N02 = hd.N0(2131748981, null);
        ai.b2 b2Var = new ai.b2(i7, user, 4);
        bi.e2 e2Var = bi.e2.t2;
        bi.a2 a2Var = new bi.a2();
        a2Var.a = N0;
        a2Var.b = N02;
        a2Var.c = b2Var;
        bi.e2.k1(g2Var, false, null, a2Var);
    }
}
