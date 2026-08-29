package org.telegram.ui;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class py implements ImageReceiver.ImageReceiverDelegate {
    public final /* synthetic */ qy a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ MessageObject c;
    public final /* synthetic */ ry d;

    public py(ry ryVar, qy qyVar, boolean z10, MessageObject messageObject) {
        this.d = ryVar;
        this.a = qyVar;
        this.b = z10;
        this.c = messageObject;
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public final void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        qy qyVar = this.a;
        if (qyVar.r.getLottieAnimation() != null) {
            qyVar.r.getLottieAnimation().L(0, false, true);
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public final /* synthetic */ void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.i5.a(this, i10, str, drawable);
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public final void onAnimationReady(ImageReceiver imageReceiver) {
        MessageObject messageObject;
        if (this.b && (messageObject = this.c) != null && messageObject.isAnimatedAnimatedEmoji() && imageReceiver.getLottieAnimation() != null && imageReceiver.getLottieAnimation().x == null) {
            try {
                this.d.C.performHapticFeedback(3, 1);
            } catch (Exception unused) {
            }
        }
    }
}
