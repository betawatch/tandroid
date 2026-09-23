package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.view.Surface;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
                t61 t61Var = (t61) mvVar.b;
                if (t61Var.a != null) {
                    t61Var.a.T(new Surface(surfaceTexture));
                    break;
                }
                break;
        }
    }
}
