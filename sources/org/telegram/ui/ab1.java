package org.telegram.ui;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final /* synthetic */ class ab1 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ kc1 b;

    public /* synthetic */ ab1(kc1 kc1Var, int i10) {
        this.a = i10;
        this.b = kc1Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                kc1 kc1Var = this.b;
                kc1Var.getClass();
                kc1Var.n1 = ((Float) obj).floatValue();
                kc1Var.x0.invalidate();
                kc1Var.V0();
                break;
            case 1:
                kc1 kc1Var2 = this.b;
                kc1Var2.V1 = (TL_stories.TL_premium_boostsStatus) obj;
                kc1Var2.U1 = true;
                kc1Var2.h1(true);
                kc1Var2.T1 = false;
                break;
            default:
                kc1.U(this.b, (ChannelBoostsController.CanApplyBoost) obj);
                break;
        }
    }
}
