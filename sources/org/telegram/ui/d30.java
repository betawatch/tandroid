package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class d30 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ j60 b;

    public /* synthetic */ d30(j60 j60Var, int i10) {
        this.a = i10;
        this.b = j60Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                j60.u(this.b, tLObject);
                break;
            default:
                j60.s(this.b, tLObject);
                break;
        }
    }
}
