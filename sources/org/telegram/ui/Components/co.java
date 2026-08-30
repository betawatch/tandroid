package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class co implements ImageReceiver.ImageReceiverDelegate {
    public boolean a;
    public final /* synthetic */ uf.g b;
    public final /* synthetic */ fo c;

    public co(uf.i iVar, uf.g gVar) {
        this.c = iVar;
        this.b = gVar;
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public final void didSetImageBitmap(int i10, String str, Drawable drawable) {
        gj0 gj0Var;
        lf.g gVar;
        if (this.a) {
            return;
        }
        if ((i10 == 0 || i10 == 3) && drawable != null) {
            this.a = true;
            boolean z4 = drawable instanceof gj0;
            uf.g gVar2 = this.b;
            if (z4 && (gVar = (gj0Var = (gj0) drawable).A0) != null && gVar.g()) {
                gj0Var.z0 = new il(2, this, gVar2);
            } else {
                fo.a(this.c);
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
