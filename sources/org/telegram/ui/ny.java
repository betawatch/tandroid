package org.telegram.ui;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ny implements ImageReceiver.ImageReceiverDelegate {
    public final /* synthetic */ oy a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ MessageObject c;
    public final /* synthetic */ py d;

    public ny(py pyVar, oy oyVar, boolean z10, MessageObject messageObject) {
        this.d = pyVar;
        this.a = oyVar;
        this.b = z10;
        this.c = messageObject;
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public final void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        oy oyVar = this.a;
        if (oyVar.r.getLottieAnimation() != null) {
            oyVar.r.getLottieAnimation().L(0, false, true);
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public final /* synthetic */ void didSetImageBitmap(int i9, String str, Drawable drawable) {
        org.telegram.messenger.g5.a(this, i9, str, drawable);
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
