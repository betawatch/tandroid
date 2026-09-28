package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.view.Surface;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
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
                nv nvVar = xzVar.b0;
                SurfaceTexture surfaceTexture = xzVar.w;
                k71 k71Var = (k71) nvVar.b;
                if (k71Var.a != null) {
                    k71Var.a.T(new Surface(surfaceTexture));
                    break;
                }
                break;
        }
    }
}
