package org.telegram.ui.Components;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xo implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ np b;

    public /* synthetic */ xo(np npVar, int i10) {
        this.a = i10;
        this.b = npVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                np npVar = this.b;
                npVar.f0 = (TL_stories.TL_premium_boostsStatus) obj;
                npVar.e0 = true;
                npVar.F(true);
                npVar.d0 = false;
                break;
            default:
                np.m(this.b, (ChannelBoostsController.CanApplyBoost) obj);
                break;
        }
    }
}
