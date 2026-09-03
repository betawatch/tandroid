package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.view.Surface;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class uz implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xz b;

    public /* synthetic */ uz(xz xzVar, int i10) {
        this.a = i10;
        this.b = xzVar;
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
                xz.b(this.b);
                break;
            default:
                xz xzVar = this.b;
                hv hvVar = xzVar.Y;
                SurfaceTexture surfaceTexture = xzVar.w;
                x61 x61Var = (x61) hvVar.b;
                if (x61Var.a != null) {
                    x61Var.a.T(new Surface(surfaceTexture));
                    break;
                }
                break;
        }
    }
}
