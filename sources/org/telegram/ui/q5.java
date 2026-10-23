package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q5 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ y5 b;

    public /* synthetic */ q5(y5 y5Var, int i10) {
        this.a = i10;
        this.b = y5Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                this.b.U = (ChannelBoostsController.CanApplyBoost) obj;
                break;
            default:
                AndroidUtilities.runOnUIThread(new h0(3, this.b, (TL_stories.TL_premium_boostsStatus) obj));
                break;
        }
    }
}
