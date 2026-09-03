package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class fo implements ImageReceiver.ImageReceiverDelegate {
    public boolean a;
    public final /* synthetic */ vf.g b;
    public final /* synthetic */ ho c;

    public fo(vf.i iVar, vf.g gVar) {
        this.c = iVar;
        this.b = gVar;
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public final void didSetImageBitmap(int i10, String str, Drawable drawable) {
        hj0 hj0Var;
        lf.g gVar;
        if (this.a) {
            return;
        }
        if ((i10 == 0 || i10 == 3) && drawable != null) {
            this.a = true;
            boolean z4 = drawable instanceof hj0;
            vf.g gVar2 = this.b;
            if (z4 && (gVar = (hj0Var = (hj0) drawable).A0) != null && gVar.g()) {
                hj0Var.z0 = new eo(0, this, gVar2);
            } else {
                ho.a(this.c);
                gVar2.run();
            }
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public final /* synthetic */ void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.j5.b(this, imageReceiver);
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public final void didSetImage(ImageReceiver imageReceiver, boolean z4, boolean z10, boolean z11) {
    }
}
