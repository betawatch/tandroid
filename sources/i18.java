// default package

import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i18 implements p8c {
    public final /* synthetic */ byte a;
    public final /* synthetic */ y28 b;

    public /* synthetic */ i18(y28 y28Var, byte b) {
        this.a = b;
        this.b = y28Var;
    }

    @Override // p8c
    public final void a(Object obj) {
        byte b = this.a;
        y28 y28Var = this.b;
        switch (b) {
            case 0:
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                if (tL_premium_boostsStatus != null) {
                    y28Var.y3 = tL_premium_boostsStatus;
                    na7.q1(y28Var.s2).E0().b(y28Var.r1, tL_premium_boostsStatus, new x15(y28Var, tL_premium_boostsStatus, (byte) 17));
                    break;
                } else {
                    m8b m8bVar = y28Var.z0;
                    if (m8bVar != null) {
                        m8bVar.k1 = false;
                        m8bVar.U();
                        break;
                    }
                }
                break;
            default:
                y28Var.A3 = ((Long) obj).longValue();
                q18 q18Var = y28Var.R1;
                if (q18Var != null) {
                    q18Var.N(true);
                    y28Var.R1.x2();
                }
                y28Var.h0(true);
                break;
        }
    }
}
