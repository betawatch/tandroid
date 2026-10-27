package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gc implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ bd b;

    public /* synthetic */ gc(bd bdVar, int i10) {
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
                bdVar.a1(false);
                bdVar.d1(false);
                AndroidUtilities.runOnUIThread(new hc(bdVar, 1), 350L);
                break;
            case 1:
                bd.W(this.b, (ChannelBoostsController.CanApplyBoost) obj);
                break;
            default:
                this.b.Z0((TL_stories.TL_premium_boostsStatus) obj);
                break;
        }
    }
}
