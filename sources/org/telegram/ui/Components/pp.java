package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.sc1;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pp implements sc1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ qp b;

    public /* synthetic */ pp(qp qpVar, int i10) {
        this.a = i10;
        this.b = qpVar;
    }

    @Override // org.telegram.ui.sc1
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.a) {
            case 0:
                yp ypVar = this.b.a;
                ypVar.X.dismissInternal();
                ypVar.dismiss();
                break;
            default:
                yp ypVar2 = this.b.a;
                ypVar2.X.dismissInternal();
                ypVar2.dismiss();
                break;
        }
    }
}
