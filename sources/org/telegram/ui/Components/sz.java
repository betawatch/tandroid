package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.view.Surface;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class sz implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ vz b;

    public /* synthetic */ sz(vz vzVar, int i10) {
        this.a = i10;
        this.b = vzVar;
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
                vz.b(this.b);
                break;
            default:
                vz vzVar = this.b;
                mv mvVar = vzVar.b0;
                SurfaceTexture surfaceTexture = vzVar.w;
                l71 l71Var = (l71) mvVar.b;
                if (l71Var.a != null) {
                    l71Var.a.T(new Surface(surfaceTexture));
                    break;
                }
                break;
        }
    }
}
