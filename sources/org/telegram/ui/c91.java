package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c91 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ ga1 b;

    public /* synthetic */ c91(ga1 ga1Var, int i10) {
        this.a = i10;
        this.b = ga1Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                ga1.U(this.b, tLObject);
                break;
            default:
                ga1.V(this.b, tLObject);
                break;
        }
    }
}
