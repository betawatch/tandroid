package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gc implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ cd b;

    public /* synthetic */ gc(cd cdVar, int i10) {
        this.a = i10;
        this.b = cdVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) obj;
                cd cdVar = this.b;
                cdVar.E = wallPaper;
                cdVar.F = wallPaper;
                cdVar.G = wallPaper;
                cdVar.X0(false);
                cdVar.a1(false);
                AndroidUtilities.runOnUIThread(new hc(cdVar, 1), 350L);
                break;
            case 1:
                cd.T(this.b, (ChannelBoostsController.CanApplyBoost) obj);
                break;
            default:
                this.b.W0((TL_stories.TL_premium_boostsStatus) obj);
                break;
        }
    }
}
