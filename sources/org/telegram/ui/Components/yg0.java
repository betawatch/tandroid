package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class yg0 implements ImageReceiver.ImageReceiverDelegate {
    public final /* synthetic */ zg0 a;

    public yg0(zg0 zg0Var) {
        this.a = zg0Var;
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public final /* synthetic */ void didSetImageBitmap(int i9, String str, Drawable drawable) {
        org.telegram.messenger.g5.a(this, i9, str, drawable);
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public final void onAnimationReady(ImageReceiver imageReceiver) {
        vg0 vg0Var = this.a.h.C0;
        if (vg0Var != null) {
            vg0Var.d();
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public final void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
    }
}
