package org.telegram.ui.Components;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wo implements e2.h {
    public final /* synthetic */ int a;
    public final /* synthetic */ mp b;

    public /* synthetic */ wo(mp mpVar, int i10) {
        this.a = i10;
        this.b = mpVar;
    }

    @Override // e2.h
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                mp mpVar = this.b;
                mpVar.f0 = (TL_stories.TL_premium_boostsStatus) obj;
                mpVar.e0 = true;
                mpVar.F(true);
                mpVar.d0 = false;
                break;
            default:
                mp.m(this.b, (ChannelBoostsController.CanApplyBoost) obj);
                break;
        }
    }
}
