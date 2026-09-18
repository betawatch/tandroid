package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.wd1;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cp implements wd1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ dp b;

    public /* synthetic */ cp(dp dpVar, int i10) {
        this.a = i10;
        this.b = dpVar;
    }

    @Override // org.telegram.ui.wd1
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.a) {
            case 0:
                mp mpVar = this.b.a;
                mpVar.Y.dismissInternal();
                mpVar.dismiss();
                break;
            default:
                mp mpVar2 = this.b.a;
                mpVar2.Y.dismissInternal();
                mpVar2.dismiss();
                break;
        }
    }
}
