package di;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.v60;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class g6 implements RequestDelegate {
    public final /* synthetic */ long a;
    public final /* synthetic */ v60 b;
    public final /* synthetic */ y6 c;

    public g6(y6 y6Var, long j3, v60 v60Var) {
        this.c = y6Var;
        this.a = j3;
        this.b = v60Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        org.telegram.messenger.g0.h3(new bi.w2(this, tLObject, this.a, this.b, 9));
    }
}
