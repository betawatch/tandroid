package org.telegram.ui;

import android.graphics.Bitmap;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gt implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ut b;

    public /* synthetic */ gt(ut utVar, int i10) {
        this.a = i10;
        this.b = utVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.c0 = null;
                break;
            case 1:
                ut utVar = this.b;
                utVar.A.setImageBitmap((Bitmap) null);
                org.telegram.ui.Components.fd0 fd0Var = utVar.C;
                if (fd0Var != null) {
                    fd0Var.a();
                    utVar.z.removeView(utVar.C);
                    utVar.C = null;
                    break;
                }
                break;
            default:
                this.b.Q.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(420L).setInterpolator(org.telegram.ui.Components.qr.h).start();
                break;
        }
    }
}
