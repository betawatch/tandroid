package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class oz implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ i00 b;

    public /* synthetic */ oz(i00 i00Var, int i10) {
        this.a = i10;
        this.b = i00Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.i0.g3(new xs(16, this.b, tLObject));
                break;
            default:
                org.telegram.messenger.i0.g3(new qq(this.b, tL_error, tLObject, 6));
                break;
        }
    }
}
