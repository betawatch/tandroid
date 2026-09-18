package org.telegram.ui;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nc1 implements e2.h {
    public final /* synthetic */ int a;
    public final /* synthetic */ vd1 b;

    public /* synthetic */ nc1(vd1 vd1Var, int i10) {
        this.a = i10;
        this.b = vd1Var;
    }

    @Override // e2.h
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                vd1 vd1Var = this.b;
                vd1Var.V1 = (TL_stories.TL_premium_boostsStatus) obj;
                vd1Var.U1 = true;
                vd1Var.h1(true);
                vd1Var.T1 = false;
                break;
            default:
                vd1.V(this.b, (ChannelBoostsController.CanApplyBoost) obj);
                break;
        }
    }
}
