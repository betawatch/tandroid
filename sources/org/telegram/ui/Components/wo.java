package org.telegram.ui.Components;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
