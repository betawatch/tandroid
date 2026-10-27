package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.uc1;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qp implements uc1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ rp b;

    public /* synthetic */ qp(rp rpVar, int i10) {
        this.a = i10;
        this.b = rpVar;
    }

    @Override // org.telegram.ui.uc1
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.a) {
            case 0:
                zp zpVar = this.b.a;
                zpVar.X.dismissInternal();
                zpVar.dismiss();
                break;
            default:
                zp zpVar2 = this.b.a;
                zpVar2.X.dismissInternal();
                zpVar2.dismiss();
                break;
        }
    }
}
