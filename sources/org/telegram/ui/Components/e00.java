package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.view.Surface;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class e00 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h00 b;

    public /* synthetic */ e00(h00 h00Var, int i10) {
        this.a = i10;
        this.b = h00Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    break;
                }
                break;
            case 1:
                h00.b(this.b);
                break;
            default:
                h00 h00Var = this.b;
                xv xvVar = h00Var.b0;
                SurfaceTexture surfaceTexture = h00Var.w;
                x71 x71Var = (x71) xvVar.b;
                if (x71Var.a != null) {
                    x71Var.a.T(new Surface(surfaceTexture));
                    break;
                }
                break;
        }
    }
}
