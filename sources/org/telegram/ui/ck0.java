package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class ck0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ ll0 b;

    public /* synthetic */ ck0(ll0 ll0Var, int i10) {
        this.a = i10;
        this.b = ll0Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                ll0 ll0Var = this.b;
                org.telegram.messenger.i0.g3(new qd0(ll0Var, tL_error, tLObject, false, 13));
                break;
            case 1:
                org.telegram.messenger.i0.g3(new uf0(13, this.b, tL_error));
                break;
            case 2:
                org.telegram.messenger.i0.g3(new xj0(this.b, 5));
                break;
            default:
                org.telegram.messenger.i0.g3(new uf0(12, this.b, tLObject));
                break;
        }
    }
}
