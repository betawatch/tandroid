package org.telegram.ui.Components;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
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
