// default package

import android.view.PixelCopy;
import java.util.concurrent.CountDownLatch;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class gk implements PixelCopy.OnPixelCopyFinishedListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gk(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
    public final void onPixelCopyFinished(int i) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((CountDownLatch) obj).countDown();
                break;
            case 1:
                ((CountDownLatch) obj).countDown();
                break;
            default:
                ((Runnable) obj).run();
                break;
        }
    }
}
