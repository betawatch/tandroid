package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n5 implements f5.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ v5 b;

    public /* synthetic */ n5(v5 v5Var, int i10) {
        this.a = i10;
        this.b = v5Var;
    }

    @Override // f5.d
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                this.b.O = (ChannelBoostsController.CanApplyBoost) obj;
                break;
            default:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.c(10, this.b, (TL_stories.TL_premium_boostsStatus) obj));
                break;
        }
    }
}
