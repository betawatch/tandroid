package org.telegram.ui;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class iz implements ImageReceiver.ImageReceiverDelegate {
    public final /* synthetic */ jz a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ MessageObject c;
    public final /* synthetic */ kz d;

    public iz(kz kzVar, jz jzVar, boolean z10, MessageObject messageObject) {
        this.d = kzVar;
        this.a = jzVar;
        this.b = z10;
        this.c = messageObject;
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public final void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        jz jzVar = this.a;
        if (jzVar.r.getLottieAnimation() != null) {
            jzVar.r.getLottieAnimation().N(0, false, true);
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public final /* synthetic */ void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.l5.a(this, i10, str, drawable);
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
