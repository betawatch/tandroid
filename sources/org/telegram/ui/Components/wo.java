package org.telegram.ui.Components;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
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
