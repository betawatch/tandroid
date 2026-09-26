package ai;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes4.dex */
public final /* synthetic */ class f3 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ e6 b;

    public /* synthetic */ f3(e6 e6Var, int i10) {
        this.a = i10;
        this.b = e6Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                e6 e6Var = this.b;
                if (tL_premium_boostsStatus != null) {
                    e6Var.J3 = tL_premium_boostsStatus;
                    MessagesController.getInstance(e6Var.C2).getBoostsController().userCanBoostChannel(e6Var.B1, tL_premium_boostsStatus, new g3(0, e6Var, tL_premium_boostsStatus));
                    break;
                } else {
                    jc jcVar = e6Var.J0;
                    if (jcVar != null) {
                        jcVar.k1 = false;
                        jcVar.P();
                        break;
                    }
                }
                break;
            default:
                long longValue = ((Long) obj).longValue();
                e6 e6Var2 = this.b;
                e6Var2.L3 = longValue;
                a4 a4Var = e6Var2.b2;
                if (a4Var != null) {
                    a4Var.K(true);
                    e6Var2.b2.R1();
                }
                e6Var2.r0(true);
                break;
        }
    }
}
