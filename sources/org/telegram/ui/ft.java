package org.telegram.ui;

import android.graphics.Bitmap;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class ft implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ tt b;

    public /* synthetic */ ft(tt ttVar, int i10) {
        this.a = i10;
        this.b = ttVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.c0 = null;
                break;
            case 1:
                tt ttVar = this.b;
                ttVar.A.setImageBitmap((Bitmap) null);
                org.telegram.ui.Components.pd0 pd0Var = ttVar.C;
                if (pd0Var != null) {
                    pd0Var.a();
                    ttVar.z.removeView(ttVar.C);
                    ttVar.C = null;
                    break;
                }
                break;
            default:
                this.b.Q.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(420L).setInterpolator(org.telegram.ui.Components.wr.h).start();
                break;
        }
    }
}
