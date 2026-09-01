package org.telegram.ui;

import android.graphics.Bitmap;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bt implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qt b;

    public /* synthetic */ bt(qt qtVar, int i10) {
        this.a = i10;
        this.b = qtVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.c0 = null;
                break;
            case 1:
                qt qtVar = this.b;
                qtVar.A.setImageBitmap((Bitmap) null);
                org.telegram.ui.Components.jd0 jd0Var = qtVar.C;
                if (jd0Var != null) {
                    jd0Var.a();
                    qtVar.z.removeView(qtVar.C);
                    qtVar.C = null;
                    break;
                }
                break;
            default:
                this.b.Q.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(420L).setInterpolator(org.telegram.ui.Components.pr.h).start();
                break;
        }
    }
}
