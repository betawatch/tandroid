// default package

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class hn0 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ p8c b;
    public final /* synthetic */ p8c c;

    public /* synthetic */ hn0(p8c p8cVar, p8c p8cVar2, byte b) {
        this.a = b;
        this.b = p8cVar;
        this.c = p8cVar2;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                gl.c3(new nn6(tL_error, this.b, this.c));
                break;
            default:
                gl.c3(new s67(tL_error, this.b, tLObject, this.c, (byte) 9));
                break;
        }
    }
}
