// default package

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public abstract class kq0 {
    public static void a(d dVar, int i, TLRPC.User user) {
        if (dVar == null || user == null) {
            return;
        }
        String r = l7c.r(user);
        if (!user.bot || !user.bot_can_edit) {
            u21.b0(dVar).t(gl.S2(k96.a0(null, null, 2131753049, r)), null).j();
            return;
        }
        String M0 = k96.M0(2131753048, null);
        String M02 = k96.M0(2131748982, null);
        jq0 jq0Var = new jq0(i, user, (byte) 0);
        xu4 xu4Var = xu4.s2;
        tu4 tu4Var = new tu4();
        tu4Var.a = M0;
        tu4Var.b = M02;
        tu4Var.c = jq0Var;
        xu4.e1(dVar, false, null, tu4Var);
    }
}
