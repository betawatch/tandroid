package org.telegram.ui;

import android.graphics.Bitmap;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
                org.telegram.ui.Components.id0 id0Var = rtVar.C;
                if (id0Var != null) {
                    id0Var.a();
                    rtVar.z.removeView(rtVar.C);
                    rtVar.C = null;
                    break;
                }
                break;
            default:
                this.b.Q.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(420L).setInterpolator(org.telegram.ui.Components.mr.h).start();
                break;
        }
    }
}
