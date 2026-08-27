package org.telegram.ui.Components;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ko implements d5.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ ap b;

    public /* synthetic */ ko(ap apVar, int i10) {
        this.a = i10;
        this.b = apVar;
    }

    @Override // d5.d
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                ap apVar = this.b;
                apVar.b0 = (TL_stories.TL_premium_boostsStatus) obj;
                apVar.a0 = true;
                apVar.F(true);
                apVar.Z = false;
                break;
            default:
                ap.m(this.b, (ChannelBoostsController.CanApplyBoost) obj);
                break;
        }
    }
}
