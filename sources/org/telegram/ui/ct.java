package org.telegram.ui;

import android.graphics.Bitmap;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ct implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ rt b;

    public /* synthetic */ ct(rt rtVar, int i10) {
        this.a = i10;
        this.b = rtVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.c0 = null;
                break;
            case 1:
                rt rtVar = this.b;
                rtVar.A.setImageBitmap((Bitmap) null);
                org.telegram.ui.Components.sd0 sd0Var = rtVar.C;
                if (sd0Var != null) {
                    sd0Var.a();
                    rtVar.z.removeView(rtVar.C);
                    rtVar.C = null;
                    break;
                }
                break;
            default:
                this.b.Q.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(420L).setInterpolator(org.telegram.ui.Components.tr.h).start();
                break;
        }
    }
}
