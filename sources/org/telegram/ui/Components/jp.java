package org.telegram.ui.Components;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jp implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ zp b;

    public /* synthetic */ jp(zp zpVar, int i10) {
        this.a = i10;
        this.b = zpVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                zp zpVar = this.b;
                zpVar.e0 = (TL_stories.TL_premium_boostsStatus) obj;
                zpVar.d0 = true;
                zpVar.L(true);
                zpVar.c0 = false;
                break;
            default:
                zp.m(this.b, (ChannelBoostsController.CanApplyBoost) obj);
                break;
        }
    }
}
