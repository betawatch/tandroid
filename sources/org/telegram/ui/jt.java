package org.telegram.ui;

import android.graphics.Bitmap;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jt implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xt b;

    public /* synthetic */ jt(xt xtVar, int i10) {
        this.a = i10;
        this.b = xtVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.c0 = null;
                break;
            case 1:
                xt xtVar = this.b;
                xtVar.A.setImageBitmap((Bitmap) null);
                org.telegram.ui.Components.fe0 fe0Var = xtVar.C;
                if (fe0Var != null) {
                    fe0Var.a();
                    xtVar.z.removeView(xtVar.C);
                    xtVar.C = null;
                    break;
                }
                break;
            default:
                this.b.Q.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(420L).setInterpolator(org.telegram.ui.Components.es.h).start();
                break;
        }
    }
}
