package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
                AndroidUtilities.runOnUIThread(new m4(1, this.b, (TL_stories.TL_premium_boostsStatus) obj));
                break;
        }
    }
}
