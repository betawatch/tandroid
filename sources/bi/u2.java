package bi;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final /* synthetic */ class u2 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ q5 b;

    public /* synthetic */ u2(q5 q5Var, int i10) {
        this.a = i10;
        this.b = q5Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                q5 q5Var = this.b;
                if (tL_premium_boostsStatus != null) {
                    q5Var.J3 = tL_premium_boostsStatus;
                    MessagesController.getInstance(q5Var.C2).getBoostsController().userCanBoostChannel(q5Var.B1, tL_premium_boostsStatus, new v2(0, q5Var, tL_premium_boostsStatus));
                    break;
                } else {
                    sb sbVar = q5Var.J0;
                    if (sbVar != null) {
                        sbVar.k1 = false;
                        sbVar.P();
                        break;
                    }
                }
                break;
            default:
                long longValue = ((Long) obj).longValue();
                q5 q5Var2 = this.b;
                q5Var2.L3 = longValue;
                q3 q3Var = q5Var2.b2;
                if (q3Var != null) {
                    q3Var.I(true);
                    q5Var2.b2.O1();
                }
                q5Var2.r0(true);
                break;
        }
    }
}
