package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m5 implements d5.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ u5 b;

    public /* synthetic */ m5(u5 u5Var, int i9) {
        this.a = i9;
        this.b = u5Var;
    }

    @Override // d5.d
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                this.b.O = (ChannelBoostsController.CanApplyBoost) obj;
                break;
            default:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.l0(13, this.b, (TL_stories.TL_premium_boostsStatus) obj));
                break;
        }
    }
}
