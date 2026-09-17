package org.telegram.ui.Components;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vo implements e2.h {
    public final /* synthetic */ int a;
    public final /* synthetic */ lp b;

    public /* synthetic */ vo(lp lpVar, int i10) {
        this.a = i10;
        this.b = lpVar;
    }

    @Override // e2.h
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                lp lpVar = this.b;
                lpVar.f0 = (TL_stories.TL_premium_boostsStatus) obj;
                lpVar.e0 = true;
                lpVar.F(true);
                lpVar.d0 = false;
                break;
            default:
                lp.m(this.b, (ChannelBoostsController.CanApplyBoost) obj);
                break;
        }
    }
}
