package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
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
