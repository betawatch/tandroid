package org.telegram.ui;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final /* synthetic */ class gb1 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ qc1 b;

    public /* synthetic */ gb1(qc1 qc1Var, int i10) {
        this.a = i10;
        this.b = qc1Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                qc1 qc1Var = this.b;
                qc1Var.getClass();
                qc1Var.o1 = ((Float) obj).floatValue();
                qc1Var.y0.invalidate();
                qc1Var.V0();
                break;
            case 1:
                qc1 qc1Var2 = this.b;
                qc1Var2.W1 = (TL_stories.TL_premium_boostsStatus) obj;
                qc1Var2.V1 = true;
                qc1Var2.h1(true);
                qc1Var2.U1 = false;
                break;
            default:
                qc1.U(this.b, (ChannelBoostsController.CanApplyBoost) obj);
                break;
        }
    }
}
