package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p5 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ x5 b;

    public /* synthetic */ p5(x5 x5Var, int i10) {
        this.a = i10;
        this.b = x5Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                this.b.U = (ChannelBoostsController.CanApplyBoost) obj;
                break;
            default:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.m0(14, this.b, (TL_stories.TL_premium_boostsStatus) obj));
                break;
        }
    }
}
