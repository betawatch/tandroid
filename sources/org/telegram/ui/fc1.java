package org.telegram.ui;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final /* synthetic */ class fc1 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ pd1 b;

    public /* synthetic */ fc1(pd1 pd1Var, int i10) {
        this.a = i10;
        this.b = pd1Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                pd1 pd1Var = this.b;
                pd1Var.getClass();
                pd1Var.n1 = ((Float) obj).floatValue();
                pd1Var.x0.invalidate();
                pd1Var.V0();
                break;
            case 1:
                pd1 pd1Var2 = this.b;
                pd1Var2.V1 = (TL_stories.TL_premium_boostsStatus) obj;
                pd1Var2.U1 = true;
                pd1Var2.h1(true);
                pd1Var2.T1 = false;
                break;
            default:
                pd1.S(this.b, (ChannelBoostsController.CanApplyBoost) obj);
                break;
        }
    }
}
