package di;

import org.telegram.messenger.c20;
import org.telegram.messenger.qp;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class z1 implements c20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ j4 b;

    public /* synthetic */ z1(j4 j4Var, int i7) {
        this.a = i7;
        this.b = j4Var;
    }

    @Override // org.telegram.messenger.c20
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                j4 j4Var = this.b;
                if (tL_premium_boostsStatus != null) {
                    j4Var.s3 = tL_premium_boostsStatus;
                    qp.s1(j4Var.l2).G0().b(j4Var.k1, tL_premium_boostsStatus, new ai.f1(7, j4Var, tL_premium_boostsStatus));
                    break;
                } else {
                    q9 q9Var = j4Var.s0;
                    if (q9Var != null) {
                        q9Var.j1 = false;
                        q9Var.V();
                        break;
                    }
                }
                break;
            default:
                long longValue = ((Long) obj).longValue();
                j4 j4Var2 = this.b;
                j4Var2.u3 = longValue;
                o2 o2Var = j4Var2.K1;
                if (o2Var != null) {
                    o2Var.E(true);
                    j4Var2.K1.T1();
                }
                j4Var2.p0(true);
                break;
        }
    }
}
