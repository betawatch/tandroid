package ci;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes4.dex */
public final /* synthetic */ class g2 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ q4 b;

    public /* synthetic */ g2(q4 q4Var, int i10) {
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
                    q4Var.J3 = tL_premium_boostsStatus;
                    MessagesController.getInstance(q4Var.C2).getBoostsController().userCanBoostChannel(q4Var.B1, tL_premium_boostsStatus, new ai.o2(6, q4Var, tL_premium_boostsStatus));
                    break;
                } else {
                    aa aaVar = q4Var.J0;
                    if (aaVar != null) {
                        aaVar.k1 = false;
                        aaVar.P();
                        break;
                    }
                }
                break;
            default:
                long longValue = ((Long) obj).longValue();
                q4 q4Var2 = this.b;
                q4Var2.L3 = longValue;
                v2 v2Var = q4Var2.b2;
                if (v2Var != null) {
                    v2Var.I(true);
                    q4Var2.b2.O1();
                }
                q4Var2.r0(true);
                break;
        }
    }
}
