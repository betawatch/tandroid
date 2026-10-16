package org.telegram.ui.Components;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
