package di;

import org.telegram.messenger.z10;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class v7 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ z10 b;

    public /* synthetic */ v7(z10 z10Var, int i7) {
        this.a = i7;
        this.b = z10Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.h3(new a8(tLObject, this.b, 0));
                break;
            default:
                org.telegram.messenger.g0.h3(new s2(27, this.b, tL_error));
                break;
        }
    }
}
