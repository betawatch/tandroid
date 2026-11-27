// default package

import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class b3b implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ k3b b;

    public /* synthetic */ b3b(k3b k3bVar, byte b) {
        this.a = b;
        this.b = k3bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        k3b k3bVar = this.b;
        switch (b) {
            case 0:
                hnb hnbVar = k3bVar.T;
                if (hnbVar != null) {
                    k3bVar.T = null;
                    k3bVar.removeView(hnbVar);
                    break;
                }
                break;
            default:
                i3b i3bVar = k3bVar.a0;
                if (i3bVar != null) {
                    if (i3bVar.r != null) {
                        MediaController.z().d(k3bVar.a0.r);
                        xb4.G(k3bVar.a).b(k3bVar.a0.b, false);
                        k3bVar.a0.getClass();
                    }
                    k3bVar.a0.a();
                    k3bVar.a0 = null;
                }
                k3bVar.e0.a();
                k3bVar.e0 = null;
                break;
        }
    }
}
