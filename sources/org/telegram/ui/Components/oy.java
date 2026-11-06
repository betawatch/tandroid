package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.view.Surface;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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
                c51 c51Var = (c51) axVar.b;
                if (c51Var.a != null) {
                    c51Var.a.y0(new Surface(surfaceTexture));
                    break;
                }
                break;
        }
    }
}
