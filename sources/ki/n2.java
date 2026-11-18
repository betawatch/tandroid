package ki;

import org.telegram.messenger.mp;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final /* synthetic */ class n2 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ o2 b;

    public /* synthetic */ n2(o2 o2Var, int i7) {
        this.a = i7;
        this.b = o2Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                t2 t2Var = this.b.d;
                if (tLObject instanceof TLRPC.TL_updates) {
                    mp.u1(t2Var.I).V3((TLRPC.TL_updates) tLObject, false);
                }
                org.telegram.messenger.g0.g3(new t1(t2Var, 16));
                break;
            default:
                org.telegram.messenger.g0.g3(new kg.i0(this.b, tLObject, tL_error, 6));
                break;
        }
    }
}
