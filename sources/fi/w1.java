package fi;

import org.telegram.messenger.np;
import org.telegram.messenger.z10;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class w1 implements z10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ b4 b;

    public /* synthetic */ w1(b4 b4Var, int i7) {
        this.a = i7;
        this.b = b4Var;
    }

    @Override // org.telegram.messenger.z10
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                b4 b4Var = this.b;
                if (tL_premium_boostsStatus != null) {
                    b4Var.t3 = tL_premium_boostsStatus;
                    np.s1(b4Var.m2).G0().b(b4Var.l1, tL_premium_boostsStatus, new ai.u1(12, b4Var, tL_premium_boostsStatus));
                    break;
                } else {
                    i9 i9Var = b4Var.t0;
                    if (i9Var != null) {
                        i9Var.k1 = false;
                        i9Var.V();
                        break;
                    }
                }
                break;
            default:
                long longValue = ((Long) obj).longValue();
                b4 b4Var2 = this.b;
                b4Var2.v3 = longValue;
                k2 k2Var = b4Var2.L1;
                if (k2Var != null) {
                    k2Var.N(true);
                    b4Var2.L1.l2();
                }
                b4Var2.p0(true);
                break;
        }
    }
}
