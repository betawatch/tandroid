package org.telegram.ui;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ib1 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ tc1 b;

    public /* synthetic */ ib1(tc1 tc1Var, int i10) {
        this.a = i10;
        this.b = tc1Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                tc1 tc1Var = this.b;
                tc1Var.getClass();
                tc1Var.o1 = ((Float) obj).floatValue();
                tc1Var.y0.invalidate();
                tc1Var.W0();
                break;
            case 1:
                tc1 tc1Var2 = this.b;
                tc1Var2.W1 = (TL_stories.TL_premium_boostsStatus) obj;
                tc1Var2.V1 = true;
                tc1Var2.i1(true);
                tc1Var2.U1 = false;
                break;
            default:
                tc1.V(this.b, (ChannelBoostsController.CanApplyBoost) obj);
                break;
        }
    }
}
