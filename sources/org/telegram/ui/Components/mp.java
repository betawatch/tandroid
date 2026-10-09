package org.telegram.ui.Components;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mp implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ cq b;

    public /* synthetic */ mp(cq cqVar, int i10) {
        this.a = i10;
        this.b = cqVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                cq cqVar = this.b;
                cqVar.f0 = (TL_stories.TL_premium_boostsStatus) obj;
                cqVar.e0 = true;
                cqVar.G(true);
                cqVar.d0 = false;
                break;
            default:
                cq.o(this.b, (ChannelBoostsController.CanApplyBoost) obj);
                break;
        }
    }
}
