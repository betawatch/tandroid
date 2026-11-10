package hi;

import org.telegram.messenger.qp;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public final /* synthetic */ class u2 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ v2 b;

    public /* synthetic */ u2(v2 v2Var, int i7) {
        this.a = i7;
        this.b = v2Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                a3 a3Var = this.b.d;
                if (tLObject instanceof TLRPC.TL_updates) {
                    qp.s1(a3Var.H).O3((TLRPC.TL_updates) tLObject, false);
                }
                org.telegram.messenger.g0.h3(new x1(a3Var, 16));
                break;
            default:
                org.telegram.messenger.g0.h3(new fi.x1(this.b, tLObject, tL_error, false, 13));
                break;
        }
    }
}
