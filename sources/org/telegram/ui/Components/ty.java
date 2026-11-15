package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.view.Surface;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class ty implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wy b;

    public /* synthetic */ ty(wy wyVar, int i7) {
        this.a = i7;
        this.b = wyVar;
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
                wy.a(this.b);
                break;
            default:
                wy wyVar = this.b;
                gx gxVar = wyVar.c0;
                SurfaceTexture surfaceTexture = wyVar.x;
                k51 k51Var = (k51) gxVar.b;
                if (k51Var.a != null) {
                    k51Var.a.y0(new Surface(surfaceTexture));
                    break;
                }
                break;
        }
    }
}
