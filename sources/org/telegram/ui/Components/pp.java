package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.be1;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
