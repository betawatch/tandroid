package ki;

import org.telegram.messenger.mp;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final /* synthetic */ class m2 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ n2 b;

    public /* synthetic */ m2(n2 n2Var, int i7) {
        this.a = i7;
        this.b = n2Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                s2 s2Var = this.b.d;
                if (tLObject instanceof TLRPC.TL_updates) {
                    mp.u1(s2Var.I).V3((TLRPC.TL_updates) tLObject, false);
                }
                org.telegram.messenger.g0.g3(new s1(s2Var, 16));
                break;
            default:
                org.telegram.messenger.g0.g3(new kg.y(this.b, tLObject, tL_error, 7));
                break;
        }
    }
}
