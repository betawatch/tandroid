package mg;

import org.telegram.messenger.q20;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class b0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ q20 b;
    public final /* synthetic */ q20 c;

    public /* synthetic */ b0(q20 q20Var, q20 q20Var2, int i10) {
        this.a = i10;
        this.b = q20Var;
        this.c = q20Var2;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.i0.g3(new li.s(tL_error, this.b, this.c, 7));
                break;
            default:
                org.telegram.messenger.i0.g3(new ag.q0((Object) tL_error, (Object) this.b, tLObject, (Object) this.c, 14));
                break;
        }
    }
}
