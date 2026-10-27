package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.view.Surface;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
                i81 i81Var = (i81) tvVar.b;
                if (i81Var.a != null) {
                    i81Var.a.T(new Surface(surfaceTexture));
                    break;
                }
                break;
        }
    }
}
