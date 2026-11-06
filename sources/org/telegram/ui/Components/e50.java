package org.telegram.ui.Components;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e50 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ g50 b;

    public /* synthetic */ e50(g50 g50Var, int i7) {
        this.a = i7;
        this.b = g50Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.h3(new ng(this.b, tL_error, tLObject, 9));
                break;
            default:
                org.telegram.messenger.g0.h3(new fq(24, this.b, tL_error));
                break;
        }
    }
}
