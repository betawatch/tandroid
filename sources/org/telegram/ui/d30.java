package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
