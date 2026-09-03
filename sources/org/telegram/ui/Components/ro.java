package org.telegram.ui.Components;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ro implements h5.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ jp b;

    public /* synthetic */ ro(jp jpVar, int i10) {
        this.a = i10;
        this.b = jpVar;
    }

    @Override // h5.d
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                jp jpVar = this.b;
                jpVar.c0 = (TL_stories.TL_premium_boostsStatus) obj;
                jpVar.b0 = true;
                jpVar.E(true);
                jpVar.a0 = false;
                break;
            default:
                jp.m(this.b, (ChannelBoostsController.CanApplyBoost) obj);
                break;
        }
    }
}
