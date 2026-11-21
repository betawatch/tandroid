package ki;

import org.telegram.messenger.gd;
import org.telegram.messenger.o10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.lc;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public abstract class h0 {
    public static void a(org.telegram.ui.ActionBar.g2 g2Var, int i7, TLRPC.User user) {
        if (g2Var == null || user == null) {
            return;
        }
        String q10 = o10.q(user);
        if (!user.bot || !user.bot_can_edit) {
            lc.b0(g2Var).t(org.telegram.messenger.g0.W2(gd.a0(null, null, 2131753049, q10)), null).j();
            return;
        }
        String N0 = gd.N0(2131753048, null);
        String N02 = gd.N0(2131748981, null);
        ai.a2 a2Var = new ai.a2(i7, user, 4);
        bi.e2 e2Var = bi.e2.t2;
        bi.a2 a2Var2 = new bi.a2();
        a2Var2.a = N0;
        a2Var2.b = N02;
        a2Var2.c = a2Var;
        bi.e2.k1(g2Var, false, null, a2Var2);
    }
}
