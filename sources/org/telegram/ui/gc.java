package org.telegram.ui;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gc implements e2.h {
    public final /* synthetic */ int a;
    public final /* synthetic */ ad b;

    public /* synthetic */ gc(ad adVar, int i10) {
        this.a = i10;
        this.b = adVar;
    }

    @Override // e2.h
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                ad.V(this.b, (ChannelBoostsController.CanApplyBoost) obj);
                break;
            default:
                this.b.W0((TL_stories.TL_premium_boostsStatus) obj);
                break;
        }
    }
}
