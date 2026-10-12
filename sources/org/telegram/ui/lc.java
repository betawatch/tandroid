package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class lc implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ hd b;

    public /* synthetic */ lc(hd hdVar, int i10) {
        this.a = i10;
        this.b = hdVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) obj;
                hd hdVar = this.b;
                hdVar.E = wallPaper;
                hdVar.F = wallPaper;
                hdVar.G = wallPaper;
                hdVar.X0(false);
                hdVar.a1(false);
                AndroidUtilities.runOnUIThread(new mc(hdVar, 1), 350L);
                break;
            case 1:
                hd.V(this.b, (ChannelBoostsController.CanApplyBoost) obj);
                break;
            default:
                this.b.W0((TL_stories.TL_premium_boostsStatus) obj);
                break;
        }
    }
}
