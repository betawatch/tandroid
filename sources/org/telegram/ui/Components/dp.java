package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.nd1;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dp implements nd1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ep b;

    public /* synthetic */ dp(ep epVar, int i10) {
        this.a = i10;
        this.b = epVar;
    }

    @Override // org.telegram.ui.nd1
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.a) {
            case 0:
                np npVar = this.b.a;
                npVar.Y.dismissInternal();
                npVar.dismiss();
                break;
            default:
                np npVar2 = this.b.a;
                npVar2.Y.dismissInternal();
                npVar2.dismiss();
                break;
        }
    }
}
