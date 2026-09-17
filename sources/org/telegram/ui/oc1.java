package org.telegram.ui;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class oc1 implements e2.h {
    public final /* synthetic */ int a;
    public final /* synthetic */ wd1 b;

    public /* synthetic */ oc1(wd1 wd1Var, int i10) {
        this.a = i10;
        this.b = wd1Var;
    }

    @Override // e2.h
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                wd1 wd1Var = this.b;
                wd1Var.V1 = (TL_stories.TL_premium_boostsStatus) obj;
                wd1Var.U1 = true;
                wd1Var.h1(true);
                wd1Var.T1 = false;
                break;
            default:
                wd1.V(this.b, (ChannelBoostsController.CanApplyBoost) obj);
                break;
        }
    }
}
