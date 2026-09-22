package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
                AndroidUtilities.runOnUIThread(new l4(1, this.b, (TL_stories.TL_premium_boostsStatus) obj));
                break;
        }
    }
}
