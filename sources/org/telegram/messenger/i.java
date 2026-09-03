package org.telegram.messenger;

import android.view.PixelCopy;
import java.util.concurrent.CountDownLatch;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final /* synthetic */ class i implements PixelCopy.OnPixelCopyFinishedListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i(Object obj, int i10) {
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
