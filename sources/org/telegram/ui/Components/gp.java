package org.telegram.ui.Components;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gp implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ wp b;

    public /* synthetic */ gp(wp wpVar, int i10) {
        this.a = i10;
        this.b = wpVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                wp wpVar = this.b;
                wpVar.f0 = (TL_stories.TL_premium_boostsStatus) obj;
                wpVar.e0 = true;
                wpVar.G(true);
                wpVar.d0 = false;
                break;
            default:
                wp.n(this.b, (ChannelBoostsController.CanApplyBoost) obj);
                break;
        }
    }
}
