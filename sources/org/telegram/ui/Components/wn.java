package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class wn implements ImageReceiver.ImageReceiverDelegate {
    public boolean a;
    public final /* synthetic */ pf.h b;
    public final /* synthetic */ yn c;

    public wn(pf.j jVar, pf.h hVar) {
        this.c = jVar;
        this.b = hVar;
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public final void didSetImageBitmap(int i9, String str, Drawable drawable) {
        mi0 mi0Var;
        ff.h hVar;
        if (this.a) {
            return;
        }
        if ((i9 == 0 || i9 == 3) && drawable != null) {
            this.a = true;
            boolean z10 = drawable instanceof mi0;
            pf.h hVar2 = this.b;
            if (z10 && (hVar = (mi0Var = (mi0) drawable).z0) != null && hVar.g()) {
                mi0Var.y0 = new org.telegram.ui.wq(26, this, hVar2);
            } else {
                yn.a(this.c);
                hVar2.run();
            }
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public final /* synthetic */ void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.g5.b(this, imageReceiver);
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public final void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
    }
}
