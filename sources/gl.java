// default package

import android.view.PixelCopy;
import java.util.concurrent.CountDownLatch;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class gl implements PixelCopy.OnPixelCopyFinishedListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gl(Object obj, byte b) {
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
