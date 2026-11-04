package ei;

import org.telegram.messenger.u10;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class i6 implements RequestDelegate {
    public final /* synthetic */ long a;
    public final /* synthetic */ u10 b;
    public final /* synthetic */ z6 c;

    public i6(z6 z6Var, long j10, u10 u10Var) {
        this.c = z6Var;
        this.a = j10;
        this.b = u10Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        org.telegram.messenger.g0.h3(new ci.l2(this, tLObject, this.a, this.b, 10));
    }
}
