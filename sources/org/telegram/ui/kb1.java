package org.telegram.ui;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kb1 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ vc1 b;

    public /* synthetic */ kb1(vc1 vc1Var, int i10) {
        this.a = i10;
        this.b = vc1Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                vc1 vc1Var = this.b;
                vc1Var.getClass();
                vc1Var.o1 = ((Float) obj).floatValue();
                vc1Var.y0.invalidate();
                vc1Var.W0();
                break;
            case 1:
                vc1 vc1Var2 = this.b;
                vc1Var2.W1 = (TL_stories.TL_premium_boostsStatus) obj;
                vc1Var2.V1 = true;
                vc1Var2.i1(true);
                vc1Var2.U1 = false;
                break;
            default:
                vc1.V(this.b, (ChannelBoostsController.CanApplyBoost) obj);
                break;
        }
    }
}
