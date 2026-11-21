package fi;

import org.telegram.messenger.mp;
import org.telegram.messenger.x10;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final /* synthetic */ class u1 implements x10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ z3 b;

    public /* synthetic */ u1(z3 z3Var, int i7) {
        this.a = i7;
        this.b = z3Var;
    }

    @Override // org.telegram.messenger.x10
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                z3 z3Var = this.b;
                if (tL_premium_boostsStatus != null) {
                    z3Var.t3 = tL_premium_boostsStatus;
                    mp.u1(z3Var.m2).I0().b(z3Var.l1, tL_premium_boostsStatus, new ai.x1(14, z3Var, tL_premium_boostsStatus));
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
                    z3Var2.L1.y2();
                }
                z3Var2.p0(true);
                break;
        }
    }
}
