package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class da1 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ hb1 b;

    public /* synthetic */ da1(hb1 hb1Var, int i10) {
        this.a = i10;
        this.b = hb1Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                hb1.U(this.b, tLObject);
                break;
            default:
                hb1.V(this.b, tLObject);
                break;
        }
    }
}
