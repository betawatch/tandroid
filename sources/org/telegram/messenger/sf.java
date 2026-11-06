package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final /* synthetic */ class sf implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ long c;
    public final /* synthetic */ c1 d;

    public /* synthetic */ sf(c1 c1Var, boolean z9, long j3, int i7) {
        this.a = i7;
        this.d = c1Var;
        this.b = z9;
        this.c = j3;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                g0.h3(new rg((ui) this.d, tLObject, this.b, this.c, 1));
                break;
            default:
                g0.h3(new rg((qp) this.d, tLObject, this.b, this.c, 3));
                break;
        }
    }
}
