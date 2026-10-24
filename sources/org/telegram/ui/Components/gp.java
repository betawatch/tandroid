package org.telegram.ui.Components;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
                wpVar.e0 = (TL_stories.TL_premium_boostsStatus) obj;
                wpVar.d0 = true;
                wpVar.L(true);
                wpVar.c0 = false;
                break;
            default:
                wp.m(this.b, (ChannelBoostsController.CanApplyBoost) obj);
                break;
        }
    }
}
