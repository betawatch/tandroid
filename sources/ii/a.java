package ii;

import org.telegram.messenger.q10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ q10 b;
    public final /* synthetic */ TLObject c;
    public final /* synthetic */ TLRPC.TL_error d;

    public /* synthetic */ a(q10 q10Var, TLObject tLObject, TLRPC.TL_error tL_error, int i7) {
        this.a = i7;
        this.b = q10Var;
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
