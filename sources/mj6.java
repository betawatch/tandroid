// default package

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class mj6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ck6 b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ TLObject d;

    public /* synthetic */ mj6(ck6 ck6Var, TLRPC.TL_error tL_error, TLObject tLObject, byte b) {
        this.a = b;
        this.b = ck6Var;
        this.c = tL_error;
        this.d = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        TLObject tLObject = this.d;
        TLRPC.TL_error tL_error = this.c;
        ck6 ck6Var = this.b;
        switch (b) {
            case 0:
                ck6Var.f0(tLObject, tL_error);
                break;
            default:
                ck6Var.getNotificationCenter().d(new mj6(ck6Var, tL_error, tLObject, (byte) 0));
                break;
        }
    }
}
