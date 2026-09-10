package org.telegram.ui;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class gz implements ImageReceiver.ImageReceiverDelegate {
    public final /* synthetic */ hz a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ MessageObject c;
    public final /* synthetic */ iz d;

    public gz(iz izVar, hz hzVar, boolean z10, MessageObject messageObject) {
        this.d = izVar;
        this.a = hzVar;
        this.b = z10;
        this.c = messageObject;
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public final void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        hz hzVar = this.a;
        if (hzVar.r.getLottieAnimation() != null) {
            hzVar.r.getLottieAnimation().N(0, false, true);
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public final /* synthetic */ void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.m5.a(this, i10, str, drawable);
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public final void onAnimationReady(ImageReceiver imageReceiver) {
        MessageObject messageObject;
        if (this.b && (messageObject = this.c) != null && messageObject.isAnimatedAnimatedEmoji() && imageReceiver.getLottieAnimation() != null && imageReceiver.getLottieAnimation().x == null) {
            try {
                this.d.G.performHapticFeedback(3, 1);
            } catch (Exception unused) {
            }
        }
    }
}
