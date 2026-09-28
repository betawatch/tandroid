package org.telegram.ui.Components;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final /* synthetic */ class yo implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ op b;

    public /* synthetic */ yo(op opVar, int i10) {
        this.a = i10;
        this.b = opVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                op opVar = this.b;
                opVar.f0 = (TL_stories.TL_premium_boostsStatus) obj;
                opVar.e0 = true;
                opVar.F(true);
                opVar.d0 = false;
                break;
            default:
                op.m(this.b, (ChannelBoostsController.CanApplyBoost) obj);
                break;
        }
    }
}
