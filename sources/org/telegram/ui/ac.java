package org.telegram.ui;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ac implements f5.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ vc b;

    public /* synthetic */ ac(vc vcVar, int i10) {
        this.a = i10;
        this.b = vcVar;
    }

    @Override // f5.d
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                vc.W(this.b, (ChannelBoostsController.CanApplyBoost) obj);
                break;
            default:
                this.b.W0((TL_stories.TL_premium_boostsStatus) obj);
                break;
        }
    }
}
