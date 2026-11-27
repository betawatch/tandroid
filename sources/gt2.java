// default package

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final /* synthetic */ class gt2 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ icc b;
    public final /* synthetic */ TLObject c;
    public final /* synthetic */ TLRPC.TL_error d;

    public /* synthetic */ gt2(icc iccVar, TLObject tLObject, TLRPC.TL_error tL_error, byte b) {
        this.a = b;
        this.b = iccVar;
        this.c = tLObject;
        this.d = tL_error;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        TLRPC.TL_error tL_error = this.d;
        TLObject tLObject = this.c;
        icc iccVar = this.b;
        switch (b) {
            case 0:
                iccVar.a(tLObject, tL_error);
                break;
            default:
                iccVar.a(tLObject instanceof TLRPC.TL_payments_starsRevenueStats ? ((TLRPC.TL_payments_starsRevenueStats) tLObject).status : null, tL_error);
                break;
        }
    }
}
