package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.view.Surface;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
                i71 i71Var = (i71) mvVar.b;
                if (i71Var.a != null) {
                    i71Var.a.T(new Surface(surfaceTexture));
                    break;
                }
                break;
        }
    }
}
