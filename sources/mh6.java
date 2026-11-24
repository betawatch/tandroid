// default package

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class mh6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ yh6 b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ TLObject d;

    public /* synthetic */ mh6(yh6 yh6Var, TLRPC.TL_error tL_error, TLObject tLObject, byte b) {
        this.a = b;
        this.b = yh6Var;
        this.c = tL_error;
        this.d = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        TLObject tLObject = this.d;
        TLRPC.TL_error tL_error = this.c;
        yh6 yh6Var = this.b;
        switch (b) {
            case 0:
                yh6Var.getNotificationCenter().d(new mh6(yh6Var, tL_error, tLObject, (byte) 1));
                break;
            default:
                yh6Var.f0(tLObject, tL_error);
                break;
        }
    }
}
