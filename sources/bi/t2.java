package bi;

import org.telegram.messenger.c20;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t2 implements RequestDelegate {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ k7 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;
    public final /* synthetic */ Object f;

    public /* synthetic */ t2(k7 k7Var, long j3, long j10, c20 c20Var, long j11) {
        this.b = k7Var;
        this.c = j3;
        this.d = j10;
        this.f = c20Var;
        this.e = j11;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.h3(new c3(this.b, (org.telegram.ui.ActionBar.u1) this.f, tLObject, this.c, this.d, this.e, tL_error));
                break;
            default:
                org.telegram.messenger.g0.h3(new c3(this.b, tLObject, this.c, this.d, (c20) this.f, tL_error, this.e));
                break;
        }
    }

    public /* synthetic */ t2(k7 k7Var, org.telegram.ui.ActionBar.u1 u1Var, long j3, long j10, long j11) {
        this.b = k7Var;
        this.f = u1Var;
        this.c = j3;
        this.d = j10;
        this.e = j11;
    }
}
