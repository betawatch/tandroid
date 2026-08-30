package org.telegram.ui;

import android.graphics.Bitmap;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class at implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ pt b;

    public /* synthetic */ at(pt ptVar, int i10) {
        this.a = i10;
        this.b = ptVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.c0 = null;
                break;
            case 1:
                pt ptVar = this.b;
                ptVar.A.setImageBitmap((Bitmap) null);
                org.telegram.ui.Components.hd0 hd0Var = ptVar.C;
                if (hd0Var != null) {
                    hd0Var.a();
                    ptVar.z.removeView(ptVar.C);
                    ptVar.C = null;
                    break;
                }
                break;
            default:
                this.b.Q.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(420L).setInterpolator(org.telegram.ui.Components.nr.h).start();
                break;
        }
    }
}
