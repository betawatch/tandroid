package ci;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x7 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ e9 b;

    public /* synthetic */ x7(e9 e9Var, int i3) {
        this.a = i3;
        this.b = e9Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.h3(new a8(this.b, tLObject, 0));
                break;
            case 1:
                org.telegram.messenger.g0.h3(new a8(this.b, tLObject, 1));
                break;
            case 2:
                org.telegram.messenger.g0.h3(new a8(this.b, tLObject, 2));
                break;
            case 3:
                org.telegram.messenger.g0.h3(new a8(this.b, tLObject, 3));
                break;
            default:
                org.telegram.messenger.g0.h3(new a8(this.b, tLObject, 4));
                break;
        }
    }
}
