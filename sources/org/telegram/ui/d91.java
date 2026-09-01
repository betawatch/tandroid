package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d91 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ ha1 b;

    public /* synthetic */ d91(ha1 ha1Var, int i10) {
        this.a = i10;
        this.b = ha1Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                ha1.U(this.b, tLObject);
                break;
            default:
                ha1.V(this.b, tLObject);
                break;
        }
    }
}
