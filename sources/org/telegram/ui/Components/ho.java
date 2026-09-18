package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class ho implements ImageReceiver.ImageReceiverDelegate {
    public boolean a;
    public final /* synthetic */ hg.g b;
    public final /* synthetic */ jo c;

    public ho(hg.i iVar, hg.g gVar) {
        this.c = iVar;
        this.b = gVar;
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public final void didSetImageBitmap(int i10, String str, Drawable drawable) {
        yi0 yi0Var;
        yf.e eVar;
        if (this.a) {
            return;
        }
        if ((i10 == 0 || i10 == 3) && drawable != null) {
            this.a = true;
            boolean z10 = drawable instanceof yi0;
            hg.g gVar = this.b;
            if (z10 && (eVar = (yi0Var = (yi0) drawable).B0) != null && eVar.g()) {
                yi0Var.A0 = new oh(14, this, gVar);
            } else {
                jo.a(this.c);
                gVar.run();
            }
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public final /* synthetic */ void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.h5.b(this, imageReceiver);
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public final void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
    }
}
