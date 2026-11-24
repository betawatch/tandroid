// default package

import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class d1b implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ n1b b;

    public /* synthetic */ d1b(n1b n1bVar, byte b) {
        this.a = b;
        this.b = n1bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        n1b n1bVar = this.b;
        switch (b) {
            case 0:
                l1b l1bVar = n1bVar.a0;
                if (l1bVar != null) {
                    if (l1bVar.r != null) {
                        MediaController.w().d(n1bVar.a0.r);
                        bc4.G(n1bVar.a).b(n1bVar.a0.b, false);
                        n1bVar.a0.getClass();
                    }
                    n1bVar.a0.a();
                    n1bVar.a0 = null;
                }
                n1bVar.e0.a();
                n1bVar.e0 = null;
                break;
            default:
                jlb jlbVar = n1bVar.T;
                if (jlbVar != null) {
                    n1bVar.T = null;
                    n1bVar.removeView(jlbVar);
                    break;
                }
                break;
        }
    }
}
