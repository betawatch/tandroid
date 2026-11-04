package ei;

import org.telegram.messenger.hp;
import org.telegram.messenger.u10;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d2 implements u10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ j4 b;

    public /* synthetic */ d2(j4 j4Var, int i3) {
        this.a = i3;
        this.b = j4Var;
    }

    @Override // org.telegram.messenger.u10
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                j4 j4Var = this.b;
                if (tL_premium_boostsStatus != null) {
                    j4Var.t3 = tL_premium_boostsStatus;
                    hp.s1(j4Var.m2).G0().b(j4Var.l1, tL_premium_boostsStatus, new ai.o1(11, j4Var, tL_premium_boostsStatus));
                    break;
                } else {
                    r9 r9Var = j4Var.t0;
                    if (r9Var != null) {
                        r9Var.l1 = false;
                        r9Var.d0();
                        break;
                    }
                }
                break;
            default:
                long longValue = ((Long) obj).longValue();
                j4 j4Var2 = this.b;
                j4Var2.v3 = longValue;
                s2 s2Var = j4Var2.L1;
                if (s2Var != null) {
                    s2Var.E(true);
                    j4Var2.L1.S1();
                }
                j4Var2.p0(true);
                break;
        }
    }
}
