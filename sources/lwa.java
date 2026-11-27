// default package

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
