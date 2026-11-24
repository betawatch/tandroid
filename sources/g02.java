// default package

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class g02 implements b22 {
    public final /* synthetic */ x02 a;

    public g02(x02 x02Var) {
        this.a = x02Var;
    }

    @Override // b22
    public final void a(ArrayList arrayList, String str, boolean z, int i, long j, boolean z2) {
        ((mu1) this.a.Z1).ob(arrayList, str, z, i, j, z2);
    }

    @Override // b22
    public final void b(TLRPC.TL_userContact_old2 tL_userContact_old2, boolean z, int i, long j) {
        mu1 mu1Var = (mu1) this.a.Z1;
        if (mu1Var.k5()) {
            x3a g = x3a.g(tL_userContact_old2, mu1Var.l6, mu1Var.F5, mu1Var.m4, null, null, z, i, 0);
            g.K = mu1Var.O6();
            g.O = 0L;
            g.L = false;
            g.Q = j;
            g.R = mu1Var.a7();
            g.T = mu1Var.y5;
            mu1Var.getSendMessagesHelper().q0(g);
            mu1Var.y4();
        }
    }
}
