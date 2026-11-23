package ii;

import org.telegram.messenger.r10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r10 b;
    public final /* synthetic */ TLObject c;
    public final /* synthetic */ TLRPC.TL_error d;

    public /* synthetic */ a(r10 r10Var, TLObject tLObject, TLRPC.TL_error tL_error, int i7) {
        this.a = i7;
        this.b = r10Var;
        this.c = tLObject;
        this.d = tL_error;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                TLObject tLObject = this.c;
                this.b.a(tLObject instanceof TLRPC.TL_payments_starsRevenueStats ? ((TLRPC.TL_payments_starsRevenueStats) tLObject).status : null, this.d);
                break;
            default:
                this.b.a(this.c, this.d);
                break;
        }
    }
}
