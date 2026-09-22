package org.telegram.ui.Components;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
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
                mpVar.E(true);
                mpVar.d0 = false;
                break;
            default:
                mp.m(this.b, (ChannelBoostsController.CanApplyBoost) obj);
                break;
        }
    }
}
