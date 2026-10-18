package org.telegram.ui;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cb1 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ mc1 b;

    public /* synthetic */ cb1(mc1 mc1Var, int i10) {
        this.a = i10;
        this.b = mc1Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                mc1 mc1Var = this.b;
                mc1Var.getClass();
                mc1Var.n1 = ((Float) obj).floatValue();
                mc1Var.x0.invalidate();
                mc1Var.V0();
                break;
            case 1:
                mc1 mc1Var2 = this.b;
                mc1Var2.V1 = (TL_stories.TL_premium_boostsStatus) obj;
                mc1Var2.U1 = true;
                mc1Var2.h1(true);
                mc1Var2.T1 = false;
                break;
            default:
                mc1.U(this.b, (ChannelBoostsController.CanApplyBoost) obj);
                break;
        }
    }
}
