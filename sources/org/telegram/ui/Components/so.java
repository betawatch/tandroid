package org.telegram.ui.Components;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class so implements h5.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ kp b;

    public /* synthetic */ so(kp kpVar, int i10) {
        this.a = i10;
        this.b = kpVar;
    }

    @Override // h5.d
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                kp kpVar = this.b;
                kpVar.c0 = (TL_stories.TL_premium_boostsStatus) obj;
                kpVar.b0 = true;
                kpVar.E(true);
                kpVar.a0 = false;
                break;
            default:
                kp.m(this.b, (ChannelBoostsController.CanApplyBoost) obj);
                break;
        }
    }
}
