package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.wd1;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
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
