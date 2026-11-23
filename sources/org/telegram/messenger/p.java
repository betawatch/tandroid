package org.telegram.messenger;

import android.view.PixelCopy;
import java.util.concurrent.CountDownLatch;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final /* synthetic */ class p implements PixelCopy.OnPixelCopyFinishedListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ p(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
    public final void onPixelCopyFinished(int i7) {
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
