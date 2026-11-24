// default package

import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class j48 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ oab b;

    public /* synthetic */ j48(oab oabVar, byte b) {
        this.a = b;
        this.b = oabVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        byte b2 = 0;
        oab oabVar = this.b;
        switch (b) {
            case 0:
                oabVar.U();
                break;
            case 1:
                oabVar.d0 = true;
                oabVar.k(true);
                break;
            case 2:
                if (oabVar.G != null) {
                    dab dabVar = oabVar.w;
                    if (dabVar != null) {
                        pi5.c = true;
                        dabVar.setLayerType(2, null);
                    }
                    oabVar.G.addListener(new x9b(oabVar, b2));
                    oabVar.G.setDuration(320L);
                    oabVar.G.setInterpolator(d53.h);
                    oabVar.G.start();
                    break;
                }
                break;
            case 3:
                oabVar.w0 = null;
                oabVar.U();
                break;
            case 4:
                oabVar.P(true);
                break;
            case 5:
                oabVar.W();
                lab labVar = oabVar.t0;
                ImageReceiver imageReceiver = labVar.b;
                if (imageReceiver != null) {
                    imageReceiver.v0(false, true);
                }
                ImageReceiver imageReceiver2 = labVar.c;
                if (imageReceiver2 != null) {
                    imageReceiver2.v0(false, true);
                    break;
                }
                break;
            default:
                oabVar.i();
                break;
        }
    }
}
