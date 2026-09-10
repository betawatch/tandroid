package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class ba1 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ fb1 b;

    public /* synthetic */ ba1(fb1 fb1Var, int i10) {
        this.a = i10;
        this.b = fb1Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                fb1.U(this.b, tLObject);
                break;
            default:
                fb1.V(this.b, tLObject);
                break;
        }
    }
}
