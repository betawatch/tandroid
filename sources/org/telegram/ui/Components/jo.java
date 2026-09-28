package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final class jo implements ImageReceiver.ImageReceiverDelegate {
    public boolean a;
    public final /* synthetic */ hg.h b;
    public final /* synthetic */ lo c;

    public jo(hg.j jVar, hg.h hVar) {
        this.c = jVar;
        this.b = hVar;
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public final void didSetImageBitmap(int i10, String str, Drawable drawable) {
        kj0 kj0Var;
        yf.e eVar;
        if (this.a) {
            return;
        }
        if ((i10 == 0 || i10 == 3) && drawable != null) {
            this.a = true;
            boolean z10 = drawable instanceof kj0;
            hg.h hVar = this.b;
            if (z10 && (eVar = (kj0Var = (kj0) drawable).B0) != null && eVar.g()) {
                kj0Var.A0 = new kd(19, this, hVar);
            } else {
                lo.a(this.c);
                hVar.run();
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
