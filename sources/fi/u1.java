package fi;

import org.telegram.messenger.mp;
import org.telegram.messenger.w10;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class u1 implements w10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ z3 b;

    public /* synthetic */ u1(z3 z3Var, int i7) {
        this.a = i7;
        this.b = z3Var;
    }

    @Override // org.telegram.messenger.w10
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                z3 z3Var = this.b;
                if (tL_premium_boostsStatus != null) {
                    z3Var.t3 = tL_premium_boostsStatus;
                    mp.u1(z3Var.m2).I0().b(z3Var.l1, tL_premium_boostsStatus, new ai.s1(14, z3Var, tL_premium_boostsStatus));
                    break;
                } else {
                    f9 f9Var = z3Var.t0;
                    if (f9Var != null) {
                        f9Var.k1 = false;
                        f9Var.V();
                        break;
                    }
                }
                break;
            default:
                long longValue = ((Long) obj).longValue();
                z3 z3Var2 = this.b;
                z3Var2.v3 = longValue;
                i2 i2Var = z3Var2.L1;
                if (i2Var != null) {
                    i2Var.P(true);
                    z3Var2.L1.B2();
                }
                z3Var2.p0(true);
                break;
        }
    }
}
