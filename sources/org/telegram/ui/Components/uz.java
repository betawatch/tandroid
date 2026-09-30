package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.view.Surface;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
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
                ov ovVar = xzVar.b0;
                SurfaceTexture surfaceTexture = xzVar.w;
                k71 k71Var = (k71) ovVar.b;
                if (k71Var.a != null) {
                    k71Var.a.T(new Surface(surfaceTexture));
                    break;
                }
                break;
        }
    }
}
