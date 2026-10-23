package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n20 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ u50 b;

    public /* synthetic */ n20(u50 u50Var, int i10) {
        this.a = i10;
        this.b = u50Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                u50.v(this.b, tLObject);
                break;
            default:
                u50.t(this.b, tLObject);
                break;
        }
    }
}
