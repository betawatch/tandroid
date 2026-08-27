package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class un implements ImageReceiver.ImageReceiverDelegate {
    public boolean a;
    public final /* synthetic */ qf.i b;
    public final /* synthetic */ wn c;

    public un(qf.k kVar, qf.i iVar) {
        this.c = kVar;
        this.b = iVar;
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public final void didSetImageBitmap(int i10, String str, Drawable drawable) {
        oi0 oi0Var;
        gf.h hVar;
        if (this.a) {
            return;
        }
        if ((i10 == 0 || i10 == 3) && drawable != null) {
            this.a = true;
            boolean z10 = drawable instanceof oi0;
            qf.i iVar = this.b;
            if (z10 && (hVar = (oi0Var = (oi0) drawable).z0) != null && hVar.g()) {
                oi0Var.y0 = new org.telegram.ui.yq(26, this, iVar);
            } else {
                wn.a(this.c);
                iVar.run();
            }
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public final /* synthetic */ void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.i5.b(this, imageReceiver);
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public final void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
    }
}
