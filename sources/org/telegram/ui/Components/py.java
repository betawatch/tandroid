package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.view.Surface;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class py implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ sy b;

    public /* synthetic */ py(sy syVar, int i7) {
        this.a = i7;
        this.b = syVar;
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
                sy.a(this.b);
                break;
            default:
                sy syVar = this.b;
                bx bxVar = syVar.b0;
                SurfaceTexture surfaceTexture = syVar.x;
                h51 h51Var = (h51) bxVar.b;
                if (h51Var.a != null) {
                    h51Var.a.y0(new Surface(surfaceTexture));
                    break;
                }
                break;
        }
    }
}
