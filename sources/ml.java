// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ml implements tl {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wl b;

    public /* synthetic */ ml(wl wlVar, byte b) {
        this.a = b;
        this.b = wlVar;
    }

    @Override // tl
    public final void a(TLRPC.Document document) {
        byte b = this.a;
        wl wlVar = this.b;
        switch (b) {
            case 0:
                wlVar.e = document;
                wlVar.i(false);
                break;
            default:
                wlVar.e = document;
                wlVar.i(false);
                break;
        }
    }
}
