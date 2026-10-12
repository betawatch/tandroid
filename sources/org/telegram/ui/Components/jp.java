package org.telegram.ui.Components;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class jp implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ zp b;

    public /* synthetic */ jp(zp zpVar, int i10) {
        this.a = i10;
        this.b = zpVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                zp zpVar = this.b;
                zpVar.f0 = (TL_stories.TL_premium_boostsStatus) obj;
                zpVar.e0 = true;
                zpVar.G(true);
                zpVar.d0 = false;
                break;
            default:
                zp.n(this.b, (ChannelBoostsController.CanApplyBoost) obj);
                break;
        }
    }
}
