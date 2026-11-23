package di;

import org.telegram.messenger.w10;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class h2 implements RequestDelegate {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ f6 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;
    public final /* synthetic */ Object f;

    public /* synthetic */ h2(f6 f6Var, long j3, long j10, w10 w10Var, long j11) {
        this.b = f6Var;
        this.c = j3;
        this.d = j10;
        this.f = w10Var;
        this.e = j11;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.g3(new v2(this.b, (org.telegram.ui.ActionBar.t1) this.f, tLObject, this.c, this.d, this.e, tL_error));
                break;
            default:
                org.telegram.messenger.g0.g3(new v2(this.b, tLObject, this.c, this.d, (w10) this.f, tL_error, this.e));
                break;
        }
    }

    public /* synthetic */ h2(f6 f6Var, org.telegram.ui.ActionBar.t1 t1Var, long j3, long j10, long j11) {
        this.b = f6Var;
        this.f = t1Var;
        this.c = j3;
        this.d = j10;
        this.e = j11;
    }
}
