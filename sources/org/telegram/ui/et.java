package org.telegram.ui;

import android.graphics.Bitmap;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
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
                org.telegram.ui.Components.gd0 gd0Var = stVar.C;
                if (gd0Var != null) {
                    gd0Var.a();
                    stVar.z.removeView(stVar.C);
                    stVar.C = null;
                    break;
                }
                break;
            default:
                this.b.Q.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(420L).setInterpolator(org.telegram.ui.Components.pr.h).start();
                break;
        }
    }
}
