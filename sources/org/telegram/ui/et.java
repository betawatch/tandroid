package org.telegram.ui;

import android.graphics.Bitmap;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
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
                org.telegram.ui.Components.pd0 pd0Var = stVar.C;
                if (pd0Var != null) {
                    pd0Var.a();
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
