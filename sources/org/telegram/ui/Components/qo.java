package org.telegram.ui.Components;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qo implements f5.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ gp b;

    public /* synthetic */ qo(gp gpVar, int i10) {
        this.a = i10;
        this.b = gpVar;
    }

    @Override // f5.d
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                gp gpVar = this.b;
                gpVar.b0 = (TL_stories.TL_premium_boostsStatus) obj;
                gpVar.a0 = true;
                gpVar.E(true);
                gpVar.Z = false;
                break;
            default:
                gp.m(this.b, (ChannelBoostsController.CanApplyBoost) obj);
                break;
        }
    }
}
