package org.telegram.ui;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ic implements e2.h {
    public final /* synthetic */ int a;
    public final /* synthetic */ cd b;

    public /* synthetic */ ic(cd cdVar, int i10) {
        this.a = i10;
        this.b = cdVar;
    }

    @Override // e2.h
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                cd.V(this.b, (ChannelBoostsController.CanApplyBoost) obj);
                break;
            default:
                this.b.W0((TL_stories.TL_premium_boostsStatus) obj);
                break;
        }
    }
}
