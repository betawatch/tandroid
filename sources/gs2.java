// default package

import org.telegram.messenger.MediaController;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class gs2 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ gs2(int i, int i2, byte b) {
        this.a = b;
        this.b = i;
        this.c = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        int i = this.c;
        int i2 = this.b;
        switch (b) {
            case 0:
                ConnectionsManager.lambda$onConnectionStateChanged$15(i2, i);
                break;
            case 1:
                ConnectionsManager.lambda$onRequestNewServerIpAndPort$18(i2, i);
                break;
            case 2:
                ConnectionsManager.getInstance(i2).cancelRequest(i, true);
                break;
            case 3:
                ConnectionsManager.getInstance(i2).cancelRequest(i, true);
                break;
            case 4:
                ConnectionsManager.getInstance(i2).cancelRequest(i, true);
                break;
            case 5:
                String[] strArr = MediaController.W1;
                kk7.f(i2).k(kk7.l2, Integer.valueOf(i));
                break;
            default:
                ConnectionsManager.getInstance(i2).cancelRequest(i, true);
                break;
        }
    }
}
