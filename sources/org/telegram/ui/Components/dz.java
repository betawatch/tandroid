package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.view.Surface;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class dz implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ gz b;

    public /* synthetic */ dz(gz gzVar, int i10) {
        this.a = i10;
        this.b = gzVar;
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
                gz.a(this.b);
                break;
            default:
                gz gzVar = this.b;
                px pxVar = gzVar.b0;
                SurfaceTexture surfaceTexture = gzVar.x;
                k61 k61Var = (k61) pxVar.b;
                if (k61Var.a != null) {
                    k61Var.a.y0(new Surface(surfaceTexture));
                    break;
                }
                break;
        }
    }
}
