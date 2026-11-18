package di;

import org.telegram.messenger.mp;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class l7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ x8 b;
    public final /* synthetic */ TLRPC.TL_payments_paymentResult c;

    public /* synthetic */ l7(x8 x8Var, TLRPC.TL_payments_paymentResult tL_payments_paymentResult, int i7) {
        this.a = i7;
        this.b = x8Var;
        this.c = tL_payments_paymentResult;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                mp.u1(this.b.a).V3(this.c.updates, false);
                break;
            case 1:
                mp.u1(this.b.a).V3(this.c.updates, false);
                break;
            case 2:
                mp.u1(this.b.a).V3(this.c.updates, false);
                break;
            case 3:
                mp.u1(this.b.a).V3(this.c.updates, false);
                break;
            default:
                mp.u1(this.b.a).V3(this.c.updates, false);
                break;
        }
    }
}
