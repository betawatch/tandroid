package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.view.Surface;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ez implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hz b;

    public /* synthetic */ ez(hz hzVar, int i9) {
        this.a = i9;
        this.b = hzVar;
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
                hz.b(this.b);
                break;
            default:
                hz hzVar = this.b;
                wu wuVar = hzVar.X;
                SurfaceTexture surfaceTexture = hzVar.w;
                y51 y51Var = (y51) wuVar.b;
                if (y51Var.a != null) {
                    y51Var.a.U(new Surface(surfaceTexture));
                    break;
                }
                break;
        }
    }
}
