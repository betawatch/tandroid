package org.telegram.ui;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ec1 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ od1 b;

    public /* synthetic */ ec1(od1 od1Var, int i10) {
        this.a = i10;
        this.b = od1Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                od1 od1Var = this.b;
                od1Var.getClass();
                od1Var.n1 = ((Float) obj).floatValue();
                od1Var.x0.invalidate();
                od1Var.V0();
                break;
            case 1:
                od1 od1Var2 = this.b;
                od1Var2.V1 = (TL_stories.TL_premium_boostsStatus) obj;
                od1Var2.U1 = true;
                od1Var2.h1(true);
                od1Var2.T1 = false;
                break;
            default:
                od1.U(this.b, (ChannelBoostsController.CanApplyBoost) obj);
                break;
        }
    }
}
