package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o91 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ sa1 b;

    public /* synthetic */ o91(sa1 sa1Var, int i10) {
        this.a = i10;
        this.b = sa1Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                sa1.U(this.b, tLObject);
                break;
            default:
                sa1.V(this.b, tLObject);
                break;
        }
    }
}
