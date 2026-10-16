package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kc implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ gd b;

    public /* synthetic */ kc(gd gdVar, int i10) {
        this.a = i10;
        this.b = gdVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) obj;
                gd gdVar = this.b;
                gdVar.E = wallPaper;
                gdVar.F = wallPaper;
                gdVar.G = wallPaper;
                gdVar.X0(false);
                gdVar.a1(false);
                AndroidUtilities.runOnUIThread(new lc(gdVar, 1), 350L);
                break;
            case 1:
                gd.V(this.b, (ChannelBoostsController.CanApplyBoost) obj);
                break;
            default:
                this.b.W0((TL_stories.TL_premium_boostsStatus) obj);
                break;
        }
    }
}
