package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h30 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ n60 b;

    public /* synthetic */ h30(n60 n60Var, int i10) {
        this.a = i10;
        this.b = n60Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                n60.w(this.b, tLObject);
                break;
            default:
                n60.u(this.b, tLObject);
                break;
        }
    }
}
