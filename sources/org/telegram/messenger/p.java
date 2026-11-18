package org.telegram.messenger;

import android.view.PixelCopy;
import java.util.concurrent.CountDownLatch;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
