package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.view.Surface;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
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
                l61 l61Var = (l61) pxVar.b;
                if (l61Var.a != null) {
                    l61Var.a.y0(new Surface(surfaceTexture));
                    break;
                }
                break;
        }
    }
}
