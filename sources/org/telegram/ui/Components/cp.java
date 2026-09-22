package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.vd1;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cp implements vd1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ dp b;

    public /* synthetic */ cp(dp dpVar, int i10) {
        this.a = i10;
        this.b = dpVar;
    }

    @Override // org.telegram.ui.vd1
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
