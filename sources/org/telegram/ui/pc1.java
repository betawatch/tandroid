package org.telegram.ui;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pc1 implements e2.h {
    public final /* synthetic */ int a;
    public final /* synthetic */ xd1 b;

    public /* synthetic */ pc1(xd1 xd1Var, int i10) {
        this.a = i10;
        this.b = xd1Var;
    }

    @Override // e2.h
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                xd1 xd1Var = this.b;
                xd1Var.V1 = (TL_stories.TL_premium_boostsStatus) obj;
                xd1Var.U1 = true;
                xd1Var.h1(true);
                xd1Var.T1 = false;
                break;
            default:
                xd1.V(this.b, (ChannelBoostsController.CanApplyBoost) obj);
                break;
        }
    }
}
