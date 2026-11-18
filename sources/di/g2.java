package di;

import org.telegram.messenger.x10;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class g2 implements RequestDelegate {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ f6 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;
    public final /* synthetic */ Object f;

    public /* synthetic */ g2(f6 f6Var, long j3, long j10, x10 x10Var, long j11) {
        this.b = f6Var;
        this.c = j3;
        this.d = j10;
        this.f = x10Var;
        this.e = j11;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.g3(new u2(this.b, (org.telegram.ui.ActionBar.u1) this.f, tLObject, this.c, this.d, this.e, tL_error));
                break;
            default:
                org.telegram.messenger.g0.g3(new u2(this.b, tLObject, this.c, this.d, (x10) this.f, tL_error, this.e));
                break;
        }
    }

    public /* synthetic */ g2(f6 f6Var, org.telegram.ui.ActionBar.u1 u1Var, long j3, long j10, long j11) {
        this.b = f6Var;
        this.f = u1Var;
        this.c = j3;
        this.d = j10;
        this.e = j11;
    }
}
