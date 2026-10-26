package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
