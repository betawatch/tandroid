package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class m5 implements e2.h {
    public final /* synthetic */ int a;
    public final /* synthetic */ w5 b;

    public /* synthetic */ m5(w5 w5Var, int i10) {
        this.a = i10;
        this.b = w5Var;
    }

    @Override // e2.h
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                this.b.S = (ChannelBoostsController.CanApplyBoost) obj;
                break;
            default:
                AndroidUtilities.runOnUIThread(new n(4, this.b, (TL_stories.TL_premium_boostsStatus) obj));
                break;
        }
    }
}
