// default package

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public abstract class kr0 {
    public static void a(d dVar, int i, TLRPC.User user) {
        if (dVar == null || user == null) {
            return;
        }
        String r = m9c.r(user);
        if (!user.bot || !user.bot_can_edit) {
            c41.b0(dVar).t(gm.S2(jb6.a0(null, null, 2131753017, r)), null).j();
            return;
        }
        String M0 = jb6.M0(2131753016, null);
        String M02 = jb6.M0(2131748931, null);
        jr0 jr0Var = new jr0(i, user, (byte) 0);
        yw4 yw4Var = yw4.s2;
        uw4 uw4Var = new uw4();
        uw4Var.a = M0;
        uw4Var.b = M02;
        uw4Var.c = jr0Var;
        yw4.e1(dVar, false, null, uw4Var);
    }
}
