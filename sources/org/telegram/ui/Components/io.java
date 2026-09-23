package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class io implements ImageReceiver.ImageReceiverDelegate {
    public boolean a;
    public final /* synthetic */ hg.h b;
    public final /* synthetic */ ko c;

    public io(hg.j jVar, hg.h hVar) {
        this.c = jVar;
        this.b = hVar;
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
            hg.h hVar = this.b;
            if (z10 && (eVar = (yi0Var = (yi0) drawable).B0) != null && eVar.g()) {
                yi0Var.A0 = new ph(14, this, hVar);
            } else {
                ko.a(this.c);
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
