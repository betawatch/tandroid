package org.telegram.ui;

import android.graphics.Bitmap;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
                org.telegram.ui.Components.fd0 fd0Var = ptVar.C;
                if (fd0Var != null) {
                    fd0Var.a();
                    ptVar.z.removeView(ptVar.C);
                    ptVar.C = null;
                    break;
                }
                break;
            default:
                this.b.Q.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(420L).setInterpolator(org.telegram.ui.Components.rr.h).start();
                break;
        }
    }
}
