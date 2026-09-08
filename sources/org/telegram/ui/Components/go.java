package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class go implements ImageReceiver.ImageReceiverDelegate {
    public boolean a;
    public final /* synthetic */ ig.g b;
    public final /* synthetic */ io c;

    public go(ig.i iVar, ig.g gVar) {
        this.c = iVar;
        this.b = gVar;
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
            ig.g gVar = this.b;
            if (z10 && (eVar = (xi0Var = (xi0) drawable).D0) != null && eVar.g()) {
                xi0Var.C0 = new uc(20, this, gVar);
            } else {
                io.a(this.c);
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
