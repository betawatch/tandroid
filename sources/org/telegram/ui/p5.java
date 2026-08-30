package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p5 implements h5.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ y5 b;

    public /* synthetic */ p5(y5 y5Var, int i10) {
        this.a = i10;
        this.b = y5Var;
    }

    @Override // h5.d
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                this.b.P = (ChannelBoostsController.CanApplyBoost) obj;
                break;
            default:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.b(19, this.b, (TL_stories.TL_premium_boostsStatus) obj));
                break;
        }
    }
}
