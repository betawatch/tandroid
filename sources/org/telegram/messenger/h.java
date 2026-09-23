package org.telegram.messenger;

import android.view.PixelCopy;
import java.util.concurrent.CountDownLatch;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes.dex */
public final /* synthetic */ class h implements PixelCopy.OnPixelCopyFinishedListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
    public final void onPixelCopyFinished(int i10) {
        switch (this.a) {
            case 0:
                ((CountDownLatch) this.b).countDown();
                break;
            case 1:
                ((CountDownLatch) this.b).countDown();
                break;
            default:
                ((Runnable) this.b).run();
                break;
        }
    }
}
