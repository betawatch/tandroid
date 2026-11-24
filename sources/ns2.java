// default package

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class ns2 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ i8c b;
    public final /* synthetic */ TLObject c;
    public final /* synthetic */ TLRPC.TL_error d;

    public /* synthetic */ ns2(i8c i8cVar, TLObject tLObject, TLRPC.TL_error tL_error, byte b) {
        this.a = b;
        this.b = i8cVar;
        this.c = tLObject;
        this.d = tL_error;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        TLRPC.TL_error tL_error = this.d;
        TLObject tLObject = this.c;
        i8c i8cVar = this.b;
        switch (b) {
            case 0:
                i8cVar.a(tLObject, tL_error);
                break;
            default:
                i8cVar.a(tLObject instanceof TLRPC.TL_payments_starsRevenueStats ? ((TLRPC.TL_payments_starsRevenueStats) tLObject).status : null, tL_error);
                break;
        }
    }
}
