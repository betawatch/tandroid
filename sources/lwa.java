// default package

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class lwa implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jxa b;

    public /* synthetic */ lwa(jxa jxaVar, byte b) {
        this.a = b;
        this.b = jxaVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        jxa jxaVar = this.b;
        switch (b) {
            case 0:
                hl.c3(new ova(jxaVar, tLObject, (byte) 1));
                break;
            case 1:
                hl.c3(new ova(jxaVar, tLObject, (byte) 2));
                break;
            case 2:
                hl.c3(new ova(jxaVar, tLObject, (byte) 3));
                break;
            case 3:
                hl.c3(new ova(jxaVar, tLObject, (byte) 4));
                break;
            default:
                hl.c3(new ova(jxaVar, tLObject, (byte) 0));
                break;
        }
    }
}
