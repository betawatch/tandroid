package org.telegram.ui.Components;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
