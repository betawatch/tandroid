package di;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class f2 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ q4 b;

    public /* synthetic */ f2(q4 q4Var, int i10) {
        this.a = i10;
        this.b = q4Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                q4 q4Var = this.b;
                if (tL_premium_boostsStatus != null) {
                    q4Var.y3 = tL_premium_boostsStatus;
                    MessagesController.getInstance(q4Var.r2).getBoostsController().userCanBoostChannel(q4Var.q1, tL_premium_boostsStatus, new ai.n1(7, q4Var, tL_premium_boostsStatus));
                    break;
                } else {
                    y9 y9Var = q4Var.y0;
                    if (y9Var != null) {
                        y9Var.k1 = false;
                        y9Var.P();
                        break;
                    }
                }
                break;
            default:
                long longValue = ((Long) obj).longValue();
                q4 q4Var2 = this.b;
                q4Var2.A3 = longValue;
                u2 u2Var = q4Var2.Q1;
                if (u2Var != null) {
                    u2Var.G(true);
                    q4Var2.Q1.O1();
                }
                q4Var2.p0(true);
                break;
        }
    }
}
