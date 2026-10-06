package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final /* synthetic */ class d30 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ h60 b;

    public /* synthetic */ d30(h60 h60Var, int i10) {
        this.a = i10;
        this.b = h60Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                h60.u(this.b, tLObject);
                break;
            default:
                h60.s(this.b, tLObject);
                break;
        }
    }
}
