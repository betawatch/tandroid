package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d30 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ i60 b;

    public /* synthetic */ d30(i60 i60Var, int i10) {
        this.a = i10;
        this.b = i60Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                i60.u(this.b, tLObject);
                break;
            default:
                i60.s(this.b, tLObject);
                break;
        }
    }
}
