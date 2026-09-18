package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m5 implements e2.h {
    public final /* synthetic */ int a;
    public final /* synthetic */ v5 b;

    public /* synthetic */ m5(v5 v5Var, int i10) {
        this.a = i10;
        this.b = v5Var;
    }

    @Override // e2.h
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                this.b.S = (ChannelBoostsController.CanApplyBoost) obj;
                break;
            default:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.h6(5, this.b, (TL_stories.TL_premium_boostsStatus) obj));
                break;
        }
    }
}
