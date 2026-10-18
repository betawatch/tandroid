package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hc implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ dd b;

    public /* synthetic */ hc(dd ddVar, int i10) {
        this.a = i10;
        this.b = ddVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) obj;
                dd ddVar = this.b;
                ddVar.E = wallPaper;
                ddVar.F = wallPaper;
                ddVar.G = wallPaper;
                ddVar.X0(false);
                ddVar.a1(false);
                AndroidUtilities.runOnUIThread(new ic(ddVar, 1), 350L);
                break;
            case 1:
                dd.V(this.b, (ChannelBoostsController.CanApplyBoost) obj);
                break;
            default:
                this.b.W0((TL_stories.TL_premium_boostsStatus) obj);
                break;
        }
    }
}
