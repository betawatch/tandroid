// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class avc implements qac {
    public final /* synthetic */ byte a;
    public final /* synthetic */ bvc b;

    public /* synthetic */ avc(bvc bvcVar, byte b) {
        this.a = b;
        this.b = bvcVar;
    }

    @Override // qac
    public final void a(Object obj) {
        byte b = this.a;
        bvc bvcVar = this.b;
        dvc dvcVar = (dvc) obj;
        switch (b) {
            case 0:
                bvcVar.l = null;
                bvcVar.i = true;
                TLRPC.TL_webPage tL_webPage = bvcVar.j;
                if (tL_webPage != null) {
                    dvc.o(tL_webPage);
                }
                bvcVar.j = dvcVar.c;
                bvcVar.c();
                break;
            default:
                bvcVar.l = null;
                bvcVar.i = true;
                TLRPC.TL_webPage tL_webPage2 = bvcVar.j;
                if (tL_webPage2 != null) {
                    dvc.o(tL_webPage2);
                }
                bvcVar.j = dvcVar.c;
                bvcVar.c();
                break;
        }
    }
}
