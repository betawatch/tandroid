package ki;

import org.telegram.messenger.np;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final /* synthetic */ class r2 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ s2 b;

    public /* synthetic */ r2(s2 s2Var, int i7) {
        this.a = i7;
        this.b = s2Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                x2 x2Var = this.b.d;
                if (tLObject instanceof TLRPC.TL_updates) {
                    np.s1(x2Var.I).O3((TLRPC.TL_updates) tLObject, false);
                }
                org.telegram.messenger.g0.h3(new x1(x2Var, 16));
                break;
            default:
                org.telegram.messenger.g0.h3(new n(this.b, tLObject, tL_error, 2));
                break;
        }
    }
}
