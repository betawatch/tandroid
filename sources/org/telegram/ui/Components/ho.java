package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class ho implements ImageReceiver.ImageReceiverDelegate {
    public boolean a;
    public final /* synthetic */ hg.h b;
    public final /* synthetic */ jo c;

    public ho(hg.j jVar, hg.h hVar) {
        this.c = jVar;
        this.b = hVar;
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public final void didSetImageBitmap(int i10, String str, Drawable drawable) {
        xi0 xi0Var;
        yf.e eVar;
        if (this.a) {
            return;
        }
        if ((i10 == 0 || i10 == 3) && drawable != null) {
            this.a = true;
            boolean z10 = drawable instanceof xi0;
            hg.h hVar = this.b;
            if (z10 && (eVar = (xi0Var = (xi0) drawable).B0) != null && eVar.g()) {
                xi0Var.A0 = new oh(14, this, hVar);
            } else {
                jo.a(this.c);
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
