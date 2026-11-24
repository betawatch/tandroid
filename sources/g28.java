// default package

import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final /* synthetic */ class g28 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ m8b b;

    public /* synthetic */ g28(m8b m8bVar, byte b) {
        this.a = b;
        this.b = m8bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        byte b2 = 0;
        m8b m8bVar = this.b;
        switch (b) {
            case 0:
                m8bVar.U();
                break;
            case 1:
                m8bVar.d0 = true;
                m8bVar.k(true);
                break;
            case 2:
                if (m8bVar.G != null) {
                    b8b b8bVar = m8bVar.w;
                    if (b8bVar != null) {
                        qg5.c = true;
                        b8bVar.setLayerType(2, null);
                    }
                    m8bVar.G.addListener(new v7b(m8bVar, b2));
                    m8bVar.G.setDuration(320L);
                    m8bVar.G.setInterpolator(s33.h);
                    m8bVar.G.start();
                    break;
                }
                break;
            case 3:
                m8bVar.w0 = null;
                m8bVar.U();
                break;
            case 4:
                m8bVar.P(true);
                break;
            case 5:
                m8bVar.W();
                j8b j8bVar = m8bVar.t0;
                ImageReceiver imageReceiver = j8bVar.b;
                if (imageReceiver != null) {
                    imageReceiver.v0(false, true);
                }
                ImageReceiver imageReceiver2 = j8bVar.c;
                if (imageReceiver2 != null) {
                    imageReceiver2.v0(false, true);
                    break;
                }
                break;
            default:
                m8bVar.i();
                break;
        }
    }
}
