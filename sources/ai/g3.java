package ai;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final /* synthetic */ class g3 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ f6 b;

    public /* synthetic */ g3(f6 f6Var, int i10) {
        this.a = i10;
        this.b = f6Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                f6 f6Var = this.b;
                if (tL_premium_boostsStatus != null) {
                    f6Var.J3 = tL_premium_boostsStatus;
                    MessagesController.getInstance(f6Var.C2).getBoostsController().userCanBoostChannel(f6Var.B1, tL_premium_boostsStatus, new h3(0, f6Var, tL_premium_boostsStatus));
                    break;
                } else {
                    kc kcVar = f6Var.J0;
                    if (kcVar != null) {
                        kcVar.k1 = false;
                        kcVar.P();
                        break;
                    }
                }
                break;
            default:
                long longValue = ((Long) obj).longValue();
                f6 f6Var2 = this.b;
                f6Var2.L3 = longValue;
                b4 b4Var = f6Var2.b2;
                if (b4Var != null) {
                    b4Var.I(true);
                    f6Var2.b2.Q1();
                }
                f6Var2.r0(true);
                break;
        }
    }
}
