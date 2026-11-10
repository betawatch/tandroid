package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.view.Surface;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
                i51 i51Var = (i51) axVar.b;
                if (i51Var.a != null) {
                    i51Var.a.y0(new Surface(surfaceTexture));
                    break;
                }
                break;
        }
    }
}
