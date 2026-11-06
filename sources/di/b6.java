package di;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ea0;
import org.telegram.ui.pa0;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b6 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b6(Object obj, long j3, int i7) {
        this.a = i7;
        this.c = obj;
        this.b = j3;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.h3(new bi.d3((y6) this.c, this.b, tLObject, 5));
                break;
            default:
                pa0 pa0Var = (pa0) this.c;
                if (tLObject != null) {
                    org.telegram.messenger.g0.h3(new ea0(pa0Var, tLObject, this.b, 0));
                    break;
                }
                break;
        }
    }
}
