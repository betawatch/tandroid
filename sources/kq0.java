// default package

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public abstract class kq0 {
    public static void a(e eVar, int i, TLRPC.User user) {
        if (eVar == null || user == null) {
            return;
        }
        String r = lbc.r(user);
        if (!user.bot || !user.bot_can_edit) {
            d31.b0(eVar).t(hl.S2(ob6.a0(null, null, 2131753045, r)), null).j();
            return;
        }
        String M0 = ob6.M0(2131753044, null);
        String M02 = ob6.M0(2131748928, null);
        jq0 jq0Var = new jq0(i, user, (byte) 0);
        bx4 bx4Var = bx4.s2;
        xw4 xw4Var = new xw4();
        xw4Var.a = M0;
        xw4Var.b = M02;
        xw4Var.c = jq0Var;
        bx4.f1(eVar, false, null, xw4Var);
    }
}
