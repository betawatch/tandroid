package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class to implements ImageReceiver.ImageReceiverDelegate {
    public boolean a;
    public final /* synthetic */ jg.g b;
    public final /* synthetic */ vo c;

    public to(jg.j jVar, jg.g gVar) {
        this.c = jVar;
        this.b = gVar;
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public final void didSetImageBitmap(int i10, String str, Drawable drawable) {
        yj0 yj0Var;
        ag.k kVar;
        if (this.a) {
            return;
        }
        if ((i10 == 0 || i10 == 3) && drawable != null) {
            this.a = true;
            boolean z10 = drawable instanceof yj0;
            jg.g gVar = this.b;
            if (z10 && (kVar = (yj0Var = (yj0) drawable).B0) != null && kVar.g()) {
                yj0Var.A0 = new so(0, this, gVar);
            } else {
                vo.a(this.c);
                gVar.run();
            }
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public final /* synthetic */ void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.p5.b(this, imageReceiver);
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public final void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
    }
}
