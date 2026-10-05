package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n5 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ w5 b;

    public /* synthetic */ n5(w5 w5Var, int i10) {
        this.a = i10;
        this.b = w5Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                this.b.S = (ChannelBoostsController.CanApplyBoost) obj;
                break;
            default:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.g6(5, this.b, (TL_stories.TL_premium_boostsStatus) obj));
                break;
        }
    }
}
