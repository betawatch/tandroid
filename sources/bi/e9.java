package bi;

import org.telegram.messenger.c20;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
