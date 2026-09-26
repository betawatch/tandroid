package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.view.Surface;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tz implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wz b;

    public /* synthetic */ tz(wz wzVar, int i10) {
        this.a = i10;
        this.b = wzVar;
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
                wz.b(this.b);
                break;
            default:
                wz wzVar = this.b;
                mv mvVar = wzVar.b0;
                SurfaceTexture surfaceTexture = wzVar.w;
                i71 i71Var = (i71) mvVar.b;
                if (i71Var.a != null) {
                    i71Var.a.T(new Surface(surfaceTexture));
                    break;
                }
                break;
        }
    }
}
