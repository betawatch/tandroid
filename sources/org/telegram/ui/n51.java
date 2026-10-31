package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class n51 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ u61 b;

    public /* synthetic */ n51(u61 u61Var, int i10) {
        this.a = i10;
        this.b = u61Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                u61.Z(this.b, tLObject);
                break;
            default:
                u61.Y(this.b, tLObject);
                break;
        }
    }
}
