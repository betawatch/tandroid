package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k20 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ q50 b;

    public /* synthetic */ k20(q50 q50Var, int i10) {
        this.a = i10;
        this.b = q50Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                q50.w(this.b, tLObject);
                break;
            default:
                q50.u(this.b, tLObject);
                break;
        }
    }
}
