package di;

import org.telegram.messenger.w10;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class y7 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ w10 b;

    public /* synthetic */ y7(w10 w10Var, int i7) {
        this.a = i7;
        this.b = w10Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.g3(new e8(tLObject, this.b, 0));
                break;
            default:
                org.telegram.messenger.g0.g3(new fi.l4(1, this.b, tL_error));
                break;
        }
    }
}
