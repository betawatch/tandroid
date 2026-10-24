package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final /* synthetic */ class fc implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ bd b;

    public /* synthetic */ fc(bd bdVar, int i10) {
        this.a = i10;
        this.b = bdVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) obj;
                bd bdVar = this.b;
                bdVar.E = wallPaper;
                bdVar.F = wallPaper;
                bdVar.G = wallPaper;
                bdVar.Z0(false);
                bdVar.c1(false);
                AndroidUtilities.runOnUIThread(new gc(bdVar, 1), 350L);
                break;
            case 1:
                bd.V(this.b, (ChannelBoostsController.CanApplyBoost) obj);
                break;
            default:
                this.b.Y0((TL_stories.TL_premium_boostsStatus) obj);
                break;
        }
    }
}
