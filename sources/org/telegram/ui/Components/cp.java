package org.telegram.ui.Components;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class cp implements e2.h {
    public final /* synthetic */ int a;
    public final /* synthetic */ sp b;

    public /* synthetic */ cp(sp spVar, int i10) {
        this.a = i10;
        this.b = spVar;
    }

    @Override // e2.h
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                sp spVar = this.b;
                spVar.f0 = (TL_stories.TL_premium_boostsStatus) obj;
                spVar.e0 = true;
                spVar.E(true);
                spVar.d0 = false;
                break;
            default:
                sp.m(this.b, (ChannelBoostsController.CanApplyBoost) obj);
                break;
        }
    }
}
