package org.telegram.ui.Components;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class uo implements h5.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ mp b;

    public /* synthetic */ uo(mp mpVar, int i10) {
        this.a = i10;
        this.b = mpVar;
    }

    @Override // h5.d
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                mp mpVar = this.b;
                mpVar.c0 = (TL_stories.TL_premium_boostsStatus) obj;
                mpVar.b0 = true;
                mpVar.E(true);
                mpVar.a0 = false;
                break;
            default:
                mp.m(this.b, (ChannelBoostsController.CanApplyBoost) obj);
                break;
        }
    }
}
