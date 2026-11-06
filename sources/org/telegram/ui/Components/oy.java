package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.view.Surface;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class oy implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ry b;

    public /* synthetic */ oy(ry ryVar, int i7) {
        this.a = i7;
        this.b = ryVar;
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
                ry.a(this.b);
                break;
            default:
                ry ryVar = this.b;
                ax axVar = ryVar.b0;
                SurfaceTexture surfaceTexture = ryVar.x;
                h51 h51Var = (h51) axVar.b;
                if (h51Var.a != null) {
                    h51Var.a.y0(new Surface(surfaceTexture));
                    break;
                }
                break;
        }
    }
}
