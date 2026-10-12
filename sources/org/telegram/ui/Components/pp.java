package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.be1;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class pp implements be1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ qp b;

    public /* synthetic */ pp(qp qpVar, int i10) {
        this.a = i10;
        this.b = qpVar;
    }

    @Override // org.telegram.ui.be1
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.a) {
            case 0:
                zp zpVar = this.b.a;
                zpVar.Y.dismissInternal();
                zpVar.dismiss();
                break;
            default:
                zp zpVar2 = this.b.a;
                zpVar2.Y.dismissInternal();
                zpVar2.dismiss();
                break;
        }
    }
}
