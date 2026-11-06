package bi;

import org.telegram.messenger.c20;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e9 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ c20 b;

    public /* synthetic */ e9(c20 c20Var, int i7) {
        this.a = i7;
        this.b = c20Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.h3(new j9(tLObject, this.b, 0));
                break;
            default:
                org.telegram.messenger.g0.h3(new di.z0(6, this.b, tL_error));
                break;
        }
    }
}
