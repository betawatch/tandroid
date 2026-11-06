package di;

import org.telegram.messenger.c20;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class h6 implements RequestDelegate {
    public final /* synthetic */ long a;
    public final /* synthetic */ c20 b;
    public final /* synthetic */ y6 c;

    public h6(y6 y6Var, long j3, c20 c20Var) {
        this.c = y6Var;
        this.a = j3;
        this.b = c20Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        org.telegram.messenger.g0.h3(new bi.w2(this, tLObject, this.a, this.b, 10));
    }
}
