package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b30 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ g60 b;

    public /* synthetic */ b30(g60 g60Var, int i10) {
        this.a = i10;
        this.b = g60Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                g60.w(this.b, tLObject);
                break;
            default:
                g60.u(this.b, tLObject);
                break;
        }
    }
}
