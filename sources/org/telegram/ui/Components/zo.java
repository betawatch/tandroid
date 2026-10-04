package org.telegram.ui.Components;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class zo implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ pp b;

    public /* synthetic */ zo(pp ppVar, int i10) {
        this.a = i10;
        this.b = ppVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                pp ppVar = this.b;
                ppVar.f0 = (TL_stories.TL_premium_boostsStatus) obj;
                ppVar.e0 = true;
                ppVar.D(true);
                ppVar.d0 = false;
                break;
            default:
                pp.m(this.b, (ChannelBoostsController.CanApplyBoost) obj);
                break;
        }
    }
}
