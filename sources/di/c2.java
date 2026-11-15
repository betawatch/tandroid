package di;

import org.telegram.messenger.z10;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class c2 implements RequestDelegate {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ c6 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;
    public final /* synthetic */ Object f;

    public /* synthetic */ c2(c6 c6Var, long j3, long j10, z10 z10Var, long j11) {
        this.b = c6Var;
        this.c = j3;
        this.d = j10;
        this.f = z10Var;
        this.e = j11;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.h3(new k2(this.b, (org.telegram.ui.ActionBar.t1) this.f, tLObject, this.c, this.d, this.e, tL_error));
                break;
            default:
                org.telegram.messenger.g0.h3(new k2(this.b, tLObject, this.c, this.d, (z10) this.f, tL_error, this.e));
                break;
        }
    }

    public /* synthetic */ c2(c6 c6Var, org.telegram.ui.ActionBar.t1 t1Var, long j3, long j10, long j11) {
        this.b = c6Var;
        this.f = t1Var;
        this.c = j3;
        this.d = j10;
        this.e = j11;
    }
}
