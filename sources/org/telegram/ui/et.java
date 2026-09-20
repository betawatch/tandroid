package org.telegram.ui;

import android.graphics.Bitmap;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final /* synthetic */ class et implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ st b;

    public /* synthetic */ et(st stVar, int i10) {
        this.a = i10;
        this.b = stVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.c0 = null;
                break;
            case 1:
                st stVar = this.b;
                stVar.A.setImageBitmap((Bitmap) null);
                org.telegram.ui.Components.od0 od0Var = stVar.C;
                if (od0Var != null) {
                    od0Var.a();
                    stVar.z.removeView(stVar.C);
                    stVar.C = null;
                    break;
                }
                break;
            default:
                this.b.Q.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(420L).setInterpolator(org.telegram.ui.Components.qr.h).start();
                break;
        }
    }
}
