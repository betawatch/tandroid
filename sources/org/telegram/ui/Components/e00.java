package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.view.Surface;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e00 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h00 b;

    public /* synthetic */ e00(h00 h00Var, int i10) {
        this.a = i10;
        this.b = h00Var;
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
                h00.b(this.b);
                break;
            default:
                h00 h00Var = this.b;
                xv xvVar = h00Var.b0;
                SurfaceTexture surfaceTexture = h00Var.w;
                y71 y71Var = (y71) xvVar.b;
                if (y71Var.a != null) {
                    y71Var.a.T(new Surface(surfaceTexture));
                    break;
                }
                break;
        }
    }
}
