package ci;

import org.telegram.messenger.u10;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e8 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ u10 b;

    public /* synthetic */ e8(u10 u10Var, int i3) {
        this.a = i3;
        this.b = u10Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.h3(new j8(tLObject, this.b, 0));
                break;
            default:
                org.telegram.messenger.g0.h3(new ei.b0(9, this.b, tL_error));
                break;
        }
    }
}
