package org.telegram.ui;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class q11 implements ImageReceiver.ImageReceiverDelegate {
    public final /* synthetic */ Runnable[] a;

    public q11(Runnable[] runnableArr) {
        this.a = runnableArr;
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public final void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        if (imageReceiver.hasBitmapImage()) {
            Runnable[] runnableArr = this.a;
            if (runnableArr[0] != null) {
                org.telegram.ui.Components.xi0 lottieAnimation = imageReceiver.getLottieAnimation();
                if (lottieAnimation == null) {
                    runnableArr[0].run();
                    runnableArr[0] = null;
                } else if (lottieAnimation.w()) {
                    lottieAnimation.C0 = new f01(runnableArr, 5);
                } else {
                    runnableArr[0].run();
                    runnableArr[0] = null;
                }
            }
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public final /* synthetic */ void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.h5.a(this, i10, str, drawable);
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public final /* synthetic */ void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.h5.b(this, imageReceiver);
    }
}
