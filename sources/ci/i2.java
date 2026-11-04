package ci;

import org.telegram.messenger.u10;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i2 implements RequestDelegate {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ l6 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;
    public final /* synthetic */ Object f;

    public /* synthetic */ i2(l6 l6Var, long j10, long j11, u10 u10Var, long j12) {
        this.b = l6Var;
        this.c = j10;
        this.d = j11;
        this.f = u10Var;
        this.e = j12;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.h3(new q2(this.b, (org.telegram.ui.ActionBar.s1) this.f, tLObject, this.c, this.d, this.e, tL_error));
                break;
            default:
                org.telegram.messenger.g0.h3(new q2(this.b, tLObject, this.c, this.d, (u10) this.f, tL_error, this.e));
                break;
        }
    }

    public /* synthetic */ i2(l6 l6Var, org.telegram.ui.ActionBar.s1 s1Var, long j10, long j11, long j12) {
        this.b = l6Var;
        this.f = s1Var;
        this.c = j10;
        this.d = j11;
        this.e = j12;
    }
}
