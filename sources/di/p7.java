package di;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class p7 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ u8 b;

    public /* synthetic */ p7(u8 u8Var, int i7) {
        this.a = i7;
        this.b = u8Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.h3(new s7(this.b, tLObject, 0));
                break;
            case 1:
                org.telegram.messenger.g0.h3(new s7(this.b, tLObject, 1));
                break;
            case 2:
                org.telegram.messenger.g0.h3(new s7(this.b, tLObject, 2));
                break;
            case 3:
                org.telegram.messenger.g0.h3(new s7(this.b, tLObject, 3));
                break;
            default:
                org.telegram.messenger.g0.h3(new s7(this.b, tLObject, 4));
                break;
        }
    }
}
