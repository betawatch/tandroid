package org.telegram.ui;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nc1 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ xd1 b;

    public /* synthetic */ nc1(xd1 xd1Var, int i10) {
        this.a = i10;
        this.b = xd1Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                xd1 xd1Var = this.b;
                xd1Var.getClass();
                xd1Var.n1 = ((Float) obj).floatValue();
                xd1Var.x0.invalidate();
                xd1Var.V0();
                break;
            case 1:
                xd1 xd1Var2 = this.b;
                xd1Var2.V1 = (TL_stories.TL_premium_boostsStatus) obj;
                xd1Var2.U1 = true;
                xd1Var2.h1(true);
                xd1Var2.T1 = false;
                break;
            default:
                xd1.U(this.b, (ChannelBoostsController.CanApplyBoost) obj);
                break;
        }
    }
}
