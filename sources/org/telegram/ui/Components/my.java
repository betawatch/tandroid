package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.view.Surface;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class my implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ py b;

    public /* synthetic */ my(py pyVar, int i3) {
        this.a = i3;
        this.b = pyVar;
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
                py.a(this.b);
                break;
            default:
                py pyVar = this.b;
                zw zwVar = pyVar.c0;
                SurfaceTexture surfaceTexture = pyVar.x;
                b51 b51Var = (b51) zwVar.b;
                if (b51Var.a != null) {
                    b51Var.a.y0(new Surface(surfaceTexture));
                    break;
                }
                break;
        }
    }
}
