package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
