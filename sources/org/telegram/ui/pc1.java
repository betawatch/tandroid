package org.telegram.ui;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
