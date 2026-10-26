package org.telegram.ui.Components;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ip implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ yp b;

    public /* synthetic */ ip(yp ypVar, int i10) {
        this.a = i10;
        this.b = ypVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                yp ypVar = this.b;
                ypVar.e0 = (TL_stories.TL_premium_boostsStatus) obj;
                ypVar.d0 = true;
                ypVar.L(true);
                ypVar.c0 = false;
                break;
            default:
                yp.m(this.b, (ChannelBoostsController.CanApplyBoost) obj);
                break;
        }
    }
}
