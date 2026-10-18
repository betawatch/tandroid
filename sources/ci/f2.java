package ci;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final /* synthetic */ class f2 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ p4 b;

    public /* synthetic */ f2(p4 p4Var, int i10) {
        this.a = i10;
        this.b = p4Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                p4 p4Var = this.b;
                if (tL_premium_boostsStatus != null) {
                    p4Var.J3 = tL_premium_boostsStatus;
                    MessagesController.getInstance(p4Var.C2).getBoostsController().userCanBoostChannel(p4Var.B1, tL_premium_boostsStatus, new ai.n2(6, p4Var, tL_premium_boostsStatus));
                    break;
                } else {
                    z9 z9Var = p4Var.J0;
                    if (z9Var != null) {
                        z9Var.k1 = false;
                        z9Var.P();
                        break;
                    }
                }
                break;
            default:
                long longValue = ((Long) obj).longValue();
                p4 p4Var2 = this.b;
                p4Var2.L3 = longValue;
                u2 u2Var = p4Var2.b2;
                if (u2Var != null) {
                    u2Var.I(true);
                    p4Var2.b2.Q1();
                }
                p4Var2.r0(true);
                break;
        }
    }
}
