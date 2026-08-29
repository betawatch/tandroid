package org.telegram.ui;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gb1 implements f5.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ qc1 b;

    public /* synthetic */ gb1(qc1 qc1Var, int i10) {
        this.a = i10;
        this.b = qc1Var;
    }

    @Override // f5.d
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                qc1 qc1Var = this.b;
                qc1Var.R1 = (TL_stories.TL_premium_boostsStatus) obj;
                qc1Var.Q1 = true;
                qc1Var.h1(true);
                qc1Var.P1 = false;
                break;
            default:
                qc1.X(this.b, (ChannelBoostsController.CanApplyBoost) obj);
                break;
        }
    }
}
