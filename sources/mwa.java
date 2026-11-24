// default package

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class mwa implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ uxa b;

    public /* synthetic */ mwa(uxa uxaVar, byte b) {
        this.a = b;
        this.b = uxaVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        uxa uxaVar = this.b;
        switch (b) {
            case 0:
                uxaVar.h0(tLObject);
                break;
            default:
                uxaVar.i0(tLObject);
                break;
        }
    }
}
