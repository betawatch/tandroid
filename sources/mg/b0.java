package mg;

import org.telegram.messenger.r20;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ r20 b;
    public final /* synthetic */ r20 c;

    public /* synthetic */ b0(r20 r20Var, r20 r20Var2, int i10) {
        this.a = i10;
        this.b = r20Var;
        this.c = r20Var2;
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
