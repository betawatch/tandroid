// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
