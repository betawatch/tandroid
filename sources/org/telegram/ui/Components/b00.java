package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.view.Surface;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final /* synthetic */ class b00 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e00 b;

    public /* synthetic */ b00(e00 e00Var, int i10) {
        this.a = i10;
        this.b = e00Var;
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
                e00.b(this.b);
                break;
            default:
                e00 e00Var = this.b;
                tv tvVar = e00Var.b0;
                SurfaceTexture surfaceTexture = e00Var.w;
                z71 z71Var = (z71) tvVar.b;
                if (z71Var.a != null) {
                    z71Var.a.T(new Surface(surfaceTexture));
                    break;
                }
                break;
        }
    }
}
